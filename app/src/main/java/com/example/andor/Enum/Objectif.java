package com.example.andor.Enum;

public enum Objectif {

    INVESTIGATION_FIRE_WOOD("Vous devez ",Zone.WOODS,1),
    INVESTIGATION_FIRE_FOREST(),
    INVESTIGATION_FIRE_HILL(),
    INVESTIGATION_FIRE_FARM(),
    INVESTIGATION_FIRE_FIELD(),
    INVESTIGATION_FIRE_RIVER(),


    private String objectif;
    private Zone zone;
    private int nomberCase;

    Objectif(String obj,Zone z,int nb) {
        this.objectif = obj;
        this.zone = z;
        this.nomberCase = nb;
    }

    public String getObjectif() {
        return objectif;
    }
    public Zone getZone() {
        return zone;
    }
    public int getNomberCase() {
        return nomberCase;
    }
}
