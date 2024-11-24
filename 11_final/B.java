class Y {
    int y = 12;

    void pro(){
        System.out.println("hello ji");
        }
}

class B extends Y{
    public static void main(String[] args){
            B x = new B();

            System.out.println(x.y);
            x.pro();
    }
}