package ca.gbc.comp3095.springbootassignment.services.map;

import ca.gbc.comp3095.springbootassignment.model.Recipe;

import java.util.Set;

public class RecipeServiceMap extends AbstractMapService<Recipe, Long> {
    @Override
    public Recipe findById(Long id) {

        return super.findById(id);
    }
    @Override
    public Recipe save(Recipe object) {
        return super.save(object.getId(), object);
    }


    @Override
    public Set<Recipe> findAll() {

        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(Recipe object) {

        super.delete(object);
    }
}
