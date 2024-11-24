class Z {
    int y =32;

    void pro(){
        System.out.println("hello ji");
    }
}
class C extends Z{
    void pro(){
        System.out.println("hy ji");
    }

    public static void main(String[] args){
        C x = new C();

        System.out.println(x.y);
        x.pro();
     }
}