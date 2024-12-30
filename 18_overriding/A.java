class X1 {

        void pro(){
            System.out.println("step-1");
            System.out.println("step-2");
        }
}

class A extends X1 {
// legal  method overriding
    void pro(){

        System.out.println("setp-1");
        System.out.println("step-2");
        System.out.println("step-3");
    }

    void Info(){

    }
}

//when you redefine / reimpliment a parent class method in the child class.
// then such method redefinition is called method overriding :
//  parameter body must same (count,sequenceand type)
//you can modify an existing method inherited from parent,if required
//even you can aad new methods.....to create a modified version of an existing class.