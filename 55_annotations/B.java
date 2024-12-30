import java.util.Date;

class Y 
{
    void process(int aaa, String bbb, float ccc, Date ddd)
    {
        System.out.println("hello ji");
    }
}

class B extends Y 
{
    void process(int a1, String b1, Date c1, float d1)
    {
        System.out.println("hi ji");
    }

    public static void main(String args[])
    {
        Y y = new B();
        
        y.process(12, "om", 56.3f, new Date());
    }
}

// D:\javaprac\55_annotations>javac B.java

// D:\javaprac\55_annotations>java B
// hello ji