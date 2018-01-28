package iitu.kz.darkness.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import iitu.kz.darkness.dao.GroupDao;
import iitu.kz.darkness.dao.generic.AbstractBaseDao;
import iitu.kz.darkness.entities.Groups;

@Repository
public class GroupDaoImpl extends AbstractBaseDao<Groups, Long> implements GroupDao{

    public GroupDaoImpl(){
        this.type=Groups.class;
    }

    @Override
    public List<Groups> getGroupsBySpecId(long specId) {
        Session session = getCurrentSession();
        Criteria criteria = session.createCriteria(type);
        List<Groups> list = session.createQuery("from Groups where SPEC_ID = :specId").setParameter("specId", specId).list();
        
        return list;  
        
    }
}
