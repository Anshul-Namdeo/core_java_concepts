import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z2
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[A-Za-z0-9\\._%+\\-]+@[A-Za-z0-9\\.\\-]+\\.[A-Za-z]{2,}");
        Matcher m = p.matcher("mohan-das23#gmail.com");

        if(m.matches())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("NO match");
        }
    }
}

// Note : matches() method ek war mai poore pattern ko cheak karta hai..


// D:\javaprac\50_pattern_matcher>javac Z2.java

// D:\javaprac\50_pattern_matcher>java Z2
// NO match
