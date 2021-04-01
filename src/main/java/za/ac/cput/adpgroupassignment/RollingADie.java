package za.ac.cput.adpgroupassignment;

import java.util.Random;

/**
 *
 * @author anathi mhlom 220006695
 * 
 * Rolling a 6-sided die
 */
public class RollingADie {

    public static void main(String[] args) {
        Random num = new Random();
    int d = num.nextInt(6) + 1;
    
    System.out.println("You rolled a: " +d);
    }
    
}


    

