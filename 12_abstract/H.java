abstract class X5{

        abstract void pro();
}

class H extends X5 {

        void pro(){
            
        }
}


// pro() method ka implementation: Tumne pro() method ko H class mein implement kiya hai, lekin pro() method ka body empty hai, jo ki technically sahi hai, par agar tum method ko implement kar rahe ho, toh achha hoga agar method mein koi logic daalo.

// Access Modifiers: Agar tum pro() method ko H class mein implement karte ho, toh tumhare method ko public ya protected banaana better hoga, especially agar tum method ko extend karne wali aur classes mein use karna chahte ho.

// Method Signature Match: Tumhare pro() method ka signature X5 class se bilkul match kar raha hai, jo ki zaroori hai, because jab tum abstract class ko extend karte ho, toh method signature ko exactly match karna padta hai.