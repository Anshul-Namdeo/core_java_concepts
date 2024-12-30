class M{
    final int q;

    void pro(){
        q = 9;
    }   
}

// Is code mein final variable q ko method pro() ke andar value assign ki ja rahi hai. Lekin, final variables ko sirf ek baar initialize kiya ja sakta hai, aur woh initialization method ke andar nahi ho sakti.

// Method mein final variable ko initialize karna allowed nahi hai, jab tak aap usse constructor ya instance initialization block ke through initialize na karen.