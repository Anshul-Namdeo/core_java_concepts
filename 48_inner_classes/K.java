class K 
{
    class T 
    {

    }

    public static void main(String args[])
    {
        K k = new K();

        K.T t1 = k.new T();
        K.T t2 = k.new T();
        K.T t3 = k.new T();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}

// D:\javaprac\48_inner_classes>javac K.java

// D:\javaprac\48_inner_classes>java K
// K$T@36baf30c
// K$T@7a81197d
// K$T@5ca881b5