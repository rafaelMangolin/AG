package algoritimo.em.grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class GrafoUtils {

    
    //Algoritmos usados para a busca em largura
    
    public static ArvoreLargura buscaEmLargura(Grafo g, String verticeInicial) {
        ArvoreLargura arvoreBusca = new ArvoreLargura();
        List<Vertice> list = new ArrayList<>();
        List<Vertice> listAdjacentes;
        Vertice verticeAux;

        for (String vertice : g.getVertices()) {
            arvoreBusca.addVertice(new Vertice(vertice));
        }
        verticeAux = arvoreBusca.getVertice(verticeInicial);
        setarCinza(verticeAux, 0, null);
        list.add(verticeAux);

        while (!list.isEmpty()) {
            verticeAux = list.remove(0);
//            System.out.println(verticeAux.getNome());
            listAdjacentes = converteVertice(g.getLista().get(verticeAux.getNome()), arvoreBusca);
//            System.out.println(verticeAux.getNome());
            for (Vertice vert : listAdjacentes) {
//                System.out.println(vert.getNome()+" "+vert.getEstado());
                if (vert.getEstado() == 1) {
                    setarCinza(vert, (verticeAux.getDistancia()+1), verticeAux.getNome());
                    list.add(vert);
                }
            }
            verticeAux.setEstado(3);

        }

        return arvoreBusca;
    }

    private static List<Vertice> converteVertice(List<String> list, ArvoreLargura arvore) {
        List<Vertice> v = new ArrayList<>();
//        System.out.println(list);
        for (String list1 : list) {
            v.add(arvore.getVertice(list1));
        }
        return v;
    }

    private static void setarCinza(Vertice vert, int distancia, String pred) {
        vert.setEstado(2);
        vert.setDistancia(distancia);
        vert.setPredescessor(pred);
    }
    // Final dos métodos utilizados para a Busca em largura
    public static ArvoreProfundidade buscaProfundidade(Grafo g, String verticeInicial){
        
        
        return null;
    }
}
