package com.samurusproductions.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Selection;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.samurusproductions.myapplication.adapter.BoardAdapter;
import com.samurusproductions.myapplication.model.Cell;

/**
 * Created by Julius on 10.06.2018.
 */

public class GameBoardActivity extends AppCompatActivity  implements
        AdapterView.OnItemClickListener {
    Button button;

    private static final Cell[] cells = { new Cell()
           };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setVisibility(View.GONE);
                            }
        });


        GridView gridView = (GridView)findViewById(R.id.gridView);
        BoardAdapter boardAdapter = new BoardAdapter(this, cells);
        gridView.setAdapter(boardAdapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // TODO Auto-generated method stub
        //Selection.setImageResource(items[arg2]);
    }
}
