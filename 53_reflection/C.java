class C 
{
    public static void main(String args[])
    {
        Class klass = Class.forName("C");

        System.out.println(klass);
        System.out.println(klass.toString());
        System.out.println(klass.getName());
    }
}


// D:\javaprac\53_reflection>javac C.java
// C.java:5: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
//         Class klass = Class.forName("C");
//                                    ^
// 1 error