class A 
{
    public static void main(String args[]) throws ClassNotFoundException 
    {
        Class k1 = Class.forName("Student");

        Class k2 = k1.getSuperclass();

        System.out.println(k1.getName());
        System.out.println(k2.getName());
    }
}

// D:\javaprac\53_reflection\F>javac A.java

// D:\javaprac\53_reflection\F>javac Student.java

// D:\javaprac\53_reflection\F>java A
// Student
// User
