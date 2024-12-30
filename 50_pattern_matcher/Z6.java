import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z6
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\d\\d");
        Matcher m = p.matcher("21 mohan my best friend");

        if(m.lookingAt())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("NO match");
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac Z6.java

// D:\javaprac\50_pattern_matcher>java Z6
// match: 21 start: 0 end: 2
