package com.example.andor.Enum;

public enum Zone {

    NORTH("Nord",new int []{15,9,8}),
    FOREST("Forest", new int []{47,48,49,50,51,52,53,54,55,56,50,58,59,60,62,63} ),
    WOODS("Bois", new int[]{24,22,23,25,  }),
    HOUSE("Habitation",new int[]{32,19,72,28,40,64,24}),
    FIELD("Champs", new int []{28,64}),
    BRIDGE("Pont", new int []{38,39,16,48,47,46}),
    RIVER("Rivière", new int []{12,13,16,32,38,28,29,30,33,31,27,26,49,48,46,44,42,39,40,41}),
    MOUNTAIN("Montagne", new int []{84,82,81,70,69,68,67,66,61}),
    CASTLE("Chateau", new int []{0}),
    CITIES("Ville", new int []{0,71,57}),
    PLACE("Place marchande", new int []{0,71,57,18}),
    HILL("Colline", new int []{37}),
    RUIN("Ruine", new int []{15,17}),
    WELL("Puits",new int[]{5,25,55,45}),
    NEAR_CASTLE("Proche du chateau",new int[]{ 16,10,20,19,18,36,38,28,72,22,24,23,25,34,29,30,33,31,32,35,27,26}),
    NEAR_DWARF("Proche des nains",new int[]{ }),
    SOUTH("Sud",new int[]{26,27,31,32,30,29,34,35,25});


    private String zone;
    private int[] poss;

    Zone(String name,int[] pos) {
        this.zone = name;
        this.poss = pos;
    }

    public String getZone() {
        return zone;
    }
    public int[] getPos() {
        return poss;
    }
}
