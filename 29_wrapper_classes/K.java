class K 
{
    public static void main(String args[])
    {
        int a = 56;

        Byte x = a;
        Short y = a;
        Character z = a;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}


// D:\javaprac\29_wrapper_classes>javac K.java
// K.java:7: error: incompatible types: int cannot be converted to Byte
//         Byte x = a;
//                  ^
// K.java:8: error: incompatible types: int cannot be converted to Short
//         Short y = a;
//                   ^
// K.java:9: error: incompatible types: int cannot be converted to Character
//         Character z = a;
//                       ^
// 3 errors
