package com.cadastroproduto.testConfig;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cadastroproduto.entities.Produto;
import com.cadastroproduto.repositories.ProdutoRepository;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner {

	@Autowired
	private ProdutoRepository pr;
	
	@Override
	public void run(String... args) throws Exception {

		Produto p1 = new Produto(null, "Galaxy S10", "Samsung", "Made in China", 1800.00);
		Produto p2 = new Produto(null, "Motorola Razr", "Motorola", "Made in China", 1700.00);
		Produto p3 = new Produto(null, "A2 Lite", "Xiaomi", "Made in China", 990.00);
		Produto p4 = new Produto(null, "Iphone 10", "Apple", "Made in USA", 4000.00);
		
		pr.saveAll(Arrays.asList(p1, p2, p3, p4));
		
		
		
	}

	
	
}
