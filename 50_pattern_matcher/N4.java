import java.util.regex.Pattern;
import java.util.regex.Matcher;

class N4
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\h");
        Matcher m = p.matcher("\tss\u0193pppppp");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}
