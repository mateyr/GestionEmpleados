/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.gestionempleados.controllers;

import com.mateyr.gestionempleados.Panel.PnlTree;
import com.mateyr.gestionempleados.Panel.dlgArea;
import com.mateyr.gestionempleados.pojo.Area;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MateyR
 */
public class PnlTreeController {
    private PnlTree pnlTree;
    private List<Area> areas;
    private DefaultTreeModel treeModel;
    private DefaultMutableTreeNode root;
    
    private dlgArea dlgArea;
    private dlgAreaController dlgAreaController;

    public PnlTreeController(PnlTree pnlTree) {
        this.pnlTree = pnlTree;
        InitComponet();
    }
    
    public void InitComponet(){
       
        areas = new ArrayList<>();    
                
        root = new DefaultMutableTreeNode("Areas",true);
        treeModel = new DefaultTreeModel(root);
        
        pnlTree.getTreeArea().setModel(treeModel);
        
        pnlTree.getBtnAddArea().addActionListener((ActionEvent evt) -> {
            btnAddAreaActionPerformed(evt);
        });
        
    }
    
    private void btnAddAreaActionPerformed(ActionEvent evt){
       dlgArea = new dlgArea(null, true);
       dlgAreaController = new dlgAreaController(dlgArea); 
       dlgArea.setVisible(true);
       String areaName = dlgArea.getTxtName().getText();
       String code = dlgArea.getTxtCode().getText();
       
       if(areaName.equalsIgnoreCase("")  || code .equalsIgnoreCase("")){
        return;   
       }
       
       treeModel.insertNodeInto(new DefaultMutableTreeNode(areaName), root,root.getChildCount());
       
       Area area = new Area(areaName, code);
       areas.add(area);
            
    }

}
