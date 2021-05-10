/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.gestionempleados.controllers;

import com.mateyr.gestionempleados.MainView.frmAppDemo;
import com.mateyr.gestionempleados.Panel.dlgAddEmploye;
import com.mateyr.gestionempleados.pojo.Area;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 *
 * @author MateyR
 */
public class dlgAddEmployeController {
    private dlgAddEmploye dlgAddEmploye;
    private frmAppDemo appDemo;
    private List<Area> areas;
    public dlgAddEmployeController(dlgAddEmploye dlgAddEmploye) {
        this.dlgAddEmploye = dlgAddEmploye; 
        InitComponet();
    }

    private void InitComponet(){
        
       
       dlgAddEmploye.getBtnSave().addActionListener((e) -> {
           btnSaveActionPerformed(e);
       });
        
     
    }  
    
    
    private void btnSaveActionPerformed(ActionEvent evt){
        System.out.println("No sirve "); 
        areas.stream().forEach((t) -> {
           System.out.println(t.getAreaName());
       });
    }
    
    
}
