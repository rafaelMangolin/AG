/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritims.em.grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class AlgoritimsEmGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> listV = new ArrayList<String>();
        for (Integer i = 0; i < 4; i++) {
            listV.add(i.toString());
        }

        
        List<Arresta> listA = new ArrayList<Arresta>();
        listA.add(new Arresta("1", "0"));
        listA.add(new Arresta("1", "2"));
        listA.add(new Arresta("1", "3"));
        listA.add(new Arresta("2", "0"));
        listA.add(new Arresta("2", "3"));
        
        
        Grafo grafo = new Grafo(listV ,listA);
        
        grafo.imprimirMatriz();
        
    }
    
}
