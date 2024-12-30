class J1{
    J1(){
        System.out.println(this + "~~~~`");
    }
}

class J2 extends J1 {
    J2(){
    System.out.println(this + " @@@@@@@@@@@");
    }
}

class O extends J2 {
    O(){
        System.out.println(this + "%%%%%%%%%%%%%");
    }

    public static void main(String args[]){

        O x = new O();

        System.out.println(x + "______________________________");
    }
}

// O@23fc625e~~~~`
// O@23fc625e @@@@@@@@@@@
// O@23fc625e%%%%%%%%%%%%%
// O@23fc625e______________________________
