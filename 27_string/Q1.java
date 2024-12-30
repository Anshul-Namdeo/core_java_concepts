
import java.util.Scanner;

public class Q1 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("\n Enter your age : ");
        int age = sc.nextInt();

        System.out.print("\n Enter your marks : ");
        float marks = sc.nextFloat();

        // String str = String.format("My name is : %s, My age is : %d and My marks : %f", name, age, marks);
        // System.out.println(str);

        System.out.println("My name is : name, My age is : age and My marks : marks");
        


    }
    
}


// D:\javaprac\27_string>javac Q1.java

// D:\javaprac\27_string>java Q1
// Enter your name : anshuk

//  Enter your age : 15

//  Enter your marks : 45
// My name is : name, My age is : age and My marks : marks
