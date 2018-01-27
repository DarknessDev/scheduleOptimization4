package iitu.kz.darkness.dao.impl;

import org.springframework.stereotype.Repository;

import iitu.kz.darkness.dao.GroupDao;
import iitu.kz.darkness.dao.generic.AbstractBaseDao;
import iitu.kz.darkness.entities.Group;

@Repository
public class GroupDaoImpl extends AbstractBaseDao<Group, Long> implements GroupDao{

    public GroupDaoImpl(){
        this.type=Group.class;
    }
}
