package com.example.andor.Model;

import java.io.Serializable;

public class Section implements Serializable {

    public int ordre; //Correspond au lettre
    public String name;

    public String story;
    public String modificationRule;
    public String objectif;

    public String player;
    public Monster[] listMonster;

    public String titre;
}