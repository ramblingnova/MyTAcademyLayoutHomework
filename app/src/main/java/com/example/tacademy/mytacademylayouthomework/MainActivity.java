package com.example.tacademy.mytacademylayouthomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFrameLayout(View view) {
        Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
        startActivity(intent);
    }

    public void onGridLayout(View view) {
        Intent intent = new Intent(MainActivity.this, GridLayoutActivity.class);
        startActivity(intent);
    }

    public void onLinearLayout(View view) {
        Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void onRelativeLayout(View view) {
        Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
        startActivity(intent);
    }

    public void onTableLayout(View view) {
        Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
        startActivity(intent);
    }
}
