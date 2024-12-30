class B3
{
    public static void main(String[] args) {
        
        if(args.length == 0){

            try{

                throw new MissingcommandlineargumentException();
            }catch(MissingcommandlineargumentException e){

                e.printStackTrace();
            }
        }else{
            System.out.println(args[0]);
        }
    }
}

class MissingcommandlineargumentException extends Exception {


}



// D:\javaprac\34_exception_handlilng>javac B3.java

// D:\javaprac\34_exception_handlilng>java B3 anshul namdeo
// anshul