package com.cadastroproduto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cadastroproduto.entities.Produto;
import com.cadastroproduto.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository pr;
	
	///<S extends T> S save(S entity)
	public <Prod extends Produto> Prod save(Prod prod){
		return pr.save(prod);
	}
	
	public List<Produto> findAll(){
		return pr.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> obj = pr.findById(id);
		return obj.get();
	}
	
	public void deleteById(Long id) {
		pr.deleteById(id);
	}
	
	public Produto update(Long id, Produto produto) {
		Produto prodUpdate = pr.save(produto);
		return pr.save(prodUpdate);
	}
	
	
}
