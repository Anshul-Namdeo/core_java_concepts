class A 
{
    public static void main(String args[])
    {
        A x = new A();
        Class klass = x.getClass();

        System.out.println(klass);
        System.out.println(klass.toString());
        System.out.println(klass.getName());

    }
}

// D:\javaprac\53_reflection>javac A.java

// D:\javaprac\53_reflection>java A
// class A
// class A
// A