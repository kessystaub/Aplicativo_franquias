package com.example.trabalho_android;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.trabalho_android.models.Franquias;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FranquiaAdapter extends BaseAdapter{
    Activity context;
    ArrayList<Franquias> franquias;
    private static LayoutInflater inflater = null;

    public FranquiaAdapter(Activity context, ArrayList<Franquias> franquias){
        this.context = context;
        this.franquias = franquias;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return franquias.size();
    }

    @Override
    public Franquias getItem(int position) {
        return franquias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        itemView = (itemView == null) ? inflater.inflate(R.layout.list_item,null): itemView;
        TextView textViewName = (TextView) itemView.findViewById(R.id.textViewName);
        TextView textViewDescription = (TextView) itemView.findViewById(R.id.textViewDescription);
        ImageView imageViewProfile = (ImageView) itemView.findViewById(R.id.imageViewProfile);
        Franquias selectedFranquia = franquias.get(position);
        textViewName.setText(selectedFranquia.name);
        textViewDescription.setText(selectedFranquia.description);
        int imageID = context.getResources().getIdentifier(selectedFranquia.imageProfileName, "drawable", context.getPackageName());
        imageViewProfile.setImageResource(imageID);
        return itemView;
    }
}
