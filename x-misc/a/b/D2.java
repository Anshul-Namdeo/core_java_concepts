package a.b;

class D2
{
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class klass = Class.forName("a.b.Teachar");

        System.out.println(klass);
    }
}

// D:\javaprac\x-misc>javac a/b/Teachar.java

// D:\javaprac\x-misc>javac a/b/D2.java

// D:\javaprac\x-misc>java a/b/D2
// class a.b.Teachar