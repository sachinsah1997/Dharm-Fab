package com.example.sachin.dharm_fab;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

//import static com.example.sachin.dharm_fab.R.id.tvImageName;

/**
 * Created by NgocTri on 3/11/2017.
 */

public class EnquiryListAdapter extends ArrayAdapter<ImageUpload> {
    private Activity context;
    private int resource;
    private List<ImageUpload> listImage;

    public EnquiryListAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<ImageUpload> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        listImage = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View v = inflater.inflate(resource, null);
        TextView  description= (TextView) v.findViewById(R.id.desc);
        TextView phone = (TextView) v.findViewById(R.id.phone);
        TextView name = (TextView) v.findViewById(R.id.name);
        ImageView url = (ImageView) v.findViewById(R.id.url);

        description.setText(listImage.get(position).getAddress());
        phone.setText(listImage.get(position).getPhone());
        name.setText(listImage.get(position).getName());


        Glide.with(context).load(listImage.get(position).getUrl()).into(url);

        return v;

    }
}
