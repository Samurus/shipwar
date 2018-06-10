package com.samurusproductions.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.samurusproductions.myapplication.adapter.BoardAdapter;
import com.samurusproductions.myapplication.model.Cell;

import java.util.ArrayList;

/**
 * Created by Julius on 10.06.2018.
 */

public class GameActivity extends AppCompatActivity  implements
        AdapterView.OnItemClickListener {

    private BoardAdapter mAdapter;
    private ArrayList<Cell> listCell = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new BoardAdapter(this,listCell);

        // Set custom adapter to gridview
        GridView gridView  = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(GameActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
