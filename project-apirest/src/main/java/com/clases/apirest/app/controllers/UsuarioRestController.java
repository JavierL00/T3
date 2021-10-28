package com.clases.apirest.app.controllers;

import com.clases.apirest.app.models.entity.Usuario;
import com.clases.apirest.app.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    private List<Usuario> index(){
        return usuarioService.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario show(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id){
        Usuario usuarioActual = usuarioService.findById(id);
        usuarioActual.setNombre(usuario.getNombre());
        usuarioActual.setApellido(usuario.getApellido());
        usuarioActual.setTelefono(usuario.getTelefono());
        usuarioActual.setEmail(usuario.getEmail());
        return usuarioService.save(usuarioActual);
    }

    @DeleteMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
