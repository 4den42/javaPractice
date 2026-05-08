/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javpoker;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Aden5
 */     
public class javPokerRun{
    //public static void checkValues(int Rolls){}
    public static int[][] getSet(int Rolls){
        int Strolls = Rolls;
        int bulls = Strolls;
        //System.out.println(Strolls);
        int[] barray = new int[5];
        int[][] Sets = new int[Rolls][];
        //int[] clearBarray = {0,0,0,0,0,0};
        Random Rd = new Random();
        //for(int i = 0; i < Strolls; i++){
            //System.out.println(i);
            //int n = 0;
        for(int i = 0; i < Rolls; i++){
            int[] ray = new int[5];
            barray = ray;
            for(int j = 0; j < 5; j++){
                
                
                int die = (Rd.nextInt(6)+1);         
                barray[j] = die;                
                            
            }
            Arrays.sort(barray);
            Sets[i] = barray;
            Strolls --;
        }
            //System.out.println(Arrays.deepToString(Sets));
        
        
        //getSets(barray, Strolls, bulls);
        
        //System.out.println(Arrays.toString(barray));

        //}
        return Sets;
        
    }
    
    public static int[] checkSet(int[][] barray){
        int yahtzee = 0;
        int fullHouse = 0;
        int largeStraight = 0;
        int fourKind = 0;
        int threeKind = 0;
        int loser = 0;
        int[] numbs = new int[6];
       
        //System.out.println(barray.length);
        //System.out.println(barray[0]);
        for(int i = 0; i < barray.length; i++){
            if(barray[i][0] == barray[i][4]){
                //System.out.println("Yahtzee!");
                //System.out.println(Arrays.toString(barray[i]));
                yahtzee += 1;
            }else if(barray[i][0] == barray[i][3] || barray[i][1] == barray[i][4]){
                //System.out.println("Four of a kind!");
                //System.out.println(Arrays.toString(barray[i]));
                fourKind ++;
            }else if(barray[i][0] == barray[i][2] && barray[i][3] == barray[i][4] || barray[i][2] == barray[i][4] && barray[i][0] == barray[i][1]){
                //System.out.println("Full House!");
                //System.out.println(Arrays.toString(barray[i]));
                fullHouse ++;
            }else if(barray[i][0] == barray[i][2] || barray[i][2] == barray[i][4] || barray[i][1] == barray[i][3]){
                    //System.out.println("Three of a kind!");
                    //System.out.println(Arrays.toString(barray[i]));
                    threeKind++;
            }else if(barray[i][0] == (barray[i][1] -1) && barray[i][1] == (barray[i][2] -1) && barray[i][2] == (barray[i][3] -1) && barray[i][3] == (barray[i][4] -1)){
                    //System.out.println("Large Straight!");
                    //System.out.println(Arrays.toString(barray[i]));
                    largeStraight ++;
            }else{
                //System.out.println("nada");
                loser ++;
            }           
        }
        numbs[0] = yahtzee;
        numbs[1] = fullHouse;
        numbs[2] = largeStraight;
        numbs[3] = fourKind;
        numbs[4] = threeKind;
        numbs[5] = loser;
        //System.out.println(Arrays.toString(numbs));
        return numbs;
    
            
        //System.out.println(yahtzee);
        
    }
    public static float[] checkStats(int[] stats,int Rolls){
        //System.out.println(Rolls);
        //System.out.println(stats[4]);
        int dull = Rolls;
        float bull = dull;
        
        float yaht = stats[0];
        yaht /= bull;
        yaht *= 100;
        float full = stats[1];
        full /= bull;
        full *= 100;
        float straight = stats[2];
        straight /= bull;
        straight *= 100;
        float four = stats[3];
        four /= bull;
        four *= 100;
        float three = stats[4];
        three /= bull;
        three *= 100;
        float los = stats[5];
        los /= bull;
        los *= 100;
        //System.out.println(three);
        float[] statty = new float[6];
        statty[0] = yaht;
        statty[1] = full;
        statty[2] = straight;
        statty[3] = four;
        statty[4] = three;
        statty[5] = los;
        //System.out.println(Arrays.toString(statty));
        return statty;  
        
        
    }
    
}

