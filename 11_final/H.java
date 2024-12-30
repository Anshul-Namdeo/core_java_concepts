final class O{
    int y = 30;

    void pro(){
        System.out.println("hiii!!");
    }
}
class H{
    public static void main(String[] args){
        O x = new O();

        System.out.println(x.y);
        x.pro();
    }
}

// Key Points:
// final class Restrictions:

// Is class ko inherit nahi kiya ja sakta.
// Iska purpose hai ki iska behavior aur structure modify na ho.
// Allowed Operations on final class:

// Aap uska object bana sakte ho.
// Aap uske variables aur methods ko access kar sakte ho (agar access modifiers allow karein).
