package Services;

import Entities.Produto;
import Repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository repository;
    private Integer id;

    public ProdutoService(ProdutoRepository repository, Integer id) {
        this.repository = new ProdutoRepository();
    }

    public void criarProduto(String nome, String fabricante, double preco){
        Produto newProduto = new Produto(nome, fabricante, preco);
        this.repository.addProduto(newProduto);
    }
}
