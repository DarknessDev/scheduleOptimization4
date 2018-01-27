package iitu.kz.darkness.services;

import java.util.List;

import iitu.kz.darkness.entities.Speciality;

public interface SpecialityService {
    Speciality save(Speciality entity);

    Speciality update(Speciality entity);

    boolean delete(Speciality entity);

    List<Speciality> findAll();
}
