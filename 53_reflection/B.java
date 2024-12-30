class B 
{
    public static void main(String args[])
    {
        Class klass = B.class;

        System.out.println(klass);
        System.out.println(klass.toString());
        System.out.println(klass.getName());
    }
}

// D:\javaprac\53_reflection>javac B.java

// D:\javaprac\53_reflection>java B
// class B
// class B
// B
