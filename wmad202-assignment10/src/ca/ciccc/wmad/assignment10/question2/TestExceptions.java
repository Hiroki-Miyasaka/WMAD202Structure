package ca.ciccc.wmad.assignment10.question2;

public class TestExceptions {
    class ExceptionA1 extends Exception {
        ExceptionA1(String message) {
            super(message);
        }
    }
a
    class ExceptionA2 extends ExceptionA1 {
        ExceptionA2(String message){
            super(message);
        }
    }
    class ExceptionA3 extends ExceptionA2 {
        ExceptionA3(String message){
            super(message);
        }
    }

    class A {
        public void methodA1() throws ExceptionA1 {
            System.out.println("MethodA1 running");
            double probability = Math.random();
            System.out.println(probability);
            if(probability<0.5) {
                throw new ExceptionA1("Exception A1 raised!");
            }
        }

        public void methodA2() throws ExceptionA2 {
            System.out.println("MethodA2 running");
            double probability = Math.random();
            System.out.println(probability);
            if(probability<0.5) {
                throw new ExceptionA2("Exception A2 raised!");
            }
        }
        public void methodA3() throws ExceptionA3 {
            System.out.println("MethodA3 running");
            double probability = Math.random();
            System.out.println(probability);
            if(probability<0.5) {
                throw new ExceptionA3("Exception A3 raised!");
            }
        }
    }

        public void testExceptions1(){
        //This method is supposed to handle any exceptions that could potentially raised.
        //Please add proper code to fix the error
        //
            TestExceptions.A a = new A();
            a.methodA1();
        }

        public void testExceptions2(){
        //This method is supposed to handle any exceptions that could potentially raised.
        //Please add proper code to fix the errors
        //Also, Add code to inform the user about the total number of exceptions that have raised.
            TestExceptions.A a = new A();
            a.methodA1();
            a.methodA2();
            a.methodA3();
        }
        public static void main(String[] args){
            TestExceptions test = new TestExceptions();
            test.testExceptions1();
            test.testExceptions2();
        }
}
