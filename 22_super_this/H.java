class Y1 {
    int x = 88 ;
}

class H extends Y1 {
    int x = 44;

    void pro(){
        int x = 11;

        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String args[]){
        H g = new H();
        g.pro();
    }
}

// D:\javaprac\22_super_this>javac H.java

// D:\javaprac\22_super_this>java H
// 11
// 44
// 88