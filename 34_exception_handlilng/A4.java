class A4 {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("khushisen");
        throw new Anshul();

    }
}

//(custom Exception class)
class Anshul extends Exception{

}

// D:\javaprac\34_exception_handlilng>javac A4.java

// D:\javaprac\34_exception_handlilng>java A4
// khushisen
// Exception in thread "main" Anshul
//         at A4.main(A4.java:6)