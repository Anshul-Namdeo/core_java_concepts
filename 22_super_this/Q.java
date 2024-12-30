class Q {
    void pro(){
        Q q = this;
        System.out.println(q);
    }


public static void main(String args[]){
        Q x = new Q();

        x.pro();

        System.out.println(x);
}

}