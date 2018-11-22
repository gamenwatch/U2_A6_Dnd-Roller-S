/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a6_dnd.rolloer;

//Bring in Scanner and Random
import java.util.Scanner;
import java.util.Random;

/**
 * Jacob Lacey
 * Nov 21, 2018
 * Allows you to roll a vast amount of different dies
 */
public class U2_A6_DnDRolloer {
    
    /**
     * This method displays all of the dice options and an exit
     */
    public static void introLaunch() {
        System.out.println("~~DnD Dice Roller~~");
        System.out.println("Select Select a Type of Dice to Roll");
        System.out.println("\t(1) D2");
        System.out.println("\t(2) D3");
        System.out.println("\t(3) D4");
        System.out.println("\t(4) D6");
        System.out.println("\t(5) D8");
        System.out.println("\t(6) D10");
        System.out.println("\t(7) D20");
        System.out.println("\t(8) Exit");
    }
    
    /**
     * Get How Many Times You Want To Roll
     * @return rollXTimes ~ How many times will you roll the dice
     */
    public static int rollTimes() {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        System.out.println("How many times do you want to roll the dice?");
        int rollXTimes = keyedInput.nextInt();
        System.out.println(""); //spacing
        return rollXTimes;
    }
    
    /**
     * Rolls the d2 dice the requested number of times
     * @param DTWO ~ The max for a d2 dice
     * @param rollXTimes ~ How many times should it be rolled
     * @return total ~ null
     */
    public static int dtwoRoll(final int DTWO, int rollXTimes) {
        //Random Generation
        Random randGen = new Random();
        
        int diceTotal = 0; // sum of the rolls
        
        //generate random digits
            int []diceRoll = new int [rollXTimes];
            
            for (int i = 0; i < rollXTimes; i = i+1) // ROLL THE DICE
            {
                diceRoll[i] = 0; //clear the previous
                diceRoll[i] = 1 + randGen.nextInt(DTWO);
               System.out.println("Roll:"+diceRoll[i]); //displayed for tetsing
            }
            
            for (int i = 0; i < rollXTimes; i = i+1) // SUM THE ROLLS
            {
               diceTotal = diceTotal + diceRoll[i];
            }
            
            System.out.println("");
        
        return diceTotal;
                
    }
    
    ///////////////////////////////////////MAIN/////////////////////////////
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables / Constants
        Scanner keyedInput = new Scanner(System.in);
        Random randGen = new Random();
        boolean continueLoop = true;
        
        //Dice Types (Double for random later)
        final int DTWO = 2;
        final int DTHREE = 3;
        final int DFOUR = 4;
        final int DSIX = 6;
        final int DEIGHT = 8;
        final int DTEN =10;
        final int DTWENTY = 20;
        
        while (continueLoop == true) {
            //Introduction
            introLaunch();
            
            //Select option
            int choicePick = keyedInput.nextInt(); //what option do you want
            
            switch (choicePick) {
                case 1: //d2
                    int rollXTimes;
                    rollXTimes = rollTimes();    
                    System.out.println("The sum of the rolls is: "+dtwoRoll(DTWO, rollXTimes)+"\n");
            }
        }
    }
    
}
