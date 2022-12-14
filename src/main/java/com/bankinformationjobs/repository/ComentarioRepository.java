package com.bankinformationjobs.repository;

import com.bankinformationjobs.domain.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {

    @Query(value = "SELECT COUNT (Comentario) FROM Comentario  comentario")
    Integer countAllComentarios();
}
