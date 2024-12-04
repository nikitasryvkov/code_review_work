public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Divide by zero error");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b, int c){ //53x - 6 = 0
        int d = times(a,b);
        int e = div(c,a);
        int f = add(d,e);
        return dif(f,a);
    }
}
