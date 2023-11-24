package day05.Random;

import java.util.Random;

public class Quiz_Lotto {
	public static void main(String[] args) {
	  int[] lotto = new int[6];

        Random rand = new Random();

        for(int i=0;i<6;i++){
            int pick = rand.nextInt(45) + 1;
            lotto[i] = pick;
            
            for(int j=0;j<i;j++){
                if(lotto[j] == pick){
                    i--;
                    break;
                }
            }
        }

        for(int k: lotto)
            System.out.print(k + "\t");
        System.out.println();
    }
}
