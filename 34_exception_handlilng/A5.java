class A5 {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("khushisen");
        throw new AnshulException();

    }
}

//(custom Exception class)
class AnshulException extends Exception{

}


// D:\javaprac\34_exception_handlilng>javac A5.java

// D:\javaprac\34_exception_handlilng>java A5
// khushisen
// Exception in thread "main" AnshulException
//         at A5.main(A5.java:6)
