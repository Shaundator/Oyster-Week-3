package demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input -1 to end program.");
        while(true) {
            System.out.print("How many letters should be read: ");
            String input1 = sc.nextLine();
            System.out.print("How many times should it be read: ");
            String input2 = sc.nextLine();
            if(input1.equals("-1")||input2.equals("-1")){
                break;
            }
            if(input1.matches("\\d+")&&input2.matches("\\d+")){
                int intInput1 = Integer.parseInt(input1);
                int intInput2 = Integer.parseInt(input2);
                System.out.println(fh.readText(intInput1, intInput2));
            } else {
                System.out.println("Please write positive numbers only...");
            }
        }

    }
}
