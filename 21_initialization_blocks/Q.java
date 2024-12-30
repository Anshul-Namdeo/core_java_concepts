class Q {
    int x = 9;
    {
        System.out.println("hello");
    }

    Q(){
        //super()
        // inst..var and inst. inst.. bloks and inst method
        System.out.print("Bye");
    }

    void pro(){
        System.out.println("Hi");
    }

    public static void main(String args[]){
            Q q = new Q();
    }
}