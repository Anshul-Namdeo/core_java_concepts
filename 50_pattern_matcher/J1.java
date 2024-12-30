import java.util.regex.Pattern;
import java.util.regex.Matcher;

class J1 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("mohan scored 9 out of 10");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac J1.java

// D:\javaprac\50_pattern_matcher>java J1
// match: 9 start: 13 end: 14
// match: 1 start: 22 end: 23
// match: 0 start: 23 end: 24


// NOTE : Regex(/d) -> A digit[0-9] 
//         -> A single character match...