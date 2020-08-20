package com.example.andor.Model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataLegend  implements Serializable{
    public List<Section> sections;

    public DataLegend() {
        sections = new ArrayList<Section>();
    }


}
