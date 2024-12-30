class O1
{
    public static void main(String[] args) {
        
        Byte a = 128;
        Byte b = 128;

        System.out.println(a == b);
    }
}

// D:\javaprac\30_wrapper_classes>javac O1.java
// O1.java:5: error: incompatible types: int cannot be converted to Byte
//         Byte a = 128;
//                  ^
// O1.java:6: error: incompatible types: int cannot be converted to Byte
//         Byte b = 128;
//                  ^
// 2 errors