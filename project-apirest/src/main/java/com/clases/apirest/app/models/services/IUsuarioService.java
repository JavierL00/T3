package com.clases.apirest.app.models.services;

import com.clases.apirest.app.models.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    Usuario save(Usuario usuario);
    void delete(Long id);
}
