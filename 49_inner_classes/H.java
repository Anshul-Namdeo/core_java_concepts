class H 
{
    int y = 90;

    void pro()
    {
        class U 
        {
            void info() 
            {
                System.out.println(y);
            }
        }

        U u = new U();
    }
}