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

public class myKitchenHC {
    myFridgeHC[] fridges;
    myMicrowaveHC[] microwaves;
    myStoveHC[] stoves;
    myDishwasherHC[] dishwashers;

 
	public myKitchenHC(int numFridges, int numMicrowaves, int numStoves, int numDishwashers) {
        this.fridges = new myFridgeHC[numFridges];
        for (int i = 0; i < numFridges; i++) {
            this.fridges[i] = new myFridgeHC();
        }

        this.microwaves = new myMicrowaveHC[numMicrowaves];
        for (int i = 0; i < numMicrowaves; i++) {
            this.microwaves[i] = new myMicrowaveHC();
        }

        this.stoves = new myStoveHC[numStoves];
        for (int i = 0; i < numStoves; i++) {
            this.stoves[i] = new myStoveHC();
        }

        this.dishwashers = new myDishwasherHC[numDishwashers];
        for (int i = 0; i < numDishwashers; i++) {
            this.dishwashers[i] = new myDishwasherHC();
        }
    }

    public void printApplianceStatus() {
        for (int i = 0; i < this.fridges.length; i++) {
            System.out.println("Fridge " + i + " status: " + this.fridges[i].getStatus());
        }

        for (int i = 0; i < this.microwaves.length; i++) {
            System.out.println("Microwave " + i + " status: " + this.microwaves[i].getStatus());
        }

        for (int i = 0; i < this.stoves.length; i++) {
            System.out.println("Stove " + i + " status: " + this.stoves[i].getStatus());
        }

        for (int i = 0; i < this.dishwashers.length; i++) {
            System.out.println("Dishwasher " + i + " status: " + this.dishwashers[i].getStatus());
        }
    }

    public void updateApplianceStatus(Scanner input) {
        System.out.println("1) Update a fridge");
        System.out.println("2) Update a microwave");
        System.out.println("3) Update a stove");
        System.out.println("4) Update a dishwasher");

        System.out.println("Enter a choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Which fridge [1-" + this.fridges.length + "]: ");
                int index = input.nextInt()-1;

                if (index >= this.fridges.length) {
                    System.out.println("I don't have that many fridges.");
                    break;
                }

                this.fridges[index].updateStatus(input);
                }

            case 2 -> {
                System.out.println("Which microwave [1-" + this.microwaves.length + "]: ");
                int index1 = input.nextInt()-1;

                if (index1 >= this.microwaves.length) {
                    System.out.println("I don't have that many microwaves.");
                    break;
                }

                this.microwaves[index1].updateStatus(input);
                }

            case 3 -> {
                System.out.println("Which stove [1-" + this.stoves.length + "]: ");
                int index2 =input.nextInt()-1;

                if (index2 >= this.stoves.length) {
                    System.out.println("I don't have that many stoves.");
                    break;
                }

                this.stoves[index2].updateStatus(input);
                }

            case 4 -> {
                System.out.println("Which dishwasher [1-" + this.dishwashers.length + "]: ");
                int index3 = input.nextInt()-1;

                if (index3 >= this.dishwashers.length) {
                    System.out.println("I don't have that many dishwashers.");
                    break;
                }

                this.dishwashers[index3].updateStatus(input);
                }

            default -> System.out.println("I don't know how to do that.");
        }

    }

}