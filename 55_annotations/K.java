class K 
{
    @Deprecated
    int age;

    @Deprecated
    static float marks;

    public static void main(String args[])
    {
        K k = new K();

        System.out.println(k.age);
        System.out.println(k.marks);
    }
}

// D:\javaprac\55_annotations>javac K.java

// D:\javaprac\55_annotations>java K
// 0
// 0.0