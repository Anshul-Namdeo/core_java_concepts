import java.util.Scanner;

class E{
    public static void main(String agrs[]){

        Scanner sc = new Scanner(System.in);

        Student[] x = new Student[3];

        for( Student s : x){
            System.out.print(s + " ");
        }
        System.out.println("!@#$%^&*@#$%^&!@#$%^&*()");

        for(int i=0 ; i<x.length ; i++){
            System.out.print("Enter your name :");
            String name = sc.nextLine();
             System.out.print("Enter your age :");
             int age = sc.nextInt();
             x[i] = new Student(name, age);
             sc.nextLine();
        }

             for( Student s : x){
            System.out.print(s + " ");
        }
            sc.close();
    }
}

// null null null !@#$%^&*@#$%^&!@#$%^&*()
// Enter your name :anshul
// Enter your age :19
// Enter your name :pratham 
// Enter your age :20
// Enter your name :aayansh
// Enter your age :18
// anshul 19 pratham  20 aayansh 18 