package algoritimo.em.grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rafael
 */
public class GrafoUtils {

    public static ArvoreBusca buscaEmLargura(Grafo g, String verticeInicial) {
        Map<String, List> map = new HashMap<>();
        ArvoreBusca arvoreBusca = new ArvoreBusca();
        List<VerticeLargura> list = new ArrayList<>();
        List<VerticeLargura> listAdjacentes;
        VerticeLargura verticeAux;

        for (String vertice : g.getVertices()) {
            arvoreBusca.addVertice(new VerticeLargura(vertice));
        }
        verticeAux = arvoreBusca.getVertice(verticeInicial);
        setarCinza(verticeAux, 0, null);
        list.add(verticeAux);

        while (!list.isEmpty()) {
            verticeAux = list.remove(0);
            listAdjacentes = converteVertice(g.getLista().get(verticeInicial), arvoreBusca);
            for (VerticeLargura vert : listAdjacentes) {
                if (vert.getEstado() == 1) {
                    setarCinza(vert, (verticeAux.getDistancia()+1), verticeAux.getNome());
                    list.add(vert);
                }
            }
            verticeAux.setEstado(3);

        }

        return arvoreBusca;
    }

    private static List<VerticeLargura> converteVertice(List<String> list, ArvoreBusca arvore) {
        List<VerticeLargura> v = new ArrayList<>();
        for (String list1 : list) {
            v.add(arvore.getVertice(list1));
        }
        return v;
    }

    private static void setarCinza(VerticeLargura vert, int distancia, String pred) {
        vert.setEstado(2);
        vert.setDistancia(distancia);
        vert.setPredescessor(pred);
    }
}
