class RRR {

    private RRR (){


    } 

     static RRR  createObject(){

            RRR r = new RRR();

                return r;

    }
}

class V {

        public static void main(String args[])
{
        RRR x = RRR.createObject();
         RRR y = RRR.createObject();
          RRR z = RRR.createObject();
           RRR c = RRR.createObject();
            RRR l = RRR.createObject();
             RRR q = RRR.createObject();

             System.out.println(x);
              System.out.println(y);
               System.out.println(z);
                System.out.println(c);
                 System.out.println(l);
                  System.out.println(q);
}

}