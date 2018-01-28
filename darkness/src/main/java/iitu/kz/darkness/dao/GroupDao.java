package iitu.kz.darkness.dao;

import java.util.List;

import iitu.kz.darkness.dao.generic.BaseDao;
import iitu.kz.darkness.entities.Groups;

public interface GroupDao  extends BaseDao<Groups, Long> {

    List<Groups> getGroupsBySpecId(long specId);
    
}
