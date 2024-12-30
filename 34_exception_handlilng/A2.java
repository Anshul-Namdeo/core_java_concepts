class A2 {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("khushi");
        throw new MMyException();

    }
}

//(custom Exception class)
class MMyException extends Exception{

}


// D:\javaprac\34_exception_handlilng>javac A2.java

// D:\javaprac\34_exception_handlilng>java A2
// khushi
// Exception in thread "main" MyException
//         at A2.main(A2.java:6)
