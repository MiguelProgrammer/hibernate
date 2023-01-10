package br.com.estudandoemcasa.loja.repository;

import br.com.estudandoemcasa.loja.entities.Categoria;
import br.com.estudandoemcasa.loja.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
