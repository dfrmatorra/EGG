package com.news.repositorios;

import com.news.entidades.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeccionRepositorio extends JpaRepository<Seccion, String> {
    
    
    
}
