package Test1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int randNum = rand.nextInt(9) + 1;
        System.out.println(randNum);
        System.out.println("Wassup, man");
        
    }
    
}