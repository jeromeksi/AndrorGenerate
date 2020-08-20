package com.example.andor.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.andor.Controler.GenerateLegend;
import com.example.andor.Model.DataLegend;
import com.example.andor.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ProgressBar spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.button).setOnClickListener(this);
    }


    public  void onClick(View v)
    {
        if(v == findViewById(R.id.button))
        {
            Intent intent = new Intent(MainActivity.this,Legend.class);

            GenerateLegend GL = new GenerateLegend();
            DataLegend DL = GL.Generate();

            intent.putExtra("DataLegend",DL);

            startActivity(intent);

        }
    }
}