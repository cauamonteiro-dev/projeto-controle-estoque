package br.com.caua.projeto_controle_estoque.repository;

import br.com.caua.projeto_controle_estoque.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
