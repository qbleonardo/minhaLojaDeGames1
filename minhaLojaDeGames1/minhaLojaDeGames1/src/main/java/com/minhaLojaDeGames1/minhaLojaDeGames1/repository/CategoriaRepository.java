package com.minhaLojaDeGames1.minhaLojaDeGames1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames1.minhaLojaDeGames1.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByGeneroContainingIgnoreCase(String genero);

	
}