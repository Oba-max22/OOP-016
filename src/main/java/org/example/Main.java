package org.example;

import org.example.anim.Animal;
import org.example.anim.Cat;
import org.example.anim.Dog;
import org.example.banksim.enums.Degree;
import org.example.banksim.enums.Role;
import org.example.banksim.models.Candidate;
import org.example.banksim.models.User;
import org.example.banksim.services.implementation.ManagerServiceImpl;
import org.example.calc.Calculator;

public class Main {

    public static void main(String[] args) {
        System.out.println(myFunc());

        /*
        *
        *
        * Calculator class
        *
        * two fields
        *
        * add()
        * subtract()
        * multiply()
        * divide()
        *
        * */

        Calculator calc = new Calculator(15.0, 5.0);
        System.out.println(calc);
        System.out.println("add : " + calc.add());
        System.out.println("subtract : " + calc.subtract());
        System.out.println("multiply : " + calc.multiply());
        System.out.println("divide : " + calc.divide());

        /*
         *
         *
         * Animal (Living Being)
         *
         * Dog, Cat, Cow, Man
         *
         * pair of eyes
         * legs
         * mouth / snout
         *
         * move -> run, fly, swim
         * eat -> vegetables, meat
         * makeSound -> bark, meow, moo, speak
         *
         *
         * IS-A
         * Dog is an Animal
         * Cat is an Animal
         *
         *            Animal (Parent)
         *              |
         *           ________
         *          |        |
         *         Cat      Dog (Child)
         *          |         |
         *        Siamese    BullDog
         *
         * */

        /*
         * Pillars Of OOP
         *
         * Encapsulation
         * Abstraction
         * Inheritance
         * Polymorphism
         *
         * */

        Animal animal = new Cat(true, 4);
        System.out.println(animal.IS_ALIVE);

        Cat cat = new Cat(true, 4);
        cat.makeSound();

        Dog dog = new Dog(true, 4);
        dog.makeSound();

        System.out.println(dog.move("Dog is running!"));
        System.out.println(dog.move("mario", "Dog is jumping!"));
        System.out.println(dog.move());

        /*
        *
        * Bank OOP Example
        *
        * Users : Manager, Tellers, Customer Service, Customers
        *
        * hireStaff() - Manager
        * fireStaff() - Manager
        *
        * apply() - Candidate
        *
        * withdrawFunds() - Customers
        * depositFunds() - Customers
        * layComplaints() - Customers
        *
        * addressComplaints() - CustomerService
        *
        *
        * */

        User managerA = new User(
                "manager1@companyname.com",
                "Ololademi",
                "Asake",
                    Role.MANAGER
                );

        User angryCustomer = new User(
                "angrycust123@gmail.com",
                "Emmanuel",
                "Aribatise",
                Role.CUSTOMER
        );

        System.out.println(managerA);
        System.out.println(angryCustomer);

        Candidate candidate = new Candidate("johnny23@gmail.com",
                "John",
                "Bull",
                Role.STAFF_CANDIDATE,
                true,
                Degree.POST_GRADUATE,
                28,
                5
                );

        ManagerServiceImpl managerService = new ManagerServiceImpl();

        System.out.println(managerService.hireStaff(angryCustomer, candidate));
        System.out.println(managerService.hireStaff(managerA, candidate));
    }

    public static String myFunc() {
        System.out.println("we ran a method");
        return "Some random text.";
    }
}