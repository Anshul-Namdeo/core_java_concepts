enum AAA 
{

}

class X extends AAA 
{
    public static void main(String args[])
    {

    }
}


// D:\javaprac\51_enum>javac X.java
// X.java:6: error: cannot inherit from final AAA
// class X extends AAA
//                 ^
// X.java:6: error: enum types are not extensible
// class X extends AAA
// ^
// 2 errors


// NOTE : enum ek final class hai islliye usa ko inherited nhi kar skate hai..