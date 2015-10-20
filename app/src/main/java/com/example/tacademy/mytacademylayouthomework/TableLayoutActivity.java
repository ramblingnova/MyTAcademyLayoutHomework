package com.example.tacademy.mytacademylayouthomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        setTitle("월");
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.tableLayoutActionBarColor));
    }
}
