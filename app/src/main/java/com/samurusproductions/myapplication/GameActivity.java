package com.samurusproductions.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.samurusproductions.myapplication.adapter.BoardAdapter;
import com.samurusproductions.myapplication.model.Cell;

import java.util.ArrayList;

/**
 * Created by Julius on 10.06.2018.
 */

public class GameActivity extends AppCompatActivity {

    private BoardAdapter boardAdapter;
    private ArrayList<Cell> listCell = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        prepareList();

        // prepared arraylist and passed it to the Adapter class
        boardAdapter = new BoardAdapter(this,listCell);

        // Set custom adapter to gridview
        final GridView gridView  = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(boardAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View cell, int position, long unused) {
                ((Cell) adapterView.getAdapter().getItem(position)).setImageId(R.drawable.german);
                BoardAdapter boardAdapter = ((BoardAdapter) adapterView.getAdapter());
                boardAdapter.notifyDataSetChanged();
                gridView.invalidateViews();
                gridView.setAdapter(boardAdapter);
            }
        });
    }



    public void prepareList()
    {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.listCell.add(new Cell(x, y, "test",R.layout.cell));
            }
        }
    }
}
