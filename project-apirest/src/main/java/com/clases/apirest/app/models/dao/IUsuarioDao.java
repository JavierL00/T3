package com.clases.apirest.app.models.dao;

import com.clases.apirest.app.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
}
