package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// @Component quando é uma classe mais génerica
// @Service para classes de serviço
// @Repository = transação com base da dados
// @Controller = classe com endPoints

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
    // Dentro do <> estou passando a tabela que ele vai pegar
}
