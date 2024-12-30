class C {

    public static void main(String[] args) {
    
        if(args.length == 0){

           try{
            throw new NocommandLineArgumentException();
           }catch(NocommandLineArgumentException e){

                e.printStackTrace();
           }
        }
        
    }
}

class NocommandLineArgumentException extends Exception {


    NocommandLineArgumentException(){

    }

    NocommandLineArgumentException(String message){

        super("");
    }
}


// D:\javaprac\34_exception_handlilng>javac C.java

// D:\javaprac\34_exception_handlilng>java C
// NocommandLineArgumentException
//         at C.main(C.java:8)