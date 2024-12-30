interface KK 
{
    void info();
}

class S 
{
    int y = 222;

    static KK j = new KK() {
        public void info()
        {
            System.out.println(y);
        }
    };

    public static void main(String args[])
    {
        S.j.info(); 
    }
}

// D:\javaprac\49_inner_classes>javac S.java
// S.java:13: error: non-static variable y cannot be referenced from a static context
//             System.out.println(y);
//                                ^
// 1 error