package com.clases.apirest.app.models.dao;

import com.clases.apirest.app.models.entity.Actividad;
import org.springframework.data.repository.CrudRepository;

public interface IActividadDao extends CrudRepository<Actividad, Long> {
}
