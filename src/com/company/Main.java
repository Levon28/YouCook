package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.*;




public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<String> ingredientsName = new ArrayList<>();
        ingredientsName.add("Apple");
        ingredientsName.add("Milk");
        ingredientsName.add("Potato");
        ingredientsName.add("Tomato");
        ingredientsName.add("Pineapple");
        ingredientsName.add("Peach");
        ingredientsName.add("Cabbage");
        ingredientsName.add("Green Apple");
        ingredientsName.add("Red Pepper");
        ingredientsName.add("Eggs");
        ingredientsName.add("Cucumber");
        ingredientsName.add("Chocolate");
        ingredientsName.add("Onion");
        ingredientsName.add("Green Peas");
        ingredientsName.add("Sour Cream");
        ingredientsName.add("Cottage Cheese");
        ingredientsName.add("Cheese");
        ingredientsName.add("Butter");
        ingredientsName.add("Olive");
        ingredientsName.add("Vanilla");

        ArrayList<String> image = new ArrayList<>();
        image.add("https://www.dropbox.com/s/j9mp4x3m8yf2swn/article_meals_1_dsmd8n.jpg?dl=0");
        image.add("https://www.dropbox.com/s/13987t6ng3a8tn6/Baker_Katherine_Farro_Salad_Arugula_Apple_Butternut_Squash_Chickpea-670x4441-670x4441-670x444.png?dl=0");
        image.add("https://www.dropbox.com/s/ybs45vcuz6ptndr/chickpeas-broccoli-1875858-m.jpg?dl=0");
        image.add("https://www.dropbox.com/s/1u3ymrsk22mb5oh/Easy-meals-balanced-ready-meal.jpg?dl=0");
        image.add("https://www.dropbox.com/s/s25uw5ghg0ersif/Easy-meals-curry.jpg?dl=0");
        image.add("https://www.dropbox.com/s/r3j63chpymzv6kn/Easy-meals-spaghetti-bolognese.jpg?dl=0");
        image.add("https://www.dropbox.com/s/pxk16j82wd5yfgw/flex-meals-explained-509x270.jpg?dl=0");
        image.add("https://www.dropbox.com/s/f0ijo9c77oa8uoi/Patties-400x267.jpg?dl=0");
        image.add("https://www.dropbox.com/s/1ho0ssycpwl1v87/TodaysParent_falafel_gallery1.jpg?dl=0");
        image.add("https://www.dropbox.com/s/y264rs9s5eag2zq/Vegan-one-pot-meals-9-537x444.jpg?dl=0");

        ArrayList<String> name = new ArrayList<>();
        name.add("");

        String outputFile = "ingrediets.csv";
        String outputFile2= "ingrediets2.csv";
        String[] list= {"Id","Name","Image","CooK Time(min)","Source","Servings","DatePublished(mm/dd/yyyy)","PrepTime","Description","MethodOfBaking","Cuisine","TypeOfFood","TypeOfMeal","Step Images","Steps","IngredientsList","IngredientName","IngredientCountMin","IngredientCountMax","IngredientUnit" };

        boolean alreadyExists = new File(outputFile).exists();
        boolean alreadyExists2= new File(outputFile2).exists();

            CSVWriter csvOutput = new CSVWriter (new FileWriter(outputFile, true), ',');
            CSVWriter csvOutput2 = new CSVWriter(new FileWriter(outputFile2,true), ',');

            if (!alreadyExists && !alreadyExists2)
            {
                csvOutput.writeNext(list);
                csvOutput2.writeNext(list);
            }
        for (int i = 1; i <= 60000; i++) {
                ArrayList<String> empty = new ArrayList<>();
                for (int a = 0; a < ingredientsName.size(); a++) {

                    // Take Random value from the "ingredients" list.
                    Random rand = new Random();
                    String randomIngredients = ingredientsName.get(rand.nextInt(ingredientsName.size()));
                    if (empty.contains(randomIngredients)) {
                        randomIngredients = ingredientsName.get(rand.nextInt(ingredientsName.size()));
                        while (!empty.contains(randomIngredients)) {
                            empty.add(randomIngredients);
                        }

                    } else {
                        empty.add(randomIngredients);
                    }
                }
            if(i<30001){
                for (int y = 0; y < ingredientsName.size(); y++) {
                    String[] listik = {Integer.toString(i), ingredientsName.get(y)};
                    csvOutput.writeNext(listik);
                }
            }
            else {
                for (int y = 0; y < ingredientsName.size(); y++) {
                    String[] listik = {Integer.toString(i), ingredientsName.get(y)};
                    csvOutput2.writeNext(listik);
                }
            }
        }
        csvOutput2.close();
        csvOutput.close();

    }
}



