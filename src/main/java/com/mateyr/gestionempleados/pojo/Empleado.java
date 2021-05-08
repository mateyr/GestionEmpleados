/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.gestionempleados.pojo;

/**
 *
 * @author MateyR
 */
public class Empleado {
 
    private String name;
    private String lastName;
    private String cargo;
    private Integer edad;
    private String cellphone; 

    public Empleado(String name, String lastName, String cargo, Integer edad, String cellphone) {
        this.name = name;
        this.lastName = lastName;
        this.cargo = cargo;
        this.edad = edad;
        this.cellphone = cellphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
                                               
}
