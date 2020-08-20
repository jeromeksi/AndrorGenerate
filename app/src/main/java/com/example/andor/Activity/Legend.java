package com.example.andor.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.andor.Model.DataLegend;
import com.example.andor.R;

public class Legend extends AppCompatActivity  implements MyAdapter.ItemClickListener {

    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend);
        Intent iin= getIntent();
        Bundle bundle = iin.getExtras();
        if(bundle != null)
        {
            DataLegend DL =  (DataLegend) bundle.getSerializable( "DataLegend");


            // set up the RecyclerView
            RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            mAdapter = new MyAdapter(this, DL.sections);
            mAdapter.setClickListener(this);
            recyclerView.setAdapter(mAdapter);
        }

    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, this.mAdapter.getSection(position).name, Toast.LENGTH_SHORT).show();
    }
}
