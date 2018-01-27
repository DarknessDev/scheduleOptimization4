package iitu.kz.darkness.services;

import java.util.List;

import iitu.kz.darkness.entities.Group;

public interface GroupService {
    Group save(Group entity);

    Group update(Group entity);

    boolean delete(Group entity);

    List<Group> findAll();
}
