import java.util.Scanner;

class A {
    public static void main(String args[]){

        Scanner cs = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = cs.next();

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println(name);

        cs.close();
    }
}

// Enter your name :ram
// !!!!!!!!!!!!!!!!!!!!!!!!!!!
// ram

// D:\javaprac\input>java A
// Enter your name :ram kumar
// !!!!!!!!!!!!!!!!!!!!!!!!!!!
// ram