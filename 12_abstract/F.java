 abstract class X3{

        abstract void abc();
 }
 class F extends X3{

        public static void main(String[] args){

        }
 }

//  F.java:5: error: F is not abstract and does not override abstract method abc() in X3
//  class F extends X3{
//  ^
// 1 error


// Abstract Method ka Implementation Missing: X3 class mein ek abstract method abc() define kiya gaya hai. Jab tum F class ko X3 se extend karte ho, toh tumhe abc() method ko F class mein implement karna zaroori hai. Agar tum yeh implement nahi karte, toh compiler error milega.

// Empty main Method: main method mein koi kaam nahi ho raha hai. Tumne main method diya hai, lekin isme code nahi likha gaya, jo ki ek logical error ho sakta hai. Agar tum abc() method call karna chahte ho, toh tumhe yahan code likhna hoga.