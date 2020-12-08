/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hnclayton
 */
import java.util.Scanner;

public class myKitchenAppHC {
	myKitchenHC kitchen;
	Scanner input;

public myKitchenAppHC() {
    this.kitchen = new myKitchenHC(0, 0, 0, 0);
    this.input = new Scanner(System.in);
}

public void printMenu() {
    System.out.println("1) Create kitchen");
    System.out.println("2) Update status of an appliance");
    System.out.println("3) Get appliance statuses");
    System.out.println("4) Exit");
}

public void createKitchen() {
    System.out.println("Number of fridges: ");
    int numFridges = this.input.nextInt();

    System.out.println("Number of microwaves: ");
    int numMicrowaves = this.input.nextInt();

    System.out.println("Number of stoves: ");
    int numStoves = this.input.nextInt();

    System.out.println("Number of dishwashers: ");
    int numDishwashers = this.input.nextInt();

    this.kitchen = new myKitchenHC(numFridges, numMicrowaves, numStoves, numDishwashers);
}


public boolean runChoice() {
    System.out.println("Enter a choice: ");
    int choice = this.input.nextInt();

    switch (choice) {
        case 1 -> {
            this.createKitchen();
            return true;
                }
        case 2 -> {
            this.kitchen.updateApplianceStatus(this.input);
            return true;
                }
        case 3 -> {
            this.kitchen.printApplianceStatus();
            return true;
                }
        case 4 -> {
            System.out.println("Good bye!");
            return false;
                }
        default -> {
            System.out.println("I don't know how to do that.");
            return true;
                }
    }
}

public static void main(String[] args) {
    myKitchenAppHC app = new myKitchenAppHC();

    while (true) {
        app.printMenu();
        if (!app.runChoice()) {
            System.exit(0);
        }
    }
  }
}

    
