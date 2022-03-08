package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    File file = new File("data/helloworld.txt");



    //input1 = how many letters
    //input2 = how many times
    public String readText(int input1, int input2){
        String result = "";

        try{
            Scanner sc = new Scanner(file);
            String text = "";
            while(sc.hasNextLine()){
                text += sc.nextLine();
            }
            String[] temp = text.split("");
            int count = 0;
            for (int i = 0; i < input2; i++) {
                result += "'";
                for (int j = 0; j < input1; j++) {
                    if(!(count >= temp.length)){
                        result += temp[count];
                        count++;
                    }
                }
                result += "', ";
            }
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
