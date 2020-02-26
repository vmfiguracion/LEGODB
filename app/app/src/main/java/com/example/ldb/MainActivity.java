package com.example.ldb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import legodatabase.*;

public class MainActivity extends AppCompatActivity {

    private LegoPieceEntry lpe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.lpe = new LegoPieceEntry(this);

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

    }
}
