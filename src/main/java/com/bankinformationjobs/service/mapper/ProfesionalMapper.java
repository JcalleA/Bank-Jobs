package com.bankinformationjobs.service.mapper;

import com.bankinformationjobs.domain.entity.Profesional;
import com.bankinformationjobs.service.dto.ProfesionalDto;

public class ProfesionalMapper {

    public static ProfesionalDto getProfesionalDtoFromProfesional(Profesional profesional) {
        if(profesional == null) {
            return null;
        }
        ProfesionalDto dto = new ProfesionalDto();
        dto.setIdProfesional(profesional.getIdProfesional());
        dto.setNombre(profesional.getNombre());
        dto.setApellido(profesional.getApellido());
        dto.setProfesion(profesional.getProfesion());
        dto.setTelefono(profesional.getTelefono());
        dto.setCorreo(profesional.getCorreo());
        dto.setCiudad(profesional.getCiudad());
        dto.setBarrio(profesional.getBarrio());
        dto.setDireccion(profesional.getDireccion());
        dto.setImageUrl(profesional.getImageUrl());

        return dto;
    }

    public static Profesional getProfesionalFromProfesionalDto(ProfesionalDto profesionalDto) {
        if (profesionalDto == null) {
            return null;
        }

        Profesional profesional = new Profesional();
        profesional.setIdProfesional(profesionalDto.getIdProfesional());
        profesional.setNombre(profesionalDto.getNombre());
        profesional.setApellido(profesionalDto.getApellido());
        profesional.setProfesion(profesionalDto.getProfesion());
        profesional.setTelefono(profesionalDto.getTelefono());
        profesional.setCorreo(profesionalDto.getCorreo());
        profesional.setCiudad(profesionalDto.getCiudad());
        profesional.setBarrio(profesionalDto.getBarrio());
        profesional.setDireccion(profesional.getDireccion());
        profesional.setImageUrl(profesionalDto.getImageUrl());

        return profesional;
    }
}
