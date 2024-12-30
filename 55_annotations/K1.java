class BB 
{
    @Deprecated
    int age ;

    @Deprecated
    static float marks;
}

class K1 
{
    public static void main(String args[])
    {
        BB k = new BB();

        System.out.println(k.age);
        System.out.println(k.marks);
    }
}


// D:\javaprac\55_annotations>javac K1.java
// Note: K1.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.

// D:\javaprac\55_annotations>java K
// 0
// 0.0