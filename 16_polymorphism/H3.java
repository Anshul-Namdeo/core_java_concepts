class H3{
    public static void main(String[] args){

            Object x = new Sportscar();

            if(x instanceof Car){
                System.out.println("Sportscar IS-A Car");
            }else{
                System.out.println("Sportscar IS-not-A Car");
            }
    }
}