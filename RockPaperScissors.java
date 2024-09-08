import java.util.*;
public class RockPaperScissors {
    //-----------Rock paper scissors using "Random" class in java and using basic logics of java----------------
    public static void main(String[] args) {
        Random comp = new Random();
        Scanner scan = new Scanner(System.in);
        int w = 0 , l = 0, d = 0 ;
        for (int a = 0; a < 3; a++) {
            System.out.println("Enter 1, 2 or 3 respectively for rock, paper, and scissors");
            int i = scan.nextInt();
            int j = comp.nextInt(3) + 1;
            System.out.println("The computer choice = " + j);
            if (i == j) {
                System.out.println("Its a draw !"); d++;
            } else if (j == 1) {
                switch (i) {
                    case 2 -> {
                        System.out.println("YOU WON"); w++;
                    }
                    case 3 -> {
                        System.out.println("YOU LOST"); l++;
                    }
                }
            } else if (j == 2) {
                switch (i) {
                    case 3 -> {
                        System.out.println("YOU WON"); w++;
                    }
                    case 1 -> {
                        System.out.println("YOU LOST"); l++;
                    }
                }
            } else if (j == 3) {
                switch (i) {
                    case 1 -> {
                        System.out.println("YOU WON") ; w++;
                    }
                    case 2 -> {
                        System.out.println("YOU LOST"); l++;
                    }
                }
            }
        }
        System.out.println("Total wins = " +w +" Total loses = " +l +" Total draws = " +d);
        if (w>l) {
            System.out.print("OVERALL YOU WON !!");
        }
        else if (w<l) {
            System.out.print("OVERALL YOU LOST ");
        }
    }
}

