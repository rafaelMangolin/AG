/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritims.em.grafos;

import java.util.List;

/**
 *
 * @author rafael
 */
public class Grafo {

    private List<String> vertices;
    private List<Arresta> arrestas;
    private int matriz[][];

    public Grafo(List<String> vertices, List<Arresta> arrestas) {
        this.vertices = vertices;
        this.arrestas = arrestas;

        this.matriz = gerarMatriz();
    }

    public List<String> getVertices() {
        return vertices;
    }

    public void setVertices(List<String> vertices) {
        this.vertices = vertices;
    }

    public List<Arresta> getArrestas() {
        return arrestas;
    }

    public void setArrestas(List<Arresta> arrestas) {
        this.arrestas = arrestas;
    }

    public void imprimirMatriz() {
        System.out.println("Matriz de Adjacência:\n");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("     " + i);
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("______");
        }
            System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i + "   |");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"     ");
            }
            System.out.println("");
        }
    }

    private int[][] gerarMatriz() {
        int aux = this.vertices.size();
        int matriz[][] = new int[aux][aux];

        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < aux; j++) {
                matriz[i][j] = 0;
            }
        }

        for (Arresta a : arrestas) {
            String s = a.getX();
            String v = a.getY();
            int x = Integer.parseInt(s);
            int y = Integer.parseInt(v);
            matriz[x][y] = 1;
            matriz[y][x] = 1;
        }
        return matriz;
    }
}
