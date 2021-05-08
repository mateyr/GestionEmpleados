/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.gestionempleados.pojo;

import java.util.List;

/**
 *
 * @author MateyR
 */
public class Empresa {
    private String name;
    private List<Area> areas;

    public Empresa(String name, List<Area> areas) {
        this.name = name;
        this.areas = areas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
        
}
