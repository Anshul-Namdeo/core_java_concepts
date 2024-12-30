import java.io.FileReader;
class E 
{

    E() {

        FileReader r = new FileReader("abc.taxt");
    }
    public static void main(String[] args) {
        
        System.out.println("A");

        E x = new E();

        System.out.println("B");
    }
}

// D:\javaprac\33_exception_handling>javac E.java
// E.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader r = new FileReader("abc.taxt");
//                        ^
// 1 error