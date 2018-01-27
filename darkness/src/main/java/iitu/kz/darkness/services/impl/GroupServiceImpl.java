package iitu.kz.darkness.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iitu.kz.darkness.dao.GroupDao;
import iitu.kz.darkness.entities.Group;
import iitu.kz.darkness.services.GroupService;

@Service
@Transactional
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupDao dao;
    
    @Override
    public Group save(Group entity) {
        return dao.save(entity);
    }

    @Override
    public Group update(Group entity) {
        return dao.update(entity);
    }

    @Override
    public boolean delete(Group entity) {
        return dao.delete(entity);
    }

    @Override
    public List<Group> findAll() {
        return dao.findAll();
    }

}
