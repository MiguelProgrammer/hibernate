package br.com.estudandoemcasa.loja.servico.impl;

import br.com.estudandoemcasa.loja.entities.Categoria;
import br.com.estudandoemcasa.loja.repository.CategoriaRepository;
import br.com.estudandoemcasa.loja.servico.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.estudandoemcasa.loja.constants.Constants.INSERINDO_CATEGORIA;
import static br.com.estudandoemcasa.loja.constants.Constants.LISTANDO_CATEGORIA;

@Slf4j
@Service
public class CategoriaServiceIMPL implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria cadastrarCategoria(Categoria categoria) {
        Categoria cat = categoriaRepository.save(categoria);
        log.info(INSERINDO_CATEGORIA + cat.getId());
        return cat;
    }

    @Override
    public List<Categoria> listaCategorias() {
        log.info(LISTANDO_CATEGORIA);
        return categoriaRepository.findAll();
    }
}
