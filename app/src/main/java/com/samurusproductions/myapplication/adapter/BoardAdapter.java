package com.samurusproductions.myapplication.adapter;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.samurusproductions.myapplication.R;
import com.samurusproductions.myapplication.model.Cell;

import java.util.ArrayList;

/**
 * Created by Julius on 10.06.2018.
 */

public class BoardAdapter extends BaseAdapter {
    private ArrayList<Cell> listCell;
    private Activity activity;

    public BoardAdapter(Activity activity, ArrayList<Cell> listCell) {
        super();
        this.listCell = listCell;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listCell.size();
    }

    @Override
    public Object getItem(int i) {
        return listCell.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder view;
        LayoutInflater inflater = activity.getLayoutInflater();

        if (convertView == null) {
            view = new ViewHolder();
            convertView = inflater.inflate(R.layout.cell, null);

            view.imageView = convertView.findViewById(R.id.imageViewRow);

            convertView.setTag(view);
        } else {
            Toast.makeText(activity, String.valueOf(((ViewHolder) convertView.getTag()).imageView), Toast.LENGTH_SHORT).show();
        }

        return convertView;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

    public static class ViewHolder {
        public ImageView imageView;
    }
}
