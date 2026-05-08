/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javpoker;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Aden5
 */
public class JavPoker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Number of Rolls:");
        Scanner Scn = new Scanner(System.in);
        int Rolls = Scn.nextInt();
        //int Rollers[][] = new int[Rolls][];
        int[][] bag = javPokerRun.getSet(Rolls);
        int[] stats = javPokerRun.checkSet(bag);
        float[] finalStats = javPokerRun.checkStats(stats, Rolls);
        System.out.println("------------------------");
        System.out.println("Number of Yahtzees: " + stats[0]);
        System.out.println("Yahtzee percent: " + finalStats[0] + "%");
        System.out.println("------------------------");
        System.out.println("Number of Full Houses: " + stats[1]);
        System.out.println("Full House percent: " + finalStats[1] + "%");
        System.out.println("------------------------");
        System.out.println("Number of Large Straights: " + stats[2]);
        System.out.println("Large Straight Percent: " + finalStats[2] + "%");
        System.out.println("------------------------");
        System.out.println("Number of Four of a kind: " + stats[3]);
        System.out.println("Four of a kind percent: " + finalStats[3] + "%"); 
        System.out.println("------------------------");
        System.out.println("Three of a kind: " + stats[4]);
        System.out.println("Three of a kind percent: " + finalStats[4] + "%");
        System.out.println("------------------------");
        System.out.println("Losers: " + stats[5]);
        System.out.println("Losers Percentage: " + finalStats[5] + "%");
        
        
    }
    
}
