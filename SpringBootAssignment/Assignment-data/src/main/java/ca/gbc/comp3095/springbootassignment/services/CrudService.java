package ca.gbc.comp3095.springbootassignment.services;

import java.util.Set;

public interface CrudService <T,ID>{
    T findById(ID id);
    T save(T object);
    Set<T> findALl();
    void delete(T object);
    void deleteById(ID id);
}
