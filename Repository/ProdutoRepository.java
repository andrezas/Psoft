package Repository;

import Entities.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {

    private Map<Integer, Produto> produtos;

    public ProdutoRepository(Map<Integer, Produto> produtos) {
        this.produtos = new HashMap<>();
    }

    public void addProduto (Produto newProduto){
        this.produtos.put(newProduto.hashCode(), newProduto);
    }

}
