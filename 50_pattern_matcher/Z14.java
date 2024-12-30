import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z14 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);

        if(m.matches())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("no match");
        }
    }
}
/*OUTPUT:
D:\javaprac\50_pattern_matcher>javac Z14.java

D:\javaprac\50_pattern_matcher>java Z14 [6-9][0-9]{9} 6268197074
match: 6268197074 start: 0 end: 10

D:\javaprac\50_pattern_matcher>java Z14 [6-9][0-9]{9} 5268197074
no match */