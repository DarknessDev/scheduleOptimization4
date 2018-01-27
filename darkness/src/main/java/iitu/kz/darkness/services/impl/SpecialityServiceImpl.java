package iitu.kz.darkness.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iitu.kz.darkness.entities.Speciality;
import iitu.kz.darkness.services.SpecialityService;

@Service
@Transactional
public class SpecialityServiceImpl implements SpecialityService{

    @Autowired
    private SpecialityService dao;

    @Override
    public Speciality save(Speciality entity) {
        return dao.save(entity);
    }

    @Override
    public Speciality update(Speciality entity) {
        return dao.update(entity);
    }

    @Override
    public boolean delete(Speciality entity) {
        return dao.delete(entity);
    }

    @Override
    public List<Speciality> findAll() {
        return dao.findAll();
    }

}
