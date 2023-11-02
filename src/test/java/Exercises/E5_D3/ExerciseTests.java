package Exercises.E5_D3;

import Exercises.E5_D3.entities.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ExerciseTests {

    private static AnnotationConfigApplicationContext ctx;


    @BeforeAll
    static void generateElements() {
        Topping testCheese = new Topping("cheese",92,0.69);
        Topping testHam = new Topping("ham",35,0.99);
        Topping testOnions = new Topping("Onions",22,0.69);
        Topping testPineapple = new Topping("pineapple",24,0.79);
        Topping testSalami = new Topping("salami",86,0.99);
        Pizza testMargherita = new Pizza("margherita",1104,4.99, new ArrayList<Topping>());
        List<Topping> ingredients = new ArrayList<Topping>();
        ingredients.add(testHam);
        ingredients.add(testPineapple);
        Pizza testHawaiaana = new Pizza("hawaaian",1024,6.49,ingredients);
        List<Topping> ingredients2 = new ArrayList<Topping>();
        ingredients.add(testSalami);
        Pizza testSalamiPizza = new Pizza("salami",1160,5.99,ingredients2);
        Drink testWater = new Drink("Water","0,5l",0,1.29);
        Drink testLemonade = new Drink("Lemonade","0.33l",128,1.29);
        Drink testWine = new Drink("Wine","0,75l, 13%",607,7.49);
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(testMargherita);
        pizzaList.add(testHawaiaana);
        pizzaList.add(testSalamiPizza);
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(testCheese);
        toppingList.add(testHam);
        toppingList.add(testOnions);
        toppingList.add(testPineapple);
        toppingList.add(testSalami);
        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(testWater);
        drinkList.add(testLemonade);
        drinkList.add(testWine);
        Menu testFullMenu = new Menu(pizzaList,toppingList,drinkList);
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(testMargherita);
        List<Drink> bere = new ArrayList<>();
        bere.add(testWater);
        double costoCoperto = 1.50;
        Ordine testOrder = new Ordine(1,pizze,bere,StatoOrdine.IN_CORSO,costoCoperto,11, LocalDateTime.now());
    }

    @Test
    void fullMenuTest() {
        ctx = new AnnotationConfigApplicationContext();
        Topping testCheese = new Topping("cheese",92,0.69);
        Topping testHam = new Topping("ham",35,0.99);
        Topping testOnions = new Topping("Onions",22,0.69);
        Topping testPineapple = new Topping("pineapple",24,0.79);
        Topping testSalami = new Topping("salami",86,0.99);
        Pizza testMargherita = new Pizza("margherita",1104,4.99, new ArrayList<Topping>());
        List<Topping> ingredients = new ArrayList<Topping>();
        ingredients.add(testHam);
        ingredients.add(testPineapple);
        Pizza testHawaiaana = new Pizza("hawaaian",1024,6.49,ingredients);
        List<Topping> ingredients2 = new ArrayList<Topping>();
        ingredients.add(testSalami);
        Pizza testSalamiPizza = new Pizza("salami",1160,5.99,ingredients2);
        Drink testWater = new Drink("Water","0,5l",0,1.29);
        Drink testLemonade = new Drink("Lemonade","0.33l",128,1.29);
        Drink testWine = new Drink("Wine","0,75l, 13%",607,7.49);
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(testMargherita);
        pizzaList.add(testHawaiaana);
        pizzaList.add(testSalamiPizza);
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(testCheese);
        toppingList.add(testHam);
        toppingList.add(testOnions);
        toppingList.add(testPineapple);
        toppingList.add(testSalami);
        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(testWater);
        drinkList.add(testLemonade);
        drinkList.add(testWine);
        Menu testFullMenu = new Menu(pizzaList,toppingList,drinkList);
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(testMargherita);
        List<Drink> bere = new ArrayList<>();
        bere.add(testWater);
        double costoCoperto = 1.50;
        Ordine testOrder = new Ordine(1,pizze,bere,StatoOrdine.IN_CORSO,costoCoperto,11, LocalDateTime.now());
        Menu beanMenu = (Menu) ctx.getBean("fullMenu");
        assertSame(testFullMenu,beanMenu);
    }

    @Test
    void orderTest () {
        ctx = new AnnotationConfigApplicationContext();
        Topping testCheese = new Topping("cheese",92,0.69);
        Topping testHam = new Topping("ham",35,0.99);
        Topping testOnions = new Topping("Onions",22,0.69);
        Topping testPineapple = new Topping("pineapple",24,0.79);
        Topping testSalami = new Topping("salami",86,0.99);
        Pizza testMargherita = new Pizza("margherita",1104,4.99, new ArrayList<Topping>());
        List<Topping> ingredients = new ArrayList<Topping>();
        ingredients.add(testHam);
        ingredients.add(testPineapple);
        Pizza testHawaiaana = new Pizza("hawaaian",1024,6.49,ingredients);
        List<Topping> ingredients2 = new ArrayList<Topping>();
        ingredients.add(testSalami);
        Pizza testSalamiPizza = new Pizza("salami",1160,5.99,ingredients2);
        Drink testWater = new Drink("Water","0,5l",0,1.29);
        Drink testLemonade = new Drink("Lemonade","0.33l",128,1.29);
        Drink testWine = new Drink("Wine","0,75l, 13%",607,7.49);
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(testMargherita);
        pizzaList.add(testHawaiaana);
        pizzaList.add(testSalamiPizza);
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(testCheese);
        toppingList.add(testHam);
        toppingList.add(testOnions);
        toppingList.add(testPineapple);
        toppingList.add(testSalami);
        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(testWater);
        drinkList.add(testLemonade);
        drinkList.add(testWine);
        Menu testFullMenu = new Menu(pizzaList,toppingList,drinkList);
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(testMargherita);
        List<Drink> bere = new ArrayList<>();
        bere.add(testWater);
        double costoCoperto = 1.50;
        Ordine testOrder = new Ordine(1,pizze,bere,StatoOrdine.IN_CORSO,costoCoperto,11, LocalDateTime.now());
        Ordine beanOrder = (Ordine) ctx.getBean("getExampleOrder");
        assertSame(testOrder, beanOrder);
    }

    @ParameterizedTest
    @ValueSource(doubles = {22.78})
    void testSum() {
        ctx = new AnnotationConfigApplicationContext();
        Topping testCheese = new Topping("cheese",92,0.69);
        Topping testHam = new Topping("ham",35,0.99);
        Topping testOnions = new Topping("Onions",22,0.69);
        Topping testPineapple = new Topping("pineapple",24,0.79);
        Topping testSalami = new Topping("salami",86,0.99);
        Pizza testMargherita = new Pizza("margherita",1104,4.99, new ArrayList<Topping>());
        List<Topping> ingredients = new ArrayList<Topping>();
        ingredients.add(testHam);
        ingredients.add(testPineapple);
        Pizza testHawaiaana = new Pizza("hawaaian",1024,6.49,ingredients);
        List<Topping> ingredients2 = new ArrayList<Topping>();
        ingredients.add(testSalami);
        Pizza testSalamiPizza = new Pizza("salami",1160,5.99,ingredients2);
        Drink testWater = new Drink("Water","0,5l",0,1.29);
        Drink testLemonade = new Drink("Lemonade","0.33l",128,1.29);
        Drink testWine = new Drink("Wine","0,75l, 13%",607,7.49);
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(testMargherita);
        pizzaList.add(testHawaiaana);
        pizzaList.add(testSalamiPizza);
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(testCheese);
        toppingList.add(testHam);
        toppingList.add(testOnions);
        toppingList.add(testPineapple);
        toppingList.add(testSalami);
        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(testWater);
        drinkList.add(testLemonade);
        drinkList.add(testWine);
        Menu testFullMenu = new Menu(pizzaList,toppingList,drinkList);
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(testMargherita);
        List<Drink> bere = new ArrayList<>();
        bere.add(testWater);
        double costoCoperto = 1.50;
        Ordine testOrder = new Ordine(1,pizze,bere,StatoOrdine.IN_CORSO,costoCoperto,11, LocalDateTime.now());
        Ordine beanOrder = (Ordine) ctx.getBean("getExampleOrder");
        assertEquals(beanOrder.getTotale(),22.78);
    }
 }
