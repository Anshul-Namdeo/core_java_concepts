import java.util.Scanner;

class D{
    public static void main(String agrs[]){

        Scanner sc = new Scanner(System.in);

        System.out.print(" enter the number: ");
        int n  = sc.nextInt();

        String[] names = new String[n];

        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.print("Enter your name :");
            names[i] = sc.nextLine();
        }

         System.out.println("__________________________");

         for( String name : names){
            System.out.println(name);
         }
    }
}

// D:\javaprac\25_arrays>javac D.java

// D:\javaprac\25_arrays>java D
//  enter the number: 3
// Enter your name :anshul
// Enter your name :pratham
// Enter your name :aayansh
// __________________________
// anshul
// pratham
// aayansh
