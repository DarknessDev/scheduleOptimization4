package iitu.kz.darkness.ui;

import org.springframework.beans.factory.annotation.Autowired;

import iitu.kz.darkness.entities.Groups;
import iitu.kz.darkness.entities.Speciality;
import iitu.kz.darkness.services.GroupService;
import iitu.kz.darkness.services.SpecialityService;
import iitu.kz.darkness.ui.base.AbstractBasePresenter;

public class MainWindowPresenter extends AbstractBasePresenter{

    @Autowired
    private SpecialityService serviceSpec;
    
    @Autowired
    private GroupService serviceGroup;

    public Speciality addSpeciality(String specName) {
        Speciality spec = new Speciality();
        spec.setName(specName);
        return serviceSpec.save(spec);
    }

    public void addGroup(long currSpecId, String groupName) {
        Groups group = new Groups();
        group.setSpec_id(currSpecId);
        group.setName(groupName);
        serviceGroup.save(group);
    }
}
