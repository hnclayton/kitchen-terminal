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

public class myMicrowaveHC {
	boolean isOpen;

    public myMicrowaveHC() {
        this.isOpen = false;
    }

    public String getStatus() {
        if (this.isOpen) {
            return "open";
        } else {
            return "closed";
        }
    }

    public void updateStatus(Scanner input) {
        System.out.println("1) Open");
        System.out.println("2) Close");

        System.out.println("Enter a choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                this.isOpen = true;
                break;
            case 2:
                this.isOpen = false;
                break;
            default:
                System.out.println("I don't know how to do that.");
                break;
        }
    }

}

   
