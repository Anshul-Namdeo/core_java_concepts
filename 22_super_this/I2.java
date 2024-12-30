class Y1 {
    private int x = 88;

    void info(){
        System.out.println(x);
    }

    private void aaa(){
        System.out.println("hi");
    }
}

class I2 extends Y1 {
    int x = 44;

    void pro(){
        int x = 11;

        System.out.println(x);
        System.out.println(this.x);
       // System.out.println(super.x);
       info();
       aaa();
    }

    public static void main(String args[]){

            I2 g = new I2();
            g.pro();
    }
}
// D:\javaprac\22_super_this>javac I2.java
// I2.java:23: error: cannot find symbol
//        aaa();
//        ^
//   symbol:   method aaa()
//   location: class I2
// 1 error





