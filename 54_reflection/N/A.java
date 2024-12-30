class A 
{
    public static void main(String args[])
    {
        Class k = X.M.Y.class;

        System.out.println(k.getName());

        Class k1 = k.getEnclosingClass();

        System.out.println(k1.getName());

        Class k2  = k1.getEnclosingClass();

        System.out.println(k2.getName());
    }
}

// D:\javaprac\54_reflection\N>javac A.java

// D:\javaprac\54_reflection\N>java A
// X$M$Y
// X$M
// X
