package com.zgzszj.techcollect;

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

    public void openBarChart(View v){
        startActivity(new Intent(this,BarChartActivity.class));
    }

    public void openPieChart(View v){
        startActivity(new Intent(this,PieChartActivity.class));
    }

}
