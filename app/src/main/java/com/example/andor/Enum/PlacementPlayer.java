package com.example.andor.Enum;

public enum PlacementPlayer {

    RANK("Placez les joueurs sur la case de leur rang"),
    CASTLE("Placez les joueurs dans le chateau (case 0)"),
    FOREST("Placez les joueurs sur l'arbre ancien (case 57)"),
    MINE("Placez les joueurs dans la cité naine (case 71)"),
    CHOICE("Chaque joueur choisi sa case de départ où il veux"),
    DICE("Placez les joueurs avec deux dés (rouge : dizaine, dé du joueur : unité)");

    private String placement;

    PlacementPlayer(String plc) {
        this.placement = plc;
    }

    public String getString() {
        return placement;
    }
}
