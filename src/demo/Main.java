package demo;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input -1 to end program.");
        while(true) {
            System.out.print("How many letters should be read: ");
            String input1 = sc.nextLine();
            if(input1.matches("\\d+")) {
                int input2 = Integer.parseInt(input1);
                if (input2 == -1) {
                    break;
                }
                System.out.println("\n\u001B[33m" + input2 + " letters were taken from the text:\u001B[0m\n" + fh.readFile(input2) + "\n");
            } else {
                System.out.println("Please write a number.");
            }
        }

    }
}
