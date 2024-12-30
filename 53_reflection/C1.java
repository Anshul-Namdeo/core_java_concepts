class C1 
{
    public static void main(String args[]) throws ClassNotFoundException 
    {
        Class klass = Class.forName("C1");

        System.out.println(klass);
        System.out.println(klass.toString());
        System.out.println(klass.getName());
    }
}


// D:\javaprac\53_reflection>javac C1.java

// D:\javaprac\53_reflection>java C1
// class C1
// class C1
// C1