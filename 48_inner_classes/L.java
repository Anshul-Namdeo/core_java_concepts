class L 
{
    class Y 
    {

    }

    public static void main(String ... args)
    {
        L l1 = new L();
        L l2 = new L();

        Y y1 = l1.new Y();
        Y y2 = l2.new Y();

        System.out.println(y1);
        System.out.println(y2);
    }
}

// D:\javaprac\48_inner_classes>javac L.java

// D:\javaprac\48_inner_classes>java L
// L$Y@36baf30c
// L$Y@7a81197d