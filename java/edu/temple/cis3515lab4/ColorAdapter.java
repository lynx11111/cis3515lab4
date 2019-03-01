package edu.temple.cis3515lab4;

import android.content.Context;
import android.graphics.Color;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Locale;


public class ColorAdapter extends BaseAdapter {
    String[] colors;
    Context context;
    String[] colons;


    public ColorAdapter(Context context, String[] colors, String[] colons){
        this.colors = colors;
        this.context = context;
        this.colons = colons;


    }



    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView ;
        if(convertView instanceof TextView){
            textView = (TextView)convertView;
        }
        else{
            textView = new TextView(context);
        }


        String setColorText = colors[position];
        String sacco = colons[position];
        String setColorBG = colors[position];
        if (Locale.getDefault().getLanguage().equals("en")){
            textView.setText(setColorText);
        }
        else{
            textView.setText(sacco);
        }

        textView.setBackgroundColor(Color.parseColor(setColorBG));
        return textView;
    }
}
