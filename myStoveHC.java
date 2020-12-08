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

public class myStoveHC {
boolean isOn;

public myStoveHC() {
    this.isOn = false;
}

public String getStatus() {
    if (this.isOn) {
        return "on";
    } else {
        return "off";
    }
}

public void updateStatus(Scanner input) {
    System.out.println("1) Turn on");
    System.out.println("2) Turn off");

    System.out.println("Enter a choice: ");
    int choice = input.nextInt();

    switch (choice) {
        case 1:
            this.isOn = true;
            break;
        case 2:
            this.isOn = false;
            break;
        default:
            System.out.println("I don't know how to do that.");
            break;
    	}
    }
    
}
