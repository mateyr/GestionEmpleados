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
public class Area {
    private String areaName;
    private String code;
    private List<Empleado> empleados;

    public Area(String areaName) {
        this.areaName = areaName;
    }
     
    public Area(String areaName, String code, List<Empleado> empleados) {
        this.areaName = areaName;
        this.code = code;
        this.empleados = empleados;
    }

    public Area(String areaName, String code) {
         this.areaName = areaName;
         this.code = code;
    }
    
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    
    
}
