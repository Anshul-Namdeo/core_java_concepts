final class O{
    int y = 30;

    void pro(){
        System.out.println("hiii!!");
    }
}
class H{
    public static void main(String[] args){
        O x = new O();

        System.out.println(x.y);
        x.pro();
    }
}