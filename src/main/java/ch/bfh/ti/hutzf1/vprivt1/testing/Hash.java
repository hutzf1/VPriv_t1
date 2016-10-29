/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bfh.ti.hutzf1.vprivt1.testing;

import ch.bfh.ti.hutzf1.vprivt1.crypto.PedersenScheme;
import ch.bfh.unicrypt.math.algebra.dualistic.classes.ZModPrime;
import ch.bfh.unicrypt.math.algebra.general.classes.ProductGroup;
import ch.bfh.unicrypt.math.algebra.general.classes.Tuple;
import ch.bfh.unicrypt.math.algebra.general.interfaces.Element;
import ch.bfh.unicrypt.math.algebra.general.interfaces.Group;
import ch.bfh.unicrypt.math.function.classes.HashFunction;
import ch.bfh.unicrypt.math.function.interfaces.Function;

/**
 *
 * @author fh
 */
public class Hash {

    public static void main(String[] args) {
        // Create randomization -> Element
        // One Way function -> f(Element)
        // Commit -> commit(f(Element))
        
        PedersenScheme ps = new PedersenScheme();
        Element tag = ps.getTag();
        System.out.println(tag.convertToString());
        System.out.println(tag.toString());
        
        example1();
        
    }
    
    public static void example1() {
        // Generate product group Z23^10 and random element
        Group z23 = ZModPrime.getInstance(23);
        ProductGroup pg = ProductGroup.getInstance(z23, 10);
        Tuple tuple = pg.getRandomElement();

        // Define hash function Z23^10 -> {0,1}^256 (default SHA256)
        Function function = HashFunction.getInstance(pg);

        // Apply hash function to tuple (return finite byte array)
        Element hashValue = function.apply(tuple);

        System.out.println(function.toString());
        System.out.println(tuple.toString());
        System.out.println(hashValue.toString());
    }    
}
