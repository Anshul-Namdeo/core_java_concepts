package a.b;

class D1 
{
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class klass = Class.forName("a.b.Teachar");

        System.out.println(klass);
    }
}

// D:\javaprac\x-misc>javac a/b/D1.java

// D:\javaprac\x-misc>java a/b/D1
// Exception in thread "main" java.lang.ClassNotFoundException: a.b.Teachar
//         at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
//         at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
//         at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
//         at java.base/java.lang.Class.forName0(Native Method)
//         at java.base/java.lang.Class.forName(Class.java:375)
//         at a.b.D1.main(D1.java:7)

// D:\javaprac\x-misc>


/**** isa code mai koi bhi lagti nhi hai hame pahle teachar class ko compile krna padhega usa ke bad hum D1 class ko compile than run karenge *******/