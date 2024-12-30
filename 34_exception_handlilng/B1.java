class B1
{
    public static void main(String[] args) {
        
        if(args.length == 0){

            try{

                throw new MissingCommandlineArgumentException();
            }catch(MissingCommandlineArgumentException e){

                e.printStackTrace();

                System.out.println(args[0]);
            }
        }
    }
}

class MissingCommandlineArgumentException extends Exception {


}


// D:\javaprac\34_exception_handlilng>javac B1.java

// D:\javaprac\34_exception_handlilng>java B1 NA
