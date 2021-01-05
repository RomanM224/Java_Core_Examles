package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // converterFromArrayToList();

//        inheritanceExml();
//
//        animalSay();

        // animalSayWildcards();

      //  animalSayWildcardsSuper();
        
        genericClassTest();
    }

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
    }

    public static void converterFromArrayToList() {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        List<Integer> stringList = fromArrayToList(intArray);
        System.out.println("List Integer: " + stringList);
        List<String> stringList2 = fromArrayToList(intArray, Object::toString);
        System.out.println("List String: " + stringList2);
    }

    public static void inheritanceExml() {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animalCat = new Cat();

        animal.say();
        dog.say(); // Uses overrided method in Class Dog
        cat.say(); // Uses overrided method in Class Cat
        animalCat.say(); // Uses overrided method in Class Cat

        dog.go();
        cat.go();
//        animalCat.go(); //Do not see method go() in Class Cat

        List<PetCat> pets = Arrays.asList(cat); // Can put cats in List with generic that class Cat implements "PetCat -
                                                // interface"
        // Cat cat1 = pets.get(0); //Not work
        PetCat cat1 = pets.get(0);
        Cat cat2 = (Cat) pets.get(0);
    }

    public static <A extends Animal> void say(A animal) {
        animal.say();
    }

    public static void animalSay() {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animalCat = new Cat();

        say(animal);
        say(dog);
        say(cat);
        say(animalCat);
    }

    private static void wildcardsWithGenerics(List<? extends Animal> animals) {
        animals.forEach(animal -> animal.say());
    }

    private static void wildcardsWithGenerics2(List<Animal> animals) {
        animals.forEach(animal -> animal.say());
    }

    public static void animalSayWildcards() {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Animal animalCat = new Cat();
        List<Animal> animals = Arrays.asList(animal, dog, cat, animalCat);

        wildcardsWithGenerics(animals);
        wildcardsWithGenerics2(animals);

        List<Cat> cats = Arrays.asList(cat, cat2);
        List<PetCat> pets = Arrays.asList(cat, cat2);

        wildcardsWithGenerics(cats); // This method takes List with generic <Animal> and everything what extends from
                                     // Animal
        // wildcardsWithGenerics2(cats); //This method takes List only with generic
        // <Animal>
        // wildcardsWithGenerics(pets); //Not work
    }

    private static void wildcardsWithGenericsSuper(List<? super Dog> animals) {
        animals.forEach(animal -> ((Animal) animal).say());
    }

    public static void animalSayWildcardsSuper() {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Animal animalCat = new Cat();
        List<Animal> animals = Arrays.asList(animal, dog, cat, animalCat);

        wildcardsWithGenericsSuper(animals);
    }

    public static void addCatLower(List<? super Cat> catList) {
        catList.add(new RedCat());
        System.out.println("Cat Added");
    }

    public static void lowerBound() {
        List<Animal> animalList = new ArrayList<Animal>();
        List<Cat> catList = new ArrayList<Cat>();
        List<RedCat> redCatList = new ArrayList<RedCat>();
        List<Dog> dogList = new ArrayList<Dog>();

        // add list of super class Animal of Cat class
        addCatLower(animalList);

        // add list of Cat class
        addCatLower(catList);

        // compile time error
        // can not add list of subclass RedCat of Cat class
        // addCat(redCatList);

        // compile time error
        // can not add list of subclass Dog of Superclass Animal of Cat class
        // addCat.addMethod(dogList);
    }

    public static void addCatUpper(List<? extends Cat> catList) {
     //   catList.add(new Cat());
        System.out.println("Cat Added");
    }
    
    public static void upperBound() {
        List<Animal> animalList = new ArrayList<Animal>();
        List<Cat> catList = new ArrayList<Cat>();
        List<RedCat> redCatList = new ArrayList<RedCat>();
        List<Dog> dogList = new ArrayList<Dog>();

        // compile time error
        //addCatUpper(animalList);

        // add list of Cat class
        addCatUpper(catList);

        // add list of Cat class
         addCatUpper(redCatList);

        // compile time error
        // addCatUpper.addMethod(dogList);
    }
    
    public static void genericClassTest() {
        GenericClass<Integer> integerBox = new GenericClass<Integer>();
        GenericClass<String> stringBox = new GenericClass<String>();
      
        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
    
    

}
