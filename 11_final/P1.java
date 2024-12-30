class P1{
    public static void main(String[] args){
        final int y;
        final int z = 5;
    }
}

// Key Points:
// final Variables:

// Ek baar initialize hone ke baad unki value ko change nahi kiya ja sakta.
// Agar initialize nahi kiya gaya, to us variable ka use karna compile-time error dega.
// Initialization Options:

// Direct Initialization: Declaration ke waqt value assign karein.
// Block/Conditional Initialization: Runtime conditions ke hisaab se initialize karein.
// Compilation Error:

// Agar final variable ko use karne se pehle initialize nahi kiya, to error milega:
// variable y might not have been initialized.