class H2{
    public static void main(String[] args){

            Object x = new Sportscar();

            if(x instanceof Fourwheeler){
                System.out.println("Sportscar IS-A Fourwheeler");
            }else{
                System.out.println("Sportscar IS-not-A Fourwheeler");
            }
    }
}