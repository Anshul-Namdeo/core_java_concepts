class A 
{
    public static void main(String args[])
    {
        Class k = B.class;

        Class[] ks = k.getDeclaredClasses();

        for(Class klass: ks)
        {
            System.out.println(klass.getName());
        }
    }
}

// D:\javaprac\54_reflection\M>javac A.java

// D:\javaprac\54_reflection\M>java A
// B$O
// B$N
// B$M