class H 
{
    public static void main(String[] args) {
        
        System.out.println(1);

       try
       {
        System.out.println(Integer.parseInt("a"));
       }catch(NumberFormatException e)
       {
        System.out.println("problm solved");
       }

        System.out.println(3);
    }
}