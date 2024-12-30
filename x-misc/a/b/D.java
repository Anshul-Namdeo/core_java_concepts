package a.b;

class D
{
    public static void main(String[] args) {
        
        Class klass = Class.forName("a.b.Teachar");

        System.out.println(klass);
    }
}
// D:\javaprac\x-misc>javac a/b/D.java
// a\b\D.java:7: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
//         Class klass = Class.forName("a.b.Teachar");
//                                    ^
// 1 error