/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo.em.grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class ArvoreBusca {
    private List<VerticeLargura> arvore = new ArrayList<>();

    public boolean addVertice(VerticeLargura vertice){
        return arvore.add(vertice);
    }
    
    public int size(){
        return arvore.size();
    }
    
    public VerticeLargura getVertice(String nome){
        for (VerticeLargura vertice : arvore) {
            if(vertice.getNome().equalsIgnoreCase(nome)){
                return vertice;
            }
        }
        return null;
    }
    
    public void imprimirCaminho(String nome){
         VerticeLargura vert = getVertice(nome);
         
         while(vert.getPredescessor() == null){
             System.out.print(vert.getNome()+"   ");
             vert = getVertice(vert.getPredescessor());
             System.out.println(vert.getNome());
         }
         
    }
}
