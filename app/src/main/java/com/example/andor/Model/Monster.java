package com.example.andor.Model;

import com.example.andor.Enum.TypeMonster;
import com.example.andor.R;

import java.io.Serializable;

import static android.provider.Settings.System.getString;

public class Monster implements Serializable {
    public TypeMonster type;
    public int pos=-1;
    public String specialite;

    public Monster(TypeMonster tm)
    {
        this.type = tm;
    }
    public Monster(TypeMonster tm, int pos)
    {
        this.type = tm;
        this.pos = pos;
    }
    public Monster(TypeMonster tm, int pos,String spec)
    {
        this.type = tm;
        this.pos = pos;
        this.specialite =spec;
    }

    @Override
    public String toString()
    {
        String desc = "Placez un"+ type;

        if(pos != -1)
            desc += " sur la case "+pos;
        else
            desc += " choisir la position avec deux dé (rouge : dizaine, dé joueur: unité) ";

        if(specialite != null)
            desc+= " (Règle : "+specialite+")";
        return  desc;
    }
}
