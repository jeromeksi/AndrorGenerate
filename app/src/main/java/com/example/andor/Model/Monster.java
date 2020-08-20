package com.example.andor.Model;

import com.example.andor.Enum.TypeMonster;

public class Monster {
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
    public String GetDescription()
    {
        String desc = "Placez un "+ type;
        if(pos != -1)
            desc += " sur la case "+pos;
        else
            desc += " choisir la position avec deux dé (rouge : dizaine, dé joueur: unité) ";

        if(specialite != null)
            desc+= " (Règle : "+specialite+")";
        return  desc;
    }
}
