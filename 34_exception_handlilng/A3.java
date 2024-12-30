class A3 {
    
    public static void main(String[] args) throws MyYException {
        
        System.out.println("khushisen");
        throw new MyYException();

    }
}

//(custom Exception class)
class MyYException extends Exception{

}