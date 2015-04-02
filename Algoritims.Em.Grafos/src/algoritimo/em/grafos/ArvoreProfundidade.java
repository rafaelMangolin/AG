/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimo.em.grafos;

import java.util.ArrayList;
import java.util.List;

public class ArvoreProfundidade {
    List<Vertice> list = new ArrayList<>();
    List<Aresta> retorno = new ArrayList<>();
    List<Aresta> avanco = new ArrayList<>();
    List<Aresta> cruzamento = new ArrayList<>();

    public List<Vertice> getList() {
        return list;
    }

    public void setList(List<Vertice> list) {
        this.list = list;
    }

    public List<Aresta> getRetorno() {
        return retorno;
    }

    public void setRetorno(Aresta a) {
        this.retorno.add(a);
    }

    public List<Aresta> getAvanco() {
        return avanco;
    }

    public void setAvanco(Aresta a) {
        this.avanco.add(a);
    }

    public List<Aresta> getCruzamento() {
        return cruzamento;
    }

    public void setCruzamento(Aresta a) {
        this.cruzamento.add(a);
    }
    
}
