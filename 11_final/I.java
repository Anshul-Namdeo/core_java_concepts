final class Q {
    int j = 65;

}

class I{
    public static void main(String[] args){
        Q x = new Q();

        System.out.println(x.j);

        x.j = 99;
        System.out.println(x.j);
    }
}