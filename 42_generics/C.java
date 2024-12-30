class C <om> 
{
    om pro (om z){
        return z;
    }
}
class X 
{
    public static void main(String ... args)
    {
        C <String> y = new C <String> ();

        String str = y.pro("modi");

        System.out.println(str);
    }
}


// D:\javaprac\42_generics>javac C.java

// D:\javaprac\42_generics>java X
// modi
