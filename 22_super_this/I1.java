class Y1 {
    private int x = 88;

    void info(){
        System.out.println(x);
    }

    private void aaa(){
        System.out.println("hi");
    }
}

class I1 extends Y1 {
    int x = 44;

    void pro(){
        int x = 11;

        System.out.println(x);
        System.out.println(this.x);
       // System.out.println(super.x);
       info();
    }

    public static void main(String args[]){

            I1 g = new I1();
            g.pro();
    }
}

// 11
// 44
// 88


