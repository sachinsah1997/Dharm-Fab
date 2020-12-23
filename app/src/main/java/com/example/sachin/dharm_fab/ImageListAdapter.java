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

public class ImageListAdapter extends ArrayAdapter<ImageUpload> {
    private Activity context;
    private int resource;
    private List<ImageUpload> listImage;

    public ImageListAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<ImageUpload> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        listImage = objects;
    }


    @Override
    public int getCount() {
        return listImage.size();
    }

    @Override
    public ImageUpload getItem(int position) {

        return listImage.get(getCount() - position - 1);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View v = inflater.inflate(resource, null);
        TextView qualityshow = (TextView) v.findViewById(R.id.qualityshow);
        TextView rateshow = (TextView) v.findViewById(R.id.rateshow);
        TextView lengthshow = (TextView) v.findViewById(R.id.lengthshow);
        TextView widthshow = (TextView) v.findViewById(R.id.widthshow);
        TextView moq = (TextView) v.findViewById(R.id.moq);

        ImageView url = (ImageView) v.findViewById(R.id.url);

        qualityshow.setText(listImage.get(position).getQuality());
        rateshow.setText(listImage.get(position).getRate());
        lengthshow.setText(listImage.get(position).getLength());
        widthshow.setText(listImage.get(position).getWidth());
        moq.setText(listImage.get(position).getMinorder());


        Glide.with(context).load(listImage.get(position).getUrl()).into(url);

        return v;

    }
}
