class A1 {
    
    public static void main(String[] args) {
        
        throw new MyyException();

    }
}

//(custom Exception class)
class MyyException extends Exception{

}


// D:\javaprac\34_exception_handlilng>javac A1.java
// A1.java:5: error: unreported exception MyException; must be caught or declared to be thrown
//         throw new MyException();
//         ^
// 1 error