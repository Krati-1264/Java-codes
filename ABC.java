import java.util.Scanner;
public class ABC {
    // the easy Pattern practice
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
//        STAR PATTERN 13 =>
        for (int i = 0 ; i < n ; i++ ){
            for (int j = 1 ; j < (n-i) ; j++){
                System.out.print(j+" ");
            }
            for (int k = (n-i) ; k >= 1 ; k-- ){
                System.out.print(k+" ");
            }
            System.out.println();
        }

//        STAR PATTERN 12 =>
//        for (int i = 1 ; i <= n ; i++ ){
//            for (int j = i ; j <= n ; j++){
//                System.out.print(j+" ");
//            }
//            for (int k = 1 ; k < i ; k++ ){
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }

//        STAR PATTERN 11 =>
//        for (int i = 0 ; i < n ; i++ ){
//            for (int j = 1 ; j < (n-i) ; j++){
//                System.out.print(j+" ");
//            }
//            for (int k = (n-i) ; k >= 1 ; k-- ){
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }

//        STAR PATTERN 10 =>
//        for (int i = 1 ; i <= n ; i++ ){
//           for (int j = 1 ; j < i ; j++){
//                System.out.print(j+" ");
//            }
//           for (int k = i ; k >= 1 ; k-- ){
//               System.out.print(k+" ");
//           }
//           System.out.println();
//        }

//        STAR PATTERN 9 => using 7 and 8  (^_^)

//        STAR PATTERN 8 =>
//        for (int i = 0 ; i < n ; i++ ){
//           for (int j = n ; j >= n-i ; j--){
//                System.out.print(j+" ");
//            }
//           System.out.println();
//        }
//
////        STAR PATTERN 7 =>
//        for (int i = 1 ; i <= n ; i++ ){
//           for (int j = n ; j >= i ; j--){
//                System.out.print(j + " ");
//            }
//           System.out.println();
//        }

//          STAR PATTERN 6 => using 4 and 5  (^_^)

//         //        STAR PATTERN 5 =>
//         for (int i = 0 ; i < n ; i++ ) {
//            for (int j = 0; j < (i); j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0 ; k < n-i ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//         }
        //        STAR PATTERN 4 =>
//        for (int i = 0 ; i < n ; i++ ) {
//            for (int j = 0; j < (n - i-1); j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0 ; k <= i ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//         STAR PATTERN 3 => just remove equality in loop for j in pattern 2  (^_^)

//         STAR PATTERN 2 =>
//        for (int i = 0; i< n ;i++){
//            for (int j = 0 ; j <= (i) ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//         STAR PATTERN 1 =>
/*        for (int i = 0 ; i < n ; i++ ){
//           for (int j = 0 ; j < (n-i) ; j++){
//                System.out.print("* ");
//            }
//           System.out.println();
//        } */
    }

}
