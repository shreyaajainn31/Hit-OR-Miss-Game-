import java.util.*;

public class HitOrMissTestDrive {
    public static void main(String[] args) {
        HitOrMiss hm = new HitOrMiss();
        int[]locations = {2,3,4};
        hm.setLocationCells(locations);
        String guess = "";
        Scanner sc = new Scanner(System.in);
        while(hm.numOfHits != 3){
            System.out.print("Enter your guess: ");
            guess = sc.next();
            System.out.println(hm.sunkOrNot(guess));
        }
        
    }
}
