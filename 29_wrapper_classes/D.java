class D 
{
    public static void main(String[] args) {
        
        char x = 2;

        short y = x;
    }
}


// D:\javaprac\29_wrapper_classes>javac D.java
// D.java:7: error: incompatible types: possible lossy conversion from char to short
//         short y = x;
//                   ^
// 1 error