package com.cadastroproduto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastroproduto.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
