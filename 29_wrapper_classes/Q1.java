class Q1 {

    public static void main(String args[])
    {
        byte x = pro();

        System.out.println(x);
    }

    static byte pro(){

            
        return  130;
    }
}

// D:\javaprac\29_wrapper_classes>javac Q1.java
// Q1.java:13: error: incompatible types: possible lossy conversion from int to byte
//         return  130;
//                 ^
// 1 error