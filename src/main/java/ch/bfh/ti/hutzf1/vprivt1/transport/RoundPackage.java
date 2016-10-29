/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bfh.ti.hutzf1.vprivt1.transport;

import ch.bfh.unicrypt.math.algebra.general.interfaces.Element;
import java.util.ArrayList;

/**
 *
 * @author fh
 */

public class RoundPackage {
    private String id;
    private int i;
    private Element key;
    private ArrayList<Element> hashes = new ArrayList<>();
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setRound(int i) {
        this.i = i;
    }
    
    public int getRound() {
        return this.i;
    }
    
    public void setKey(Element key) {
        this.key = key;
    }
    
    public Element getKey() {
        return this.key;
    }
    
    public void addCommit(Element commit) {
        hashes.add(commit);
    }
    
    public ArrayList<Element> getCommits() {
        return hashes;
    }
}