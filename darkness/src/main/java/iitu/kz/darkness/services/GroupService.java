package iitu.kz.darkness.services;

import java.util.List;

import iitu.kz.darkness.entities.Groups;

public interface GroupService {
    Groups save(Groups entity);

    Groups update(Groups entity);

    boolean delete(Groups entity);

    List<Groups> findAll();
}
