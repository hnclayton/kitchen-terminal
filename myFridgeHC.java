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


public class myFridgeHC {
	boolean hasFood;
	boolean isOpen;

public void myFridgeHC() {
    this.hasFood = false;
    this.isOpen = false;
}

public String getFoodStatus() {
    if (this.isOpen) {
        return "has food";
    } else {
        return "no food";
    }
}

public String getOpenStatus() {
    if (this.isOpen) {
        return "open";
    } else {
        return "closed";
    }
}

public String getStatus() {
    return this.getFoodStatus() + " and " + this.getOpenStatus();
}

public void updateStatus(Scanner input) {
    System.out.println("1) Add food");
    System.out.println("2) Take food");
    System.out.println("3) Open");
    System.out.println("4) Close");

    System.out.println("Enter a choice: ");
    int choice = input.nextInt();

    switch (choice) {
        case 1:
            this.hasFood = true;
            break;
        case 2:
            this.hasFood = false;
            break;
        case 3:
            this.isOpen = true;
            break;
        case 4:
            this.isOpen = false;
            break;
        default:
            System.out.println("I don't know how to do that.");
            break;
    }
}

}

