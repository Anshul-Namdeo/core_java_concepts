import java.util.Date;

class Y2
{
    void process(int aaa, String bbb, float ccc, Date ddd)
    {
        System.out.println("hello ji");
    }
}

class B2 extends Y2
{
    @Override
    void process(int a1, String b1, float c1, Date d1)
    {
        System.out.println("hi ji");
    }

    public static void main(String args[])
    {
        Y2 y = new B2();
        
        y.process(12, "om", 56.3f, new Date());
    }
}


// D:\javaprac\55_annotations>javac B2.java

// D:\javaprac\55_annotations>java B2
// hi ji