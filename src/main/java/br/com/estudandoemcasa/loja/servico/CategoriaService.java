package br.com.estudandoemcasa.loja.servico;

import br.com.estudandoemcasa.loja.entities.Categoria;
import br.com.estudandoemcasa.loja.entities.Produto;

import java.util.List;

public interface CategoriaService {
    Categoria cadastrarCategoria(Categoria categoria);
    List<Categoria> listaCategorias();
}
