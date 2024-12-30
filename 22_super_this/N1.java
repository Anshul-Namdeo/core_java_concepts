class N1 {
    void pro(){
        System.out.println(this);
        System.out.println(super.hashCode());
    }

    public static void main(String args[]){

            N1 x = new N1();

            x.pro();
    }
}

// N1@4617c264
// 1175962212
