package com.LooneyTunes.dao;

import com.LooneyTunes.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC MASTER
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long> {

}
