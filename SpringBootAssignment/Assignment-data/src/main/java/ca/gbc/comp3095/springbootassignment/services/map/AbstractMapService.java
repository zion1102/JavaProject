package ca.gbc.comp3095.springbootassignment.services.map;

import ca.gbc.comp3095.springbootassignment.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public abstract class AbstractMapService<T extends Recipe, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    T findById(ID id){return map.get(id);}

    T save(T object){
        if(object!=null){
            if (object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    Set<T> findAll(){
        return new HashSet<>( map.values());
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id){
        map.remove(id);
    }

    private Long getNextId(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet())+1;


        }catch (NoSuchElementException e){
            nextId =1L;
        }
        return nextId;
    }
}
