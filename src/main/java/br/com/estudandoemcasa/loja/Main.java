package br.com.estudandoemcasa.loja;

import br.com.estudandoemcasa.loja.entities.Produto;
import br.com.estudandoemcasa.loja.servico.impl.ProdutoServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
@Configuration
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ProdutoServiceIMPL produtoService = new ProdutoServiceIMPL();

        SpringApplication.run(Main.class, args);

        Produto produto = new Produto();
        produto.setId(1L);
        produto.setNome("Notebook");
        produto.setDescricao("Lenovo");
        produto.setPreco(new BigDecimal(2500));

        System.out.println(produtoService.cadastrarProduto(produto));

    }
}