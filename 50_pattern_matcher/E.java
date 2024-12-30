import java.util.regex.Pattern;

class E 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        System.out.println(p);
        System.out.println(m);
    }
}

// D:\javaprac\50_pattern_matcher>javac E.java
// E.java:9: error: cannot find symbol
//         Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");
//         ^
//   symbol:   class Matcher
//   location: class E
// 1 error


// Note : hum matcher class ko import krna bhool gaye isliye error aa gaya