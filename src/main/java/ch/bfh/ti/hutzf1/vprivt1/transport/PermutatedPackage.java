/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bfh.ti.hutzf1.vprivt1.transport;

import java.util.ArrayList;

/**
 *
 * @author fh
 */

public class PermutatedPackage {
    private String id;
    private ArrayList<DrivingTuple> dr = new ArrayList<>();
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void addDrivingTuple(DrivingTuple dr) {
        this.dr.add(dr);
    }
    
    public ArrayList<DrivingTuple> getDrivingTuples() {
        return this.dr;
    }
}
