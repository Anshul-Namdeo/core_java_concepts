import java.util.ArrayList;

class N1 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add(2.34);
        x.add(74);
        x.add(true);
        x.add('u');

        System.out.println(x);

        String str = (String) (x.get(0));
        System.out.println(str.length());
    }
}