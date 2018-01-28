package iitu.kz.darkness.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iitu.kz.darkness.dao.GroupDao;
import iitu.kz.darkness.entities.Groups;
import iitu.kz.darkness.services.GroupService;

@Service
@Transactional
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupDao dao;
    
    @Override
    public Groups save(Groups entity) {
        return dao.save(entity);
    }

    @Override
    public Groups update(Groups entity) {
        return dao.update(entity);
    }

    @Override
    public boolean delete(Groups entity) {
        return dao.delete(entity);
    }

    @Override
    public List<Groups> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Groups> getGroupsBySpecId(long specId) {
        return dao.getGroupsBySpecId(specId);
    }

}
