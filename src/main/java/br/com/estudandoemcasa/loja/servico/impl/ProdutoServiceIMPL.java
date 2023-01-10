package br.com.estudandoemcasa.loja.servico.impl;

import br.com.estudandoemcasa.loja.constants.Constants;
import br.com.estudandoemcasa.loja.entities.Produto;
import br.com.estudandoemcasa.loja.repository.ProdutoRepository;
import br.com.estudandoemcasa.loja.servico.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.estudandoemcasa.loja.constants.Constants.INSERINDO_PRODUTO;
import static br.com.estudandoemcasa.loja.constants.Constants.LISTANDO_PRODUTO;

@Slf4j
@Service
public class ProdutoServiceIMPL implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Override
    public Produto cadastrarProduto(Produto produto) {
        Produto prod = produtoRepository.save(produto);
        log.info(INSERINDO_PRODUTO + prod.getId());
        return prod;
    }

    @Override
    public List<Produto> listaProdutos() {
        log.info(LISTANDO_PRODUTO);
        return produtoRepository.findAll();
    }

}
