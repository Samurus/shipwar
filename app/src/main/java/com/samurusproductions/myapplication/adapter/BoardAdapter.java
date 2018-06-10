package com.samurusproductions.myapplication.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.samurusproductions.myapplication.model.Cell;

/**
 * Created by Julius on 10.06.2018.
 */

public class BoardAdapter extends BaseAdapter {
    private final Context mContext;
    private final Cell[] cells;

    public BoardAdapter(Context context, Cell[] cells) {
        this.mContext = context;
        this.cells = cells;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
