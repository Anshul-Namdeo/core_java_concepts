class B2
{
    public static void main(String[] args) {
        
        if(args.length == 0){

            try{

                throw new MissingcommandlineArgumentException();
            }catch(MissingcommandlineArgumentException e){

                e.printStackTrace();
            }
        }else{
            System.out.println(args[0]);
        }
    }
}

class MissingcommandlineArgumentException extends Exception {


}


// D:\javaprac\34_exception_handlilng>javac B2.java

// D:\javaprac\34_exception_handlilng>java B2
// MissingcommandlineArgumentException
//         at B2.main(B2.java:9)