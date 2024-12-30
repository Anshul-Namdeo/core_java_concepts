class B 
{
    public static void main(String args[])
    {
        String s = "mohan";
        System.out.println("s: " +s);

        String t = s.toUpperCase();

        System.out.println("t: " +t);
        System.out.println("s: " +s);
    }
}

// D:\javaprac\58_immutable_class>javac B.java

// D:\javaprac\58_immutable_class>java B
// s: mohan
// t: MOHAN
// s: mohan