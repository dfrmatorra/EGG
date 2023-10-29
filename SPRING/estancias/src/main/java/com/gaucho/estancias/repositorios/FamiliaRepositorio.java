package com.gaucho.estancias.repositorios;
import com.gaucho.estancias.entidades.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FamiliaRepositorio extends JpaRepository <Familia, String>{

}
