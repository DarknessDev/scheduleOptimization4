package iitu.kz.darkness.ui;

import org.springframework.beans.factory.annotation.Autowired;

import iitu.kz.darkness.entities.Speciality;
import iitu.kz.darkness.services.SpecialityService;
import iitu.kz.darkness.ui.base.AbstractBasePresenter;

public class MainWindowPresenter extends AbstractBasePresenter{

    @Autowired
    private SpecialityService service;

    public void addSpeciality(String specName) {
        Speciality spec = new Speciality();
        spec.setName(specName);
        service.save(spec);
    }
}
