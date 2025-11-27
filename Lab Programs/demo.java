  class A {

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    int add(int num1, int num2) {
        num1 = num2 + 1;
        return num1 + num2;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    ADD add(ADD obj)
    {
        int a1;
        final int a =obj.a ;
        int b = obj.b;
         
        return obj;
    }

}

class B {
    public static void main(String args[]) {
        int a = 1, b = 2, c = 3;
        double d1 = 1.5, d2 = 1.5;



        A obj = new A();

        ADD Newobj = new ADD(a,b);
        ADD res1 = obj.add(Newobj); // call by reference
        int res2 = obj.add(a, b, c); //
        double res3 = obj.add(d1, d2); //

        System.out.println(res1 + " " + res2 + " " + res3);

        Add_new val = new Add_new();
        
    }
}

class ADD {
     int a, b;

    ADD(int a1, int b1) {
        a = a1;
        b = b1;
    }

    ADD()
    {}
}

class Add_new extends ADD {
    
}