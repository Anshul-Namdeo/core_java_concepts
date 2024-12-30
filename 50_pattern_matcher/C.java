import java.util.regex.Pattern;

class C 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");

        System.out.println(p);
        System.out.println(p.toString());
    }
}


// D:\javaprac\50_pattern_matcher>javac C.java

// D:\javaprac\50_pattern_matcher>java C
// mohan
// mohan


// Note : pattern class ke ander toString() method ko meaningfully override kiya gaya hai..

// Note : jab hum pattern ke ref.variable (P) ko print karenge to waha par (koi bhi ref.code  print nhi hoga) balki hum ne jo bhi compile() method ki (parameter body mai pass kiya hai wahi print hoga) .. bez patter () method ke ander toString method() meaningfully override kiya gyaa hai..

// Note : jo compile method hoti hai wo object bana ke deti hai.. 
// Note : Pattern class ke sare constructor (private hai ) isliye hum constructor nhi bana sakte hai. isliye hum ("compile method ke throw Object banate hai");