package com.clases.apirest.app.models.services;

import com.clases.apirest.app.models.dao.IActividadDao;
import com.clases.apirest.app.models.entity.Actividad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ActividadServiceImpl implements IActividadService{

    @Autowired
    private IActividadDao actividadDao;

    @Override
    @Transactional
    public List<Actividad> findAll(){
        return (List<Actividad>) actividadDao.findAll();
    }

    @Override
    @Transactional
    public Actividad findById(Long id) {
        return actividadDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Actividad save(Actividad actividad) {
        return actividadDao.save(actividad);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        actividadDao.deleteById(id);
    }
}
