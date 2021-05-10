/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.gestionempleados.controllers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mateyr.gestionempleados.Panel.PnlTree;
import com.mateyr.gestionempleados.Panel.dlgArea;
import com.mateyr.gestionempleados.pojo.Area;
import com.mateyr.gestionempleados.pojo.Empleado;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
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
    private Gson gson;
    private List<Empleado> empleados;
    private List<String> areaNames;
    
    public List<Area> getAreas() {
        return areas;
    }
     
    
    private dlgArea dlgArea;
    private dlgAreaController dlgAreaController;

    public PnlTreeController(PnlTree pnlTree) {
        this.pnlTree = pnlTree;
        InitComponet();
    }
    
    public void InitComponet(){
        areaNames = new ArrayList<>();
        areas = new ArrayList();
        gson = new Gson();
          
        SetTreeModelFromJson();
        
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
    
    private void SetTreeModelFromJson(){
        JsonReader jreader = new JsonReader(new BufferedReader(
                            new InputStreamReader(getClass().getResourceAsStream("/Json/EmpleadosData.json"))));
        
        Type listType = new TypeToken<ArrayList<Empleado>>(){}.getType();
        
        empleados = gson.fromJson(jreader, listType);         
        
        root = new DefaultMutableTreeNode("Areas",true);
        treeModel = new DefaultTreeModel(root);
        
        empleados.stream().forEach((t) -> {
          String areaNameTemp = t.getArea();
          if(areaNames.contains(areaNameTemp)){
              return;
          }else{
              areaNames.add(areaNameTemp);
          }
        });
        
        areaNames.stream().forEach(((t) -> {
            Area area = new Area(t);
            areas.add(area);
        }));
        
        areas.stream().forEach((t) -> {
            treeModel.insertNodeInto(new DefaultMutableTreeNode(t.getAreaName()), root, root.getChildCount());
        });
        
        pnlTree.getTreeArea().setModel(treeModel);
    }
        
}

