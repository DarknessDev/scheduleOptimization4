package iitu.kz.darkness.ui;

import org.springframework.beans.factory.annotation.Autowired;

import iitu.kz.darkness.entities.Group;
import iitu.kz.darkness.entities.Speciality;
import iitu.kz.darkness.services.GroupService;
import iitu.kz.darkness.services.SpecialityService;
import iitu.kz.darkness.ui.base.AbstractBasePresenter;

public class MainWindowPresenter extends AbstractBasePresenter{

    @Autowired
    private SpecialityService serviceSpec;
    
//    @Autowired
//    private GroupService serviceGroup;

    public void addSpeciality(String specName) {
        Speciality spec = new Speciality();
        spec.setName(specName);
        serviceSpec.save(spec);
    }

    public void addGroup(String groupName) {
        Group group = new Group();
        group.setName(groupName);
//        service.save(group);
    }
}
