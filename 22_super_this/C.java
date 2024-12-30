class C {
    int y = 99;
    static float g = 8.8f;

    void info(){
        System.out.println("hi");
    }

    void pro(){
        // System.out.println(x);
        System.out.println(y);
        System.out.println(g);
    }

    public static void main(String args[]){
        C x = new C();

        x.pro();
    }
}