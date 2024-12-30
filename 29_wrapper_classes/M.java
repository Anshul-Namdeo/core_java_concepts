class M 
{
    public static void main(String args[])
    {
        Byte x = 421;
        Short y = 67600;
        Character z = 72000;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
// D:\javaprac\29_wrapper_classes>javac M.java
// M.java:5: error: incompatible types: int cannot be converted to Byte
//         Byte x = 421;
//                  ^
// M.java:6: error: incompatible types: int cannot be converted to Short
//         Short y = 67600;
//                   ^
// M.java:7: error: incompatible types: int cannot be converted to Character
//         Character z = 72000;
//                       ^
// 3 errors