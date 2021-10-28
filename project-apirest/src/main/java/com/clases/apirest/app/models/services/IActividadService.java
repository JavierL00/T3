package com.clases.apirest.app.models.services;

import com.clases.apirest.app.models.entity.Actividad;

import java.util.List;

public interface IActividadService {
    List<Actividad> findAll();
    Actividad findById(Long id);
    Actividad save(Actividad actividad);
    void delete(Long id);
}
