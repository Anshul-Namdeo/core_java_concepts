import java.util.Scanner;

public class Q {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("\n Enter your age : ");
        int age = sc.nextInt();

        System.out.print("\n Enter your marks : ");
        float marks = sc.nextFloat();

        String str = String.format("My name is : %s, My age is : %d and My marks : %f", name, age, marks);
        System.out.println(str);


    }
    
}

// D:\javaprac\27_string>javac Q.java

// D:\javaprac\27_string>java Q
// Enter your name : anshul

//  Enter your age : 18

//  Enter your marks : 58
// My name is : anshul, My age is : 18 and My marks : 58.000000