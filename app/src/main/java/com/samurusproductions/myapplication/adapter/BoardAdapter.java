package com.samurusproductions.myapplication.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.samurusproductions.myapplication.R;

import java.util.ArrayList;

/**
 * Created by Julius on 10.06.2018.
 */

public class BoardAdapter extends BaseAdapter {
    private ArrayList<String> listCountry;
    private ArrayList<Integer> listFlag;
    private Activity activity;

    public BoardAdapter(Activity activity,ArrayList<String> listCountry, ArrayList<Integer> listFlag) {
        super();
        this.listCountry = listCountry;
        this.listFlag = listFlag;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listCountry.size();
    }

    @Override
    public Object getItem(int i){return listCountry.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder view;
        LayoutInflater inflator = activity.getLayoutInflater();

        if(convertView==null)
        {
            view = new ViewHolder();
            convertView = inflator.inflate(R.layout.cell, null);

            view.txtViewTitle = (TextView) convertView.findViewById(R.id.textView1);
            view.imgViewFlag = (ImageView) convertView.findViewById(R.id.imageView1);

            convertView.setTag(view);
        }
        else
        {
            view = (ViewHolder) convertView.getTag();
        }

        view.txtViewTitle.setText(listCountry.get(position));
        view.imgViewFlag.setImageResource(listFlag.get(position));

        return convertView;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

    public static class ViewHolder
    {
        public ImageView imgViewFlag;
        public TextView txtViewTitle;
    }
}
