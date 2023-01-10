package br.com.estudandoemcasa.loja.config;

import br.com.estudandoemcasa.loja.entities.Categoria;
import br.com.estudandoemcasa.loja.entities.Produto;
import br.com.estudandoemcasa.loja.repository.ProdutoRepository;
import br.com.estudandoemcasa.loja.servico.impl.CategoriaServiceIMPL;
import br.com.estudandoemcasa.loja.servico.impl.ProdutoServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class ApplicationConfig implements CommandLineRunner {
    @Autowired
    private ProdutoServiceIMPL serviceIMPL;

    @Autowired
    private CategoriaServiceIMPL categoriaServiceIMPL;

    @Override
    public void run(String... args) {
        Categoria categoria = new Categoria(null, "Eletrônicos");
        categoriaServiceIMPL.cadastrarCategoria(categoria);
        Produto produto = new Produto(null, "Notebook", "Lenovo", new BigDecimal(2500), categoria);
        serviceIMPL.cadastrarProduto(produto);
        serviceIMPL.listaProdutos().stream().forEach(System.out::println);
        categoriaServiceIMPL.listaCategorias().stream().forEach(System.out::println);
    }
}
