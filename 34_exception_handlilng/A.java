class A {
    
    public static void main(String[] args) {
        
        throw new MyException();

    }
}

//(custom Exception class)
class MyException {

}

// D:\javaprac\34_exception_handlilng>javac A.java
// A.java:5: error: incompatible types: MyException cannot be converted to Throwable
//         throw new MyException();
//         ^
// 1 error
