package com.example.andor.Enum;

public enum PlacementPlayer {

    RANK("Placez les joueurs sur la case de leur rang"),
    ZERO("Placez les joueurs sur la case 0"),
    DICE("Placez les joueurs avec deux dés (rouge : dizaine, dé du joueur : unité)");

    private String placement;

    PlacementPlayer(String plc) {
        this.placement = plc;
    }

    public String getString() {
        return placement;
    }
}
