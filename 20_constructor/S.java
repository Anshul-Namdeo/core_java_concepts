class S {

        S(){

                super(30);
        }
}

// S.java:5: error: constructor Object in class Object cannot be applied to given types;
//                 super(30);
//                 ^
//   required: no arguments
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error


// conclusion: error isliye aaya hai bez.. jaise super call hoga to object class ko call kiya jayega lekin object class mai koi bhi instance level variable nhi hote hai usa mai sirf or sirf instance level method hoti hai or wo total 11 methods hai jo ki object class mai present hai .