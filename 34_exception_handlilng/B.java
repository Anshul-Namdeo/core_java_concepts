class B 
{
    public static void main(String[] args) {
        
        if(args.length == 0){

            try{

                throw new MissingCommandLineArgumentException();
            }catch(MissingCommandLineArgumentException e){

                e.printStackTrace();

                System.out.println(args[0]);
            }
        }
    }
}

class MissingCommandLineArgumentException extends Exception {


}


// D:\javaprac\34_exception_handlilng>javac B.java

// D:\javaprac\34_exception_handlilng>java B
// MissingCommandLineArgumentException
//         at B.main(B.java:9)
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at B.main(B.java:14)
