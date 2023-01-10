package br.com.estudandoemcasa.loja.servico;

import br.com.estudandoemcasa.loja.entities.Produto;

import java.util.List;

public interface ProdutoService {
    Produto cadastrarProduto(Produto produto);
    List<Produto> listaProdutos();
}
