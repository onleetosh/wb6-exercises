package com.onleetosh.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declare an ArrayList of Person objects
        ArrayList<Person> person = new ArrayList<>();

        //create 10 Person objects and add them to the ArrayList
        person.add(new Person("Tashi", "Thompson", 26));
        person.add(new Person("Luis", "Asencio", 30));
        person.add(new Person("Travis", "Scott", 31));
        person.add(new Person("Nancy", "Drew", 20));
        person.add(new Person("Tommy", "Thompson", 65));
        person.add(new Person("Nicholas", "Scratch", 8));
        person.add(new Person("Wanda", "Vision", 21));
        person.add(new Person("Tony", "Stark", 38));
        person.add(new Person("Peter", "Parker", 18));
        person.add(new Person("Micheal", "Jordan", 57));


        /**
         * Prompt the user for a name to search (first or last).
         * Using a for loop, create a new List of people whose name was a match, display
         * the names of the people in that list
         */

        //Prompt a name
        System.out.println("Enter a first or last name to search: ");
        String name = input.nextLine();

        //declare a List to store results
        List<Person> result = new ArrayList<>();

        System.out.println("Returning names matching input..... ");
        // "i" represents each Person object as the loop runs through the collection.
        // for every Person object in the collection, assign it to the variable "i"
        for (Person i : person){
            if (i.getFirstName().equalsIgnoreCase(name) || i.getLastName().equalsIgnoreCase(name)){
                result.add(i); //add match to list of results
                System.out.println(i); // display results as toString()
            }
        }
        // If no matches are found "isEmpty" print "No match found."
        if (result.isEmpty()) {
            System.out.println("No match found.");
        }


        //Prompt for part of a name
        System.out.println("Enter a parts of a persons name to search. ");
        String part = input.nextLine();

        //declare a List to store results
        List<Person> startWith = new ArrayList<>();

        System.out.println("Returning names starting with input..... ");
        // "i" represents each Person object as the loop runs through the collection.
        // for every Person object in the collection, assign it to the variable "i"
        for (Person i : person){
            if (i.getFirstName().startsWith(part) || i.getLastName().startsWith(part)){
                startWith.add(i); //add match to list of results
                System.out.println(i); // display results as toString()
            }
        }
        // If no matches are found "isEmpty" print "No match found."
        if (result.isEmpty()) {
            System.out.println("No match found.");
        }


        /**
         * Calculate the average age of all people in the original list and display it.
         * Display the age of the oldest person in the list.
         * Display the age of the youngest person in the list.
         */

        int totalAge = 0;
        // Initialize maxAge to the smallest possible int value to find the oldest person's age
        int maxAge = Integer.MIN_VALUE;

        // Initialize minAge to the largest possible int value to find the youngest person's age
        int minAge = Integer.MAX_VALUE;

        for (Person p : person) {
            totalAge += p.getAge();// add ages

            if (p.getAge() > maxAge) {
                maxAge = p.getAge(); // Find the oldest person

            }

            if (p.getAge() < minAge) {
                minAge = p.getAge(); // Find the youngest person

            }
        }

        // Calculate the average age
        int averageAge = totalAge / person.size();

        // Display results
        System.out.println("\nAverage age: " + averageAge);
        System.out.println("Oldest person is " + maxAge + " years old.");
        System.out.println("Youngest person is " + minAge + " years old.");
    }


    }


