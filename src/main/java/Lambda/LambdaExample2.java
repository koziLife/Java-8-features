package Lambda;

public class LambdaExample2 {

    public static void main(String[] args) {
        Foo foo1 = (a, b) -> a + b;
        int res1 = foo1.apply(3, 4);
        System.out.println(res1);

        Foo foo2 = (a, b) -> (int) Math.pow(a,b);
        int res2 = foo2.apply(2,8);
        System.out.println(res2);

        int res3 = calculate(((a, b) -> a * b), 5, 90);
        System.out.println(res3);

    }

    public static int calculate(Foo foo, int a, int b){
        return foo.apply(a, b);
    }

}

//If the interface has a just one method, we can use @FunctionalInterface (optional)
@FunctionalInterface
interface Foo{

    int apply(int a, int b);
}
