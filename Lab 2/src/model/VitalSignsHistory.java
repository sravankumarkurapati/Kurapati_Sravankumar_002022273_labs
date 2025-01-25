/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 * The purpose of this class to below activities
 * 1. To store history of Vitals. 
 * 2. Provide methods to add Vitals, delete Vitals and get history of vitals
 * @author sravankumarkurapati
 * @version 1.0
 * @since 2025-01-24
 */
public class VitalSignsHistory {
    
    ArrayList<VitalSigns> history;
    
    /**
     * This is a constructor which will create new ArrayList of VitalSigns when object of VitalSignsHistory is created
     */
    public VitalSignsHistory(){
        history = new ArrayList<VitalSigns>();
    }
    
    /**
     * The purpose of this method is to add newVitals information to history and return new Vitals created
     * @return  VitalSigns
     */
    public VitalSigns addNewVitals(){
        VitalSigns newVs = new VitalSigns();
        history.add(newVs);
        return newVs;
    }
    
    /**
     * The purpose of this method is to remove VitalSigns for a given object of VitalSigns from history
     * @param VitalSigns  
     */
    public void removeVitalSigns(VitalSigns vs){
        history.remove(vs);
    }
    
    /**
     * The purpose of this method is get the history of VitalSigns
     * @return 
     */
    public ArrayList<VitalSigns> getHistory(){
        return history;
    }
}
