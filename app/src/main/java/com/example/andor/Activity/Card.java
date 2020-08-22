package com.example.andor.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.andor.Model.DataLegend;
import com.example.andor.Model.Section;
import com.example.andor.R;

public class Card extends AppCompatActivity {

    private Section section;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);


        Intent iin= getIntent();
        Bundle bundle = iin.getExtras();
        if(bundle != null)
        {
            section =  (Section) bundle.getSerializable( "Section");
            Populate();

        }
    }
    private void Populate()
    {
        TextView tvMonster =  findViewById(R.id.tvMonster);
        String textMonster = "";
        for(int i = 0; i<section.listMonster.length;i++)
        {
            textMonster += "\n" + section.listMonster[i].toString();
        }
        tvMonster.setText(textMonster);
    }
}