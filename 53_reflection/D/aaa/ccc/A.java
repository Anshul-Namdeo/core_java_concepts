package aaa.ccc;
//import bbb.ddd.B;

class A 
{
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class klass = Class.forName("bbb.ddd.B");

        System.out.println(klass.getName());
    }
}

// D:\javaprac\53_reflection\D>javac aaa/ccc/A.java

// D:\javaprac\53_reflection\D>javac bbb/ddd/B.java

// D:\javaprac\53_reflection\D>java aaa/ccc/A
// bbb.ddd.B