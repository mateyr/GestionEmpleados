/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.gestionempleados.controllers;

import com.mateyr.gestionempleados.MainView.frmAppDemo;
import com.mateyr.gestionempleados.Panel.PnlTable;
import com.mateyr.gestionempleados.Panel.PnlTree;
import java.awt.event.ActionEvent;
import javax.swing.Action;

/**
 *
 * @author MateyR
 */
public class frmAppDemoController {
    private frmAppDemo appDemo;
    private PnlTable pnlTable;
    private PnlTableController pnlTableController;
    
    private PnlTree pnlTree;
    private PnlTreeController pnlTreeController;
    
    
    
    public frmAppDemoController(frmAppDemo appDemo) {
        this.appDemo = appDemo;
        InitComponets();
    }

    public PnlTreeController getPnlTreeController() {
        return pnlTreeController;
    }
      
    
    public void InitComponets(){
        pnlTable = new PnlTable();
        pnlTableController = new PnlTableController(pnlTable);
        
        pnlTree = new PnlTree();
        pnlTreeController = new PnlTreeController(pnlTree);
        
        appDemo.getPnlTreeArea().add(pnlTree);
        appDemo.getPnlEmpleadoTable().add(pnlTable);
        
          appDemo.getBtnAdd().addActionListener((e) -> {
           btnAddActionPerformed(e);
       });
    }

    private void btnAddActionPerformed(ActionEvent e) {
        pnlTreeController.getAreas().stream().forEach((t) -> {
            System.out.println(t.getAreaName());
        });
        
       int selected = pnlTree.getTreeArea().getSelectionCount();
       
       
       
    }
    
    
    
    
  
}
