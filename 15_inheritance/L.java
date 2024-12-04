// cyclic inheritannce 

class W extends L{

}

class L extends W {
    
}

// L.java:3: error: cyclic inheritance involving W
// class W extends L{
// ^
// 1 error
