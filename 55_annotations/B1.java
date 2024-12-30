import java.util.Date;

class Y1
{
    void process(int aaa, String bbb, float ccc, Date ddd)
    {
        System.out.println("hello ji");
    }
}

class B1 extends Y1
{
    @Override
    void process(int a1, String b1, Date c1, float d1)
    {
        System.out.println("hi ji");
    }

    public static void main(String args[])
    {
        Y1 y = new B1();
        
        y.process(12, "om", 56.3f, new Date());
    }
}

// D:\javaprac\55_annotations>javac B1.java
// B1.java:13: error: method does not override or implement a method from a supertype
//     @Override
//     ^
// 1 error