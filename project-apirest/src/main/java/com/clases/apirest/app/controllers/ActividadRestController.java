package com.clases.apirest.app.controllers;

import com.clases.apirest.app.models.entity.Actividad;
import com.clases.apirest.app.models.entity.Usuario;
import com.clases.apirest.app.models.services.IActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ActividadRestController {

    @Autowired
    private IActividadService actividadService;

    @GetMapping("/actividades")
    private List<Actividad> index(){
        return actividadService.findAll();
    }

    @GetMapping("/actividades/{id}")
    public Actividad show(@PathVariable Long id){
        return actividadService.findById(id);
    }

    @PostMapping("/actividades")
    @ResponseStatus(HttpStatus.CREATED)
    public Actividad create(@RequestBody Actividad actividad){
        return actividadService.save(actividad);
    }

    @PutMapping("/actividades/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Actividad update(@RequestBody Actividad actividad, @PathVariable Long id){
        Actividad actividadActual = actividadService.findById(id);
        actividadActual.setNombre(actividad.getNombre());
        actividadActual.setDescripcion(actividad.getDescripcion());
        actividadActual.setDireccion(actividad.getDireccion());
        actividadActual.setFecha(actividad.getFecha());
        return actividadService.save(actividadActual);
    }

    @DeleteMapping("/actividades/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        actividadService.delete(id);
    }
}
