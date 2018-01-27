package iitu.kz.darkness.ui.plan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import iitu.kz.darkness.entities.Speciality;
import iitu.kz.darkness.services.GroupService;
import iitu.kz.darkness.services.SpecialityService;
import iitu.kz.darkness.ui.base.AbstractBasePresenter;

public class PlanWindowPresenter extends AbstractBasePresenter{

    @Autowired
    private SpecialityService serviceSpec;
    
    @Autowired
    private GroupService serviceGroup;

    public List<Speciality> getAllSpeciality() {
        return serviceSpec.findAll();        
    }
    
}
