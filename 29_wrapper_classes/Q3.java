class Q3 {

    public static void main(String args[])
    {
        byte x = pro();

        System.out.println(x);
    }

    static byte pro(){

          int t = 55;
          
          byte a = 45;
        return  t;
    }
}


// D:\javaprac\29_wrapper_classes>javac Q3.java
// Q3.java:15: error: incompatible types: possible lossy conversion from int to byte
//         return  t;
//                 ^
// 1 error