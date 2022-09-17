package com.bankinformationjobs.service;


import com.bankinformationjobs.domain.entity.Profesional;
import com.bankinformationjobs.service.dto.ProfesionalDto;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProfesionalService  {

    ResponseEntity<ProfesionalDto> crearProfesional(ProfesionalDto profesionalDto);

     Page<ProfesionalDto>  listarProfesionalesPaginados(Integer pageSize, Integer pageNumber);

     List<Profesional> leerTodosProfesionals();

     ResponseEntity<Profesional> actualizarProfesional(Profesional profesional);

     List<Profesional> getProfesionalPorNombre(String nombreProfesional);

     void eliminarProfesional(Long id);
}
