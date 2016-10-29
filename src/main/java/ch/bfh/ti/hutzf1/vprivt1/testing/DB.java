/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bfh.ti.hutzf1.vprivt1.testing;

/**
 *
 * @author fh
 */
public class DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /* to Service Provider
        1) Vehicles send Round Package to SP
            id
            i
            commit(fki(tag)
            commit(fki(tag_2)
            ...
        2) Vehicles are driving and sending to SP
            random tag
            location
            timestamp
        3) Vehciles send calculated costs
            id
            C
        4) Vehicles send permutated Tags,Cost Tuples
            id
            fki(w1)
            commit(c1)
            fki(w2)
            commit(c2)
        5) bi = 0
            id
            dki
            dci1
            dci2
            ...
            dcim
        6) bi = 1
            id
            dvi1
            dvi2
            dvin
            Di
        
        
        
        */
    }
   
    
}
