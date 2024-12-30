class M {
    final int w;

    M(){
        w = 8;
    }
}

// Key Points:
// Instance Variable (final):

// Direct Initialization: Aap final instance variable ko class declaration ke waqt initialize kar sakte hain.
// Constructor Initialization: Aap constructor ke through bhi final variable ko initialize kar sakte hain.
// Instance Initialization Block: Aap instance initialization block ka use karke bhi final variable ko initialize kar sakte hain.
// Static Variable (final):

// Static Block: Agar aapka final variable static hai, to usse static initialization block ke through initialize kar sakte hain.