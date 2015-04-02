/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo.em.grafos;

/**
 *
 * @author rafael
 */
public class VerticeLargura {
    private String nome;
    private int estado; //1-branco , 2-cinza, 3-preto
    private String predescessor;
    private int distancia;

    public VerticeLargura(String nome) {
        this.nome = nome;
        this.estado = 1; //1-branco , 2-cinza, 3-preto
        this.predescessor = null;
        this.distancia = Integer.MAX_VALUE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getPredescessor() {
        return predescessor;
    }

    public void setPredescessor(String predescessor) {
        this.predescessor = predescessor;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    
}
