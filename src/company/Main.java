package company;
/*Балык, Попугай, мышык жана ит деген класс тузунуз.
Алардын свойстваларын ойлоп табыныз.
Бир канча объектилерин тузуп жана аларга маанилерин бериниз.
Аларды консольго чыгарыныз.
Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1
//         Student student = new Student();
//         student.setName("Elaman");
//         student.setSurname("Rakhmanov");
//         student.setAge(22);
//         student.setEmail("ElamanRakhmanov@gmail.com");
//
//        System.out.println(student.getName());
//        System.out.println(student.getSurname());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());


        //task2
//        Rectangle rectangle = new Rectangle();
//        rectangle.setSide1(-4);
//        rectangle.setSide2(3);
//        rectangle.setSide3(-4);//Make sure that your side3 should be same as side1, and side4 == side2, because the rule of rectangle don't allow!
//        rectangle.setSide4(3);
//
//        System.out.println(rectangle.getSide1() + " is a base of a rectangle.");
//        System.out.println(rectangle.getSide2() + " is a height of a rectangle.");
//        System.out.println(rectangle.getSide3() + " is also base of a rectangle.");
//        System.out.println(rectangle.getSide4() + " is also height of a rectangle.");
//
//        System.out.println("Area of a rectangle: " + rectangle.area());

        Scanner scan = new Scanner(System.in);
        Cat cat = new Cat();
        System.out.println("What is the name of your cat? ");
        cat.setName(scan.nextLine());
        System.out.println("Colour of your cat: ");
        cat.setColour(scan.nextLine());
        System.out.println("How old is your cat? ");
        cat.setAge(scan.nextInt());

        System.out.println("Name: " + cat.getName());
        System.out.println("Colour: " + cat.getColour());
        System.out.println("Age: " + cat.getAge());
        System.out.println("---------------------");

        Dog dog = new Dog();
        System.out.println("What is the name of your dog? ");
        dog.setName(scan.nextLine());
        System.out.println("Colour of your dog: ");
        dog.setColour(scan.nextLine());
        System.out.println("How old is your dog? ");
        dog.setAge(scan.nextInt());

        System.out.println("Name: " + dog.getName());
        System.out.println("Colour: " + dog.getColour());
        System.out.println("Age: " + dog.getAge());
        System.out.println("---------------------");

        Fish fish = new Fish();
        System.out.println("What is the type of your fish? ");
        fish.setName(scan.nextLine());
        System.out.println("Colour of your fish: ");
        fish.setColour(scan.nextLine());
        System.out.println("What is the weight of your fish? ");
        fish.setWeight(scan.nextInt());

        System.out.println("Name: " + fish.getName());
        System.out.println("Colour: " + fish.getColour());
        System.out.println("Weight: " + fish.getWeight());
        System.out.println("---------------------");

        Parrot parrot = new Parrot();
        System.out.println("How do you call your parrot? ");
        parrot.setName(scan.nextLine());
        System.out.println("Colour of your parrot: ");
        parrot.setColour(scan.nextLine());
        System.out.println("How old is your parrot? ");
        parrot.setAge(scan.nextInt());

        System.out.println("Name: " + parrot.getName());
        System.out.println("Colour: " + parrot.getColour());
        System.out.println("Age: " + parrot.getAge());

    }
}