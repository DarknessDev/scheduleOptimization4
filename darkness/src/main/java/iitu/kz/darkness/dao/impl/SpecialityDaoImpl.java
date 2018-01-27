package iitu.kz.darkness.dao.impl;

import org.springframework.stereotype.Repository;

import iitu.kz.darkness.dao.SpecialityDao;
import iitu.kz.darkness.dao.generic.AbstractBaseDao;
import iitu.kz.darkness.entities.Speciality;

@Repository
public class SpecialityDaoImpl extends AbstractBaseDao<Speciality, Long> implements SpecialityDao{

    public SpecialityDaoImpl(){
        this.type=Speciality.class;
    }
    

}
