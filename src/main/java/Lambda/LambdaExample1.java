package Lambda;

public class LambdaExample1 {

    public static void main(String[] args) {

        //before java 8
        int result = calculate1(4, 5, new Arithmetic() {
            public int call(final int a, final int b) {
                return a + b;
            }
        });

        //java - 8 - lambda
        calculate2(4, 5, (a, b) -> a + b);

        System.out.println(result);
    }

    public static int calculate1(int a, int b, Arithmetic arithmetic){
        return arithmetic.call(a, b);
    }

    public static int calculate2(int a, int b, Arithmetic arithmetic){
        return arithmetic.call(a, b) * 2;
    }
}

interface Arithmetic {

    int call(int a, int b);
}
