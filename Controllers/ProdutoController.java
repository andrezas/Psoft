package Controllers;

import Services.ProdutoService;

public class ProdutoController {

    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = new ProdutoService();
    }

    public void criarProduto(String nome, String fabricante, double preco){
        this.service.criarProduto(nome, fabricante, preco);
    }

}
