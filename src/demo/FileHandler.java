package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    File file = new File("data/helloworld.txt");

    public String readFile(int amount){
        String result = "";
        try {
            Scanner sc = new Scanner(file);
            String text = "";
            while(sc.hasNextLine()){
                text += sc.nextLine();
            }
            String[] temp = text.split("");
            if(amount > temp.length){
                return "the text only has " + temp.length + " letters.";
            }
            for (int i = 0; i < amount; i++) {
                result += temp[i];
            }
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
