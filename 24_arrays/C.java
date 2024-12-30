class C {
    public static void main(String args[]){

            Teachar[] x = {
                            new Teachar("mohan",25),
                            new Teachar("anshul",19),
                            new Teachar("pratgam", 25),
                            new Teachar ("rohn", 56)
                          };

                for( Teachar next: x){
                    // System.out.println(next);
                    System.out.println(next.name);
                    // System.out.println(next.age);

                }
    }
}