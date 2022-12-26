package br.com.estudandoemcasa.loja.servico.impl;

import br.com.estudandoemcasa.loja.entities.Produto;
import br.com.estudandoemcasa.loja.repository.ProdutoRepository;
import br.com.estudandoemcasa.loja.servico.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProdutoServiceIMPL implements ProdutoService {

    private ProdutoRepository produtoRepository;
    @Override
    public Boolean cadastrarProduto(Produto produto) {

        log.info("\nProduto aqui: " + produto.getDescricao() + "\n");

        Produto inseriu = produtoRepository.saveAndFlush(produto);
        log.info("Produto salvo em banco: " + inseriu);
        return inseriu.getDescricao().isEmpty();
    }
}
