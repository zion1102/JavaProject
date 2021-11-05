package ca.gbc.comp3095.springbootassignment.bootstrap;
import ca.gbc.comp3095.springbootassignment.model.Recipe;
import ca.gbc.comp3095.springbootassignment.services.RecipeService;
import ca.gbc.comp3095.springbootassignment.services.map.RecipeServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.Set;


@Component
public class DataLoader implements CommandLineRunner {

    private RecipeService recipeService;

    public DataLoader() {
        recipeService = new RecipeServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Recipe recipe1 = new Recipe();
        recipe1.setName("Fried Chicken");
        String [] ingArray = new String[]{"Chicken","Flour","eggs","Vegetable oil"};
        recipe1.setIngredients(ingArray);
        recipe1.setInstructions("Put flour and cracked eggs in too seperate bowls. Then Put oil in a pan or put and let it boil." +
                "After this dip the chicken into the flour then the eggs then back into the flour. " +
                "Once chicken is coated properly put it in your boiling oil and wait for about 5-10 minutes. " +
                "Following this take it out and wait for it to cool then enjoy.");
        recipeService.save(recipe1);

        Recipe recipe2 = new Recipe();
        recipe2.setName("Medium Rare Ribeye and roasted potatoes");
        String [] ingArray2 = new String[]{"Ribeye","Potatoes","garlic"};
        recipe2.setIngredients(ingArray2);
        recipe2.setInstructions("Firstly set to oven to pre heat to 350 degrees and then put a pan onthe stove to get hot." +
                " While this is happening you are going to want to begin" +
                "cutting your potatoes into cube like shapes. Once you have finished cutting your potatoes, season them generously then " +
                "put int on a baking dish with some crushed garlic. Put the tray in the preheated oven for about 30 minutes. During this time " +
                "you are to season your ribeye. Once your pan on the stove put the ribeye in and leave it for about 2-5 minutes on each side. " +
                        "After this let steak sit for about 5 minutes then enjoy.");
        recipeService.save(recipe2);

        System.out.println("Loaded Recipes.....");
    }
}
