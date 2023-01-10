package br.com.estudandoemcasa.loja.repository;

import br.com.estudandoemcasa.loja.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Alguns blogs, estava descrito o uso de algumas anottations,
 * e dizia que, algumas, são apenas para deixar mais verboso o
 * códig e que também seria apenas para didática
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
