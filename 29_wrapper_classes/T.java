class T 
{
    public static void main(String[] args) {
     
        Integer y = Integer.valueOf(66);

        pro(y); // unboxing.
    }

    static void pro(int x)
    {
        System.out.println(x);
    }
}


// D:\javaprac\29_wrapper_classes>javac T.java

// D:\javaprac\29_wrapper_classes>java T
// 66
