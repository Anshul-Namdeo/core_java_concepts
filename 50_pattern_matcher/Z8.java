import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z8 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m = p.matcher("6268197074");

        if(m.matches())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("No match");
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac Z8.java

// D:\javaprac\50_pattern_matcher>java Z8
// match: 6268197074 start: 0 end: 10