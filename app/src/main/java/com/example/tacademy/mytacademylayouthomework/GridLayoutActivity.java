package com.example.tacademy.mytacademylayouthomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        setTitle("번호수동입력");
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.gridLayoutActionBarColor));
    }
}
