abstract class K2 {
    private abstract void pro();    
}


// K2.java:2: error: illegal combination of modifiers: abstract and private
//     private abstract void pro();
//                           ^
// 1 error


// abstract method ko private mark nahi kar sakte, kyunki private methods ko subclass se access nahi kiya ja sakta.
// Tumhe protected ya public use karna chahiye taaki subclass us method ko override kar sake.