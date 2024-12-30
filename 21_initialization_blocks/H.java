class H {
    {
        System.out.println("E");
    }
    static {
        System.out.println("l");
    }

    H(){
        System.out.println("a");
    }

    public static void main(String args[]){

            System.out.println("r");
            H x = new H();
            System.out.println("b");
    }
    {
        System.out.println("8");
    }
}