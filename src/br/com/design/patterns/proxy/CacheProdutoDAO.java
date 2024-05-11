package br.com.design.patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProdutoDAO extends ProdutoDAO {
    private static final Map<Long, Object> CACHE = new HashMap<>();

    @Override
    public Object find(int id) {
        Object o = CACHE.get((long) id);
        if(o == null) {
            o = super.find(id);
            CACHE.put((long) id, o);
            System.out.println("Produto com id " + id + " ADICIONADO ao cache");
            return o;
        }
        System.out.println("Produto com id " + id + " ENCONTRADO no cache");
        return o;
    }
}
