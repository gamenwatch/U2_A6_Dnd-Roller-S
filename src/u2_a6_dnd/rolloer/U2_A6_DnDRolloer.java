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
     * @return diceTotal ~ The sum of all the rolls
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
    
    /**
     * Rolls the d3 dice the requested number of times
     * @param DTHREE ~ The max for a d3 dice
     * @param rollXTimes ~ How many times should it be rolled
     * @return diceTotal ~ The sum of all the rolls
     */
    public static int dthreeRoll(final int DTHREE, int rollXTimes) {
        //Random Generation
        Random randGen = new Random();
        
        int diceTotal = 0; // sum of the rolls
        
        //generate random digits
            int []diceRoll = new int [rollXTimes];
            
            for (int i = 0; i < rollXTimes; i = i+1) // ROLL THE DICE
            {
                diceRoll[i] = 0; //clear the previous
                diceRoll[i] = 1 + randGen.nextInt(DTHREE);
               System.out.println("Roll:"+diceRoll[i]); //displayed for tetsing
            }
            
            for (int i = 0; i < rollXTimes; i = i+1) // SUM THE ROLLS
            {
               diceTotal = diceTotal + diceRoll[i];
            }
            
            System.out.println("");
        
        return diceTotal;
                
    }
    
    /**
     * Rolls the d4 dice the requested number of times
     * @param DFOUR ~ The max for a d4 dice
     * @param rollXTimes ~ How many times should it be rolled
     * @return diceTotal ~ The sum of all the rolls
     */
    public static int dfourRoll(final int DFOUR, int rollXTimes) {
        //Random Generation
        Random randGen = new Random();
        
        int diceTotal = 0; // sum of the rolls
        
        //generate random digits
            int []diceRoll = new int [rollXTimes];
            
            for (int i = 0; i < rollXTimes; i = i+1) // ROLL THE DICE
            {
                diceRoll[i] = 0; //clear the previous
                diceRoll[i] = 1 + randGen.nextInt(DFOUR);
               System.out.println("Roll:"+diceRoll[i]); //displayed for tetsing
            }
            
            for (int i = 0; i < rollXTimes; i = i+1) // SUM THE ROLLS
            {
               diceTotal = diceTotal + diceRoll[i];
            }
            
            System.out.println("");
        
        return diceTotal;
                
    }
    
    /**
     * Rolls the d6 dice the requested number of times
     * @param DSIX ~ The max for a d6 dice
     * @param rollXTimes ~ How many times should it be rolled
     * @return diceTotal ~ The sum of all the rolls
     */
    public static int dsixRoll(final int DSIX, int rollXTimes) {
        //Random Generation
        Random randGen = new Random();
        
        int diceTotal = 0; // sum of the rolls
        
        //generate random digits
            int []diceRoll = new int [rollXTimes];
            
            for (int i = 0; i < rollXTimes; i = i+1) // ROLL THE DICE
            {
                diceRoll[i] = 0; //clear the previous
                diceRoll[i] = 1 + randGen.nextInt(DSIX);
               System.out.println("Roll:"+diceRoll[i]); //displayed for tetsing
            }
            
            for (int i = 0; i < rollXTimes; i = i+1) // SUM THE ROLLS
            {
               diceTotal = diceTotal + diceRoll[i];
            }
            
            System.out.println("");
        
        return diceTotal;
                
    }
    
    /**
     * Rolls the d8 dice the requested number of times
     * @param DEIGHT ~ The max for a d8 dice
     * @param rollXTimes ~ How many times should it be rolled
     * @return diceTotal ~ The sum of all the rolls
     */
    public static int deightRoll(final int DEIGHT, int rollXTimes) {
        //Random Generation
        Random randGen = new Random();
        
        int diceTotal = 0; // sum of the rolls
        
        //generate random digits
            int []diceRoll = new int [rollXTimes];
            
            for (int i = 0; i < rollXTimes; i = i+1) // ROLL THE DICE
            {
                diceRoll[i] = 0; //clear the previous
                diceRoll[i] = 1 + randGen.nextInt(DEIGHT );
               System.out.println("Roll:"+diceRoll[i]); //displayed for tetsing
            }
            
            for (int i = 0; i < rollXTimes; i = i+1) // SUM THE ROLLS
            {
               diceTotal = diceTotal + diceRoll[i];
            }
            
            System.out.println("");
        
        return diceTotal;
                
    }
    
    /**
     * Rolls the d10 dice the requested number of times
     * @param DTEN ~ The max for a d10 dice
     * @param rollXTimes ~ How many times should it be rolled
     * @return diceTotal ~ The sum of all the rolls
     */
    public static int dtenRoll(final int DTEN, int rollXTimes) {
        //Random Generation
        Random randGen = new Random();
        
        int diceTotal = 0; // sum of the rolls
        
        //generate random digits
            int []diceRoll = new int [rollXTimes];
            
            for (int i = 0; i < rollXTimes; i = i+1) // ROLL THE DICE
            {
                diceRoll[i] = 0; //clear the previous
                diceRoll[i] = 1 + randGen.nextInt(DTEN );
               System.out.println("Roll:"+diceRoll[i]); //displayed for tetsing
            }
            
            for (int i = 0; i < rollXTimes; i = i+1) // SUM THE ROLLS
            {
               diceTotal = diceTotal + diceRoll[i];
            }
            
            System.out.println("");
        
        return diceTotal;
                
    }
    
    /**
     * Rolls the d20 dice the requested number of times
     * @param DTWENTY ~ The max for a d20 dice
     * @param rollXTimes ~ How many times should it be rolled
     * @return diceTotal ~ The sum of all the rolls
     */
    public static int dtwentyRoll(final int DTWENTY, int rollXTimes) {
        //Random Generation
        Random randGen = new Random();
        
        int diceTotal = 0; // sum of the rolls
        
        //generate random digits
            int []diceRoll = new int [rollXTimes];
            
            for (int i = 0; i < rollXTimes; i = i+1) // ROLL THE DICE
            {
                diceRoll[i] = 0; //clear the previous
                diceRoll[i] = 1 + randGen.nextInt(DTWENTY );
               System.out.println("Roll:"+diceRoll[i]); //displayed for tetsing
            }
            
            for (int i = 0; i < rollXTimes; i = i+1) // SUM THE ROLLS
            {
               diceTotal = diceTotal + diceRoll[i];
            }
            
            System.out.println("");
        
        return diceTotal;
                
    }
    
    /**
     * Changes boolean to terminate the program
     * @param continueLoop ~ True means the menu will reopen once the previous roll is finished
     * @return continueLoop ~ The sum of all the rolls
     */
    public static boolean exitLaunch(boolean continueLoop) {
        System.out.println("\nThanks for using us. Happy adventuring!");
        continueLoop = false;
        return continueLoop;
        
    }
    
    ///////////////////////////////////////MAIN/////////////////////////////
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables & Constants
        Scanner keyedInput = new Scanner(System.in); //to navigate menu
        Random randGen = new Random(); //for dice rolls
        boolean continueLoop = true; //menu will run till false
        int rollXTimes; //how many times the dice will be rolled
        
        //Dice Types
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
                    rollXTimes = rollTimes();    
                    System.out.println("The sum of the rolls is: "+dtwoRoll(DTWO, rollXTimes)+"\n");
                    break;
                case 2: //d3
                    rollXTimes = rollTimes();    
                    System.out.println("The sum of the rolls is: "+dthreeRoll(DTHREE, rollXTimes)+"\n");
                    break;
                case 3: //d4
                    rollXTimes = rollTimes();    
                    System.out.println("The sum of the rolls is: "+dfourRoll(DFOUR, rollXTimes)+"\n");
                    break;
                case 4: //d6
                    rollXTimes = rollTimes();    
                    System.out.println("The sum of the rolls is: "+dsixRoll(DSIX, rollXTimes)+"\n");
                    break;
                case 5: //d8
                    rollXTimes = rollTimes();    
                    System.out.println("The sum of the rolls is: "+deightRoll(DEIGHT, rollXTimes)+"\n");
                    break;
                case 6: //d10
                    rollXTimes = rollTimes();    
                    System.out.println("The sum of the rolls is: "+dtenRoll(DTEN, rollXTimes)+"\n");
                    break;
                case 7: //d20
                    rollXTimes = rollTimes();    
                    System.out.println("The sum of the rolls is: "+dtwentyRoll(DTWENTY, rollXTimes)+"\n");
                    break;
                case 8: //close program
                    continueLoop = exitLaunch(continueLoop);
                    break;
            }
        }
    }
    
}
