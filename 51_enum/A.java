import java.util.Scanner;

class A 
{
    public static void main(String args[])
    {
        Scanner cs = new Scanner(System.in);

        System.out.print("Enter Adv java Start Day: ");
        String day = cs.nextLine();

        System.out.println("Start Day " + day);

        cs.close();
    }
}


// D:\javaprac\51_enum>javac A.java

// D:\javaprac\51_enum>java A
// Enter Adv java Start Day: FATHERSDAY
// Start Day FATHERSDAY