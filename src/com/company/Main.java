package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.opencsv.*;

public class Main {

    public static String randomKey(ArrayList<String> list){
        Random random =new Random();
        return list.get(random.nextInt(list.size()));
    }
    public static void main(String[] args) throws IOException {
        ImmutableList<String> butter = ImmutableList.of(
                "120 gr (Butter)", "Butter","1","2","gr");
        ImmutableList<String> sugar =ImmutableList.of(
                "100 kg (Sugar)","Sugar", "2","3","kg");
        ImmutableList<String> sourCream = ImmutableList.of(
                "100 mg (Sour-cream)","Sour-cream","1","2","mg");
        ImmutableList<String> soda= ImmutableList.of(
                "1 tbsp baking soda mixed with a tbsp of vinegar (Soda)","Soda","2","3","tbsp");
        ImmutableList<String> vanilla =ImmutableList.of(
                "1 cup vanilla extract or a pinch of vanilla powder (Vanilla)","Vanilla","1","2","cup");
        ImmutableList<String> flour= ImmutableList.of(
                "250-300 tsp (Flour)","Flour","1","2","tsp");
        ImmutableList<String> milk = ImmutableList.of(
                "500 ml (Milk)","Milk","2","3","ml");
        ImmutableList<String> cherries =ImmutableList.of(
                "400 pcs fresh or defrosted cherries without the bones (Cherry)","Cherry","2","3","pcs");
        ImmutableList<String>  apple = ImmutableList.of(
                "3-4 big apples (Apple)", "Apple","1","2","glass");
        ImmutableList<String> cinOrCard = ImmutableList.of(
                "1 thsp cinnamon or 1 thsp of cardamon (Cinnamon or Cardamon)","Cinnamon Or Cardamon","1","2","thsp");
        ImmutableList<String> bananas = ImmutableList.of(
                "1 big or 2 small rape (Bananas)","Bananas","1","2","rape");
        ImmutableList<String> coldWater = ImmutableList.of(
                "40 ml (Cold water)","Cold Water","1","2","ml");
        ImmutableList<String> mascraponeCheese = ImmutableList.of(
                "200 l (Mascarpone cheese)","Mascrapone Cheese","2","3","l");
        ImmutableList<String> heavyCream= ImmutableList.of(
                "200 big cup sweet (Heavy cream)","Heavy Cream","2","3","big cup");
        ImmutableList<String> coldEspresso = ImmutableList.of(
                "300 small cup (Cold espresso)","Cold Espresso","1","2","small cup");
        ImmutableList<String> rum = ImmutableList.of(
                "50 dl (Rum)","Rum","1","2","dl");
        ImmutableList<String> salt = ImmutableList.of(
                "1/2 cut (Salt)","Salt","0,5","5","cut");
        ImmutableList<String> eggs = ImmutableList.of(
                "2 eggs (Egg)", "Egg","2","3","pcs");
        ImmutableList<String> sausageGravy = ImmutableList.of(
                "Sausage Gravy","Suasage Graby","0.25","1","cup");
        ImmutableList<String> blackPepper = ImmutableList.of(
                "2 teaspoons (Black Pepper)","Black Pepper","2","3","teaspoon");
        ImmutableList<String> mandarin = ImmutableList.of(
                "2 pcs (Mandarin)","Mandarin","2","3","pcs");

        ArrayList<String> ingNames =new ArrayList<String>();
        ingNames.add("Butter");
        ingNames.add("Sugar");
        ingNames.add("Sour Cream");
        ingNames.add("Soda");
        ingNames.add("Vanilla");
        ingNames.add("Flour");
        ingNames.add("Milk");
        ingNames.add("Cherrie");
        ingNames.add("Apple");
        ingNames.add("Cinnamon or Cardamon");
        ingNames.add("Bananas");
        ingNames.add("Cold Water");
        ingNames.add("Mascrapone Cheese");
        ingNames.add("Heavy Cream");
        ingNames.add("Cold Espresso");
        ingNames.add("Rum");
        ingNames.add("Salt");
        ingNames.add("Eggs");
        ingNames.add("Sausage Gravy");
        ingNames.add("Black Pepper");
        ingNames.add("Mandarin");

        ImmutableMap<String,ImmutableList<String>> allIng = ImmutableMap.<String ,ImmutableList<String>>builder()
                .put(ingNames.get(0),butter)
                .put(ingNames.get(1),sugar)
                .put(ingNames.get(2),sourCream)
                .put(ingNames.get(3),soda)
                .put(ingNames.get(4),vanilla)
                .put(ingNames.get(5),flour)
                .put(ingNames.get(6),milk)
                .put(ingNames.get(7),cherries)
                .put(ingNames.get(8),apple)
                .put(ingNames.get(9),cinOrCard)
                .put(ingNames.get(10),bananas)
                .put(ingNames.get(11),coldWater)
                .put(ingNames.get(12),mascraponeCheese)
                .put(ingNames.get(13),heavyCream)
                .put(ingNames.get(14),coldEspresso)
                .put(ingNames.get(15),rum)
                .put(ingNames.get(16),salt)
                .put(ingNames.get(17),eggs)
                .put(ingNames.get(18),sausageGravy)
                .put(ingNames.get(19),blackPepper)
                .put(ingNames.get(20),mandarin)
                .build();

        ImmutableList<String> stepOne = ImmutableList.of(
                "https://www.dropbox.com/s/txnkviyzpe48fyk/51SgcNnhTeL._SL250_.jpg?dl=0","Mix all the liquid ingredients together with the help of a hand whisk"
        );
        ImmutableList<String> stepTwo = ImmutableList.of(
                "https://www.dropbox.com/s/cc5sku5cq88ill9/61elDSl9bnL._SX258_BO1%2C204%2C203%2C200_.jpg?dl=0","Lastly add the flour and continue mixing. You will get a soft sticky dough."
        );
        ImmutableList<String> stepThree = ImmutableList.of(
                "https://www.dropbox.com/s/4t2g4acqt2622iz/511wDa-aHwL._SX258_BO1%2C204%2C203%2C200_.jpg?dl=0","Cover a rectangular pan with parchment paper and put the dough onto it. With the help of a spoon spread the dough evenly."
        );
        ImmutableList<String> stepFour = ImmutableList.of(
                "https://www.dropbox.com/s/hjdfwg65ewgbvxt/mccormick_cover_yzjt1s.jpg?dl=0","Preheat the oven to 180°C."
        );
        ImmutableList<String> stepFive = ImmutableList.of(
                "https://www.dropbox.com/s/37wfhpdkiewmohx/scandinavian-cooking-meals-top-30-delicious-and-nutritious-scandinavian-one-dish-soup-and-stew-meals-recipes_7603377.jpeg?dl=0","Bake the dough for about 15-20 mins."
        );
        ImmutableList<String> stepSix = ImmutableList.of(
                "https://www.dropbox.com/s/arzpv6iazhlet4l/3-easy-steps-flight_400x0_crop_400x250_eae81a55d0.jpg?dl=0","Mix all the liquid ingredients together with the help of a hand whisk."
        );
        ImmutableList<String> stepSeven = ImmutableList.of(
                "https://www.dropbox.com/s/jj9fv86m0kshma6/3-easy-steps-flight.jpg?dl=0","Lastly add the flour and continue mixing. You will get a soft sticky dough"
        );
        ImmutableList<String> stepEight = ImmutableList.of(
                "https://www.dropbox.com/s/fk6jgqoojkgwbo3/5bb5a305fe9435f495a0f53b902771d0.jpg?dl=0","Cover a rectangular pan with parchment paper and put the dough onto it. With the help of a spoon spread the dough evenly."
        );
        ImmutableList<String> stepNine = ImmutableList.of(
                "https://www.dropbox.com/s/elw9lqqecigd124/503625f7d4d32f6d8fd9acf3850f39c7.jpg?dl=0","Preheat the oven to 270°C."
        );
        ImmutableList<String> stepTen = ImmutableList.of(
                "https://www.dropbox.com/s/yspgh88uzyhj0ph/1426623863-love-toast.jpg?dl=0","Then, in a separate bowl beat the butter with sugar and add the sour cream. Mix until well-combined."
        );
        ImmutableList<String> stepEleven = ImmutableList.of(
                "https://www.dropbox.com/s/9lz470dpt1uob62/aid223997-728px-Make-Healthy-Breakfast-Meals-Step-1-Version-2.jpg?dl=0","Add the vinegar and baking soda and add the vanilla."
        );
        ImmutableList<String> stepTwelve = ImmutableList.of(
                "https://www.dropbox.com/s/u2ip6099mnz3zgp/body-image-2.jpg?dl=0","Add the flour little by little and mix the mass with hands until you have a dough very alike to sugar cookies’ dough."
        );
        ImmutableList<String> stepThirteen = ImmutableList.of(
                "https://www.dropbox.com/s/5awmmxdddr2vskz/EWmenuplanner.jpg?dl=0","Separate the dough into two parts."
        );
        ImmutableList<String> stepFourteen = ImmutableList.of(
                "https://www.dropbox.com/s/4khbmlqq9of5u7s/Healthy-breakfast-ideas.jpg?dl=0","Take one part of the dough and spread it evenly on the surface of the pan you are going to cook the pie in. Raise the edges so that they lie out of the pan. This will be more easily done with the help of a roll."
        );
        ImmutableList<String> stepFifteen = ImmutableList.of(
                "https://www.dropbox.com/s/23zzeniyep6ygxe/Healthy-Breakfast.jpg?dl=0","Fill in the cooled down custard and add the cherries to it."
        );
        ImmutableList<String> stepSixteen = ImmutableList.of(
                "https://www.dropbox.com/s/x48xw84dtzfh9x1/ideas-about-weight-loss-challenge-on-pinterest-weights-and-crossfit_i-must-lose-weight_nutrition-diets-most-effective-weight-loss-programs-phen375-reviews-healthy-meals-for-define-daily-_800x2979.jpg?dl=0","Take the second part of the dough, roll it and cover the pie. With the help of your roll pass onto the edges of the pan, so that the two layers are well stuck to each other. We don’t want the custard to pour out while baking."
        );
        ImmutableList<String> stepSeventeen = ImmutableList.of(
                "https://www.dropbox.com/s/i89dsb6msf1gpao/Make-Healthy-Breakfast-Meals-Step-4-Version-2.jpg?dl=0","Whisk together the flour, baking soda and a pinch of salt."
        );
        ImmutableList<String> stepEighteen = ImmutableList.of(
                "https://www.dropbox.com/s/asbpgh2czzg35hg/o-HEALTHY-BREAKFAST-IDEAS-facebook.jpg?dl=0","With the help of mixer beat the butter and sugar until you get a fluffy mass. One by one add the eggs and vanilla, and beat until all is well-combined."
        );
        ImmutableList<String> stepNineteen = ImmutableList.of(
                "https://www.dropbox.com/s/3di4u2u6q9ilhy8/RU188547.jpg?dl=0","Add the flour mixture little by little and continue to beat. Now you should have a smooth dough."
        );
        ImmutableList<String> stepTwenty = ImmutableList.of(
                "https://www.dropbox.com/s/gbu7e4p3kx1jhpa/weight-loss-plan-com-ways-to-lose-fast_lose-fat-fast_weight-loss-review-healthy-diet-meals-for-what-food-to-cut-out-lose-fat-clinic-phen375-official-site-3-steps-reduce.jpg?dl=0","Divide the dough in as many parts as you wish and wrap each in plastic bags."
        );
        ImmutableList<String> stepTwentyOne = ImmutableList.of(
                "https://www.dropbox.com/s/0fndbvyexweai5q/28893fdd180f88e8fb946f908fd70011.jpg?dl=0","Refrigerate until the dough is firm for rolling. I usually leave it in the fridge overnight. "
        );

        ArrayList<String> stepsName =new ArrayList<String>();
        stepsName.add("first");
        stepsName.add("two");
        stepsName.add("three");
        stepsName.add("four");
        stepsName.add("five");
        stepsName.add("six");
        stepsName.add("seven");
        stepsName.add("eight");
        stepsName.add("nine");
        stepsName.add("ten");
        stepsName.add("eleven");
        stepsName.add("twelve");
        stepsName.add("thirteen");
        stepsName.add("fourteen");
        stepsName.add("fifteen");
        stepsName.add("sixteen");
        stepsName.add("seventeen");
        stepsName.add("eighteen");
        stepsName.add("nineteen");
        stepsName.add("twenty");
        stepsName.add("twentyOne");

        ImmutableMap<String,ImmutableList<String>> allSteps= ImmutableMap.<String ,ImmutableList<String>>builder()
                .put(stepsName.get(0),stepOne)
                .put(stepsName.get(1),stepTwo)
                .put(stepsName.get(2),stepThree)
                .put(stepsName.get(3),stepFour)
                .put(stepsName.get(4),stepFive)
                .put(stepsName.get(5),stepSix)
                .put(stepsName.get(6),stepSeven)
                .put(stepsName.get(7),stepEight)
                .put(stepsName.get(8),stepNine)
                .put(stepsName.get(9),stepTen)
                .put(stepsName.get(10),stepEleven)
                .put(stepsName.get(11),stepTwelve)
                .put(stepsName.get(12),stepThirteen)
                .put(stepsName.get(13),stepFourteen)
                .put(stepsName.get(14),stepFifteen)
                .put(stepsName.get(15),stepSixteen)
                .put(stepsName.get(16),stepSeventeen)
                .put(stepsName.get(17),stepEighteen)
                .put(stepsName.get(18),stepNineteen)
                .put(stepsName.get(19),stepTwenty)
                .put(stepsName.get(20),stepTwentyOne)
                .build();
        ArrayList<String> name = new ArrayList<>();
        name.add("Pizza");
        name.add("Hamburger");
        name.add("Cheeseburger");
        name.add("French Fries");
        name.add("Omelette");
        name.add("Paste");
        name.add("Gyro");
        name.add("Porridge");
        name.add("Spaghetti");
        name.add("Salad");

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

        ArrayList<String> cookTime = new ArrayList<>();
        cookTime.add("20");
        cookTime.add("60");
        cookTime.add("30");
        cookTime.add("25");
        cookTime.add("6");
        cookTime.add("15");
        cookTime.add("35");
        cookTime.add("27");
        cookTime.add("8");
        cookTime.add("28");

        ArrayList<String> servings = new ArrayList<>();
        servings.add("1");
        servings.add("2");
        servings.add("3");
        servings.add("4");
        servings.add("5");
        servings.add("6");
        servings.add("7");
        servings.add("8");
        servings.add("9");
        servings.add("10");

        ArrayList<String> datePublished = new ArrayList<>();
        datePublished.add("5/12/2017");
        datePublished.add("4/13/2017");
        datePublished.add("9/14/2017");
        datePublished.add("10/17/2017");
        datePublished.add("11/15/2017");
        datePublished.add("12/16/2017");
        datePublished.add("8/20/2017");
        datePublished.add("2/1/2017");
        datePublished.add("1/23/2017");
        datePublished.add("6/19/2017");

        ArrayList<String> prepTime = new ArrayList<>();
        prepTime.add("20");
        prepTime.add("60");
        prepTime.add("30");
        prepTime.add("10");
        prepTime.add("40");
        prepTime.add("35");
        prepTime.add("0");
        prepTime.add("29");
        prepTime.add("65");
        prepTime.add("120");

        ArrayList<String> description = new ArrayList<>();
        description.add("Fall is the best season for making apple desserts. You can find tons of apples in the market. So let’s take the advantage and make a juicy apple tart and invite our friends for a cup of tea.");
        description.add("Brownie is one of the desserts that most people are fond of. There are hundreds of brownie recipes on the net with different kinds of ingredients.\n" +
                "\n" +
                "As my husband is vegetarian, I have always been looking for recipes that didn’t contain any eggs. Sometimes, I just tried to omit eggs in the recipe. However, I wasn’t much satisfied with the results.\n" +
                "\n" +
                "Once I was just browsing the net, when I found out that 2 eggs could be replaced with one banana! Well, what can go better with chocolate flavored dessert than sweet rape bananas? As I had several almost over rape bananas at home, I decided to give my eggless brownie another try. As a result I got the best brownie I had ever baked.");
        description.add("The Christmas time for me is the time of cozy and warm holidays spent with my family. It is the time to take advantage of the holidays and spend some quality baking time in the kitchen.\n" +
                "\n" +
                "Christmas cookies have become one of my specials on the Christmas table, and all my guests are looking forward to trying new types of cookies with every coming year.\n" +
                "\n" +
                "Well, the dough of the cookies can vary based on your taste. I usually use ordinary sugar cookies’ dough, as I like the crisp of them. You may add cocoa, ginger or cinnamon to make it more spicy and suitable to the season.");
        description.add("You can find hundreds of Tiramisu recipes on the net. However, most of them contain too many eggs. I have decided to share my vegetarian Tiramisu recipe with you. The taste doesn’t much differ from the original Tiramisu.\n" +
                "\n" +
                "All of us know that one of the basic Tiramisu ingredients are the Lady Finger cookies. As the latters contain eggs, I have elaborated my own biscuit recipe.");
        description.add("This eggless custard and cherry pie is one of my specials and the one preferred by my husband. Both the dough and the filling are rather easy to make. You can even minimize the time spent on this by having the custard prepared beforehand. The recipe is considered for 25-30 cm circle pan.");
        description.add("The most interesting part in making Christmas cookies is decorating them when they are already cooled down. I usually use sugar-paste for covering them. There is a wide variety of paste colors in confectionery shops. You can share this wonderful experience with your kids. Most of them enjoy the process immensely.\n" +
                "\n" +
                "You may as well use Royal Icing for decorating the cookies. Or else, sprinkle them with sugar before putting them into the oven.\n" +
                "\n" +
                "Well, enjoy your holiday season and make your table look nicer and happier with your homemade cookies.");
        description.add("One of the greatest things about this recipe is that while baking it, your house is filled with wonderful cinnamon and ginger flavor. This cake can make your evening a real treat especially when its cold and gloomy outside.\n" +
                "\n" +
                "There are a number of pumpkin cake recipes on the net. What I like in this one is that it is super easy to prepare and can be enjoyed by vegetarians as well. The eggs are replaced with  potato starch here.");
        description.add("I very often replace the apples with pears. You can make it with any kind of fruits you want. Peaches, plumes can also be great substitutions.\n" +
                "\n" +
                "This tart can be a great solution when you are short of time and the guests are about to knock");
        description.add("You can either dust the cake with sugar powder or, what I more prefer, cover it with glaze. Use either vanilla or chocolate glaze. For vanilla glaze you can just mix sugar powder with water or milk.");
        description.add("As a result you will have a liquid mixture that can be poured into the baking pan. Be sure to have the pan oiled and covered with a sheet of baking paper. It will be easier to remove the dessert when there is a baking paper underneath.\n" +
                "\n" +
                "Bake the brownie for almost 45-50 minutes at 180°C. For a quick finish you can dust the cake with sugar powder and get a classy look. Or you can melt some more chocolate and glaze the dessert with it. Anything you think can go with its taste.\n" +
                "\n" +
                "When cut, it should be well-baked on top and bottom and stay clammy in the middle. Serve the cut pieces when still warm with a scoop of vanilla ice cream. Nyam-nyam! Bon apetit!");


        ArrayList<String> methodOfBaking = new ArrayList<>();
        methodOfBaking.add("This is the term used when a cake is made with butter or block margarine (soft or whipped margarines are unsuitable). It means that the fat and sugar are beaten together until creamy and pale: the eggs are then beaten into this mixture bit by bit");
        methodOfBaking.add("A cake made by this method starts off with the fat being rubbed into the flour – exactly the same as for shortcrust pastry. Butter, block margarine and lard can all be used. It is a very easy method.");
        methodOfBaking.add("Exactly as the name suggests, these cakes are mixed all in one go. All the ingredients go into the bowl together and the mixing is done in seconds. Soft margarine is tailor-made for this method.");
        methodOfBaking.add("This is a very easy method of preparing cakes as a minimum amount of handling is required. It is the traditional method for preparing Gingerbread, but Fruit Cakes can be made this way as well.\n" +
                "\n" +
                "The Stork, sugar, syrup, liquid and fruit (if used) are heated gently until the Stork has melted. This mixture is cooled and added to the dry ingredients and then beaten together with the egg until well mixed.\n" +
                "\n" +
                "The texture of Gingerbread is fairly open and that of a Fruit Cake fairly crumbly but both are moist.");
        methodOfBaking.add("This is the method used for preparing Fatless Sponges. Swiss Rolls and also Genoese Sponges.\n" +
                "\n" +
                "The eggs and sugar are whisked together for 10-15 minutes over hot water to dissolve the sugar completely and then for a further 5 minutes off the heat to cool the mixture. A great deal of air is incorporated into the mixture at this stage to give the cake its light, spongy texture. Finally, the flour is folded in carefully so that the incorporated air is not lost.\n" +
                "\n" +
                "N.B: If using an electric mixer the whisking time is reduced to 5-10 minutes and it is not necessary to whisk over hot water. The texture of a fatless sponge is even, light and very soft. It dries out very quickly so should be eaten within 2 days of baking.\n" +
                "\n" +
                "A Genoese Sponge contains a small proportion of fat, but is made by the whisking method. The Stork is melted and trickled into the side of the mixture a little at a time and folded in with the flour. This improves the flavour and will keep a few days longer than a Fatless Sponge.\n");


        ArrayList<String> cuisine = new ArrayList<>();
        cuisine.add("Italian");
        cuisine.add("Armenian");
        cuisine.add("Japanese");
        cuisine.add("Chinese");
        cuisine.add("French");
        cuisine.add("Georgian");
        cuisine.add("Spanish");
        cuisine.add("Russian");
        cuisine.add("Mexican");
        cuisine.add("Korean");

        ArrayList<String> typeOfFood = new ArrayList<>();
        typeOfFood.add("Seafood");
        typeOfFood.add("Fast Food");
        typeOfFood.add("Vegetarian");
        typeOfFood.add("Meat Food");
        typeOfFood.add("Raw Food");

        ArrayList<String> typeOfMeal = new ArrayList<>();
        typeOfMeal.add("Breakfast");
        typeOfMeal.add("Dinner");
        typeOfMeal.add("Dinner");

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
                ArrayList<String> emptySteps = new ArrayList<>();
                while (emptySteps.size()<20){
                    String randomSteps = randomKey(stepsName);
                    if(emptySteps.contains(randomSteps)){
                        randomSteps = randomKey(stepsName);
                        while (!emptySteps.contains(randomSteps)){
                            emptySteps.add(randomSteps);
                        }
                    }else{
                        emptySteps.add(randomSteps);
                    }
                }
            while(empty.size()<20) {

                String randomName = randomKey(ingNames);
                if (empty.contains(randomName)) {
                    randomName = randomKey(ingNames);
                    while (!empty.contains(randomName)) {
                        empty.add(randomName);
                    }

                } else {
                    empty.add(randomName);
                }
            }
            Random random =new Random();
            if(i<30001){
                int m = random.nextInt(19)+1;
                    for (int y = 0; y < empty.size(); y++) {
                        if(y==0){
                            String[] listik = {Integer.toString(i), randomKey(name), randomKey(image), randomKey(cookTime),"", randomKey(servings), randomKey(datePublished), randomKey(prepTime),randomKey(description) ,randomKey(methodOfBaking),randomKey(cuisine) ,randomKey(typeOfFood),randomKey(typeOfMeal),allSteps.get(emptySteps.get(y)).get(0),allSteps.get(emptySteps.get(y)).get(1), allIng.get(empty.get(y)).get(0), allIng.get(empty.get(y)).get(1),
                                    allIng.get(empty.get(y)).get(2), allIng.get(empty.get(y)).get(3), allIng.get(empty.get(y)).get(4)};
                            csvOutput.writeNext(listik);
                        }
                        else if (y<m){
                            String[] listik = {Integer.toString(i), "", "", "","", "", "", "","" ,"","" ,"","",allSteps.get(emptySteps.get(y)).get(0),allSteps.get(emptySteps.get(y)).get(1), allIng.get(empty.get(y)).get(0), allIng.get(empty.get(y)).get(1),
                                    allIng.get(empty.get(y)).get(2), allIng.get(empty.get(y)).get(3), allIng.get(empty.get(y)).get(4)};
                            csvOutput.writeNext(listik);
                        }
                        else{
                            String[] listik = {Integer.toString(i), "", "", "", "", "", "", "", "", "", "", "", "", "", "", allIng.get(empty.get(y)).get(0), allIng.get(empty.get(y)).get(1),
                                    allIng.get(empty.get(y)).get(2), allIng.get(empty.get(y)).get(3), allIng.get(empty.get(y)).get(4)};
                            csvOutput.writeNext(listik);
                        }
                }
            }
            else {
                int m = random.nextInt(19)+1;
                for (int y = 0; y < emptySteps.size(); y++) {
                    if(y==0){
                        String[] listik = {Integer.toString(i), randomKey(name), randomKey(image), randomKey(cookTime),"", randomKey(servings), randomKey(datePublished), randomKey(prepTime),randomKey(description) ,randomKey(methodOfBaking),randomKey(cuisine) ,randomKey(typeOfFood),randomKey(typeOfMeal),allSteps.get(emptySteps.get(y)).get(0),allSteps.get(emptySteps.get(y)).get(1),
                                allIng.get(empty.get(y)).get(0), allIng.get(empty.get(y)).get(1),allIng.get(empty.get(y)).get(2), allIng.get(empty.get(y)).get(3), allIng.get(empty.get(y)).get(4)};
                        csvOutput2.writeNext(listik);
                    }
                    else if (y<m){
                        String[] listik = {Integer.toString(i), "", "", "","", "", "", "","" ,"","" ,"","",allSteps.get(emptySteps.get(y)).get(0),allSteps.get(emptySteps.get(y)).get(1), allIng.get(empty.get(y)).get(0), allIng.get(empty.get(y)).get(1),
                                allIng.get(empty.get(y)).get(2), allIng.get(empty.get(y)).get(3), allIng.get(empty.get(y)).get(4)};
                        csvOutput2.writeNext(listik);
                    }
                    else{
                        String[] listik = {Integer.toString(i), "", "", "", "", "", "", "", "", "", "", "", "", allSteps.get(emptySteps.get(y)).get(0), allSteps.get(emptySteps.get(y)).get(1), "", "",
                                "", "", ""};
                        csvOutput2.writeNext(listik);
                    }
                }
            }
        }
        csvOutput2.close();
        csvOutput.close();
    }
}



