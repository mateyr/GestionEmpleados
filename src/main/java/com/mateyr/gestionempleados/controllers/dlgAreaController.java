/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.gestionempleados.controllers;

import com.mateyr.gestionempleados.Panel.dlgArea;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author MateyR
 */
public class dlgAreaController {
    private dlgArea dlgArea;

    public dlgAreaController(dlgArea dlgArea) {
        this.dlgArea = dlgArea;
        InitComponent();
    }
    
    private void InitComponent(){
       
        dlgArea.getBtnSave().addActionListener((evt) -> {
            btnSaveActionPerformed(evt);
        });
        
    }
    
    private void btnSaveActionPerformed(ActionEvent evt){
    
      
        if (dlgArea.getTxtName().getText().equalsIgnoreCase("") || dlgArea.getTxtCode().getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this.dlgArea,"Te falta Algo");
        }else{
            int save = JOptionPane.showConfirmDialog(this.dlgArea, "Do you want to Save this as an Area");
               
            if(save == 1){
                dlgArea.getTxtName().setText("");
                dlgArea.getTxtCode().setText("");
            }else{
                
                dlgArea.dispose();
            }
           
        }
                  
    }
      
    
}
