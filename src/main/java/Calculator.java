public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int a, int b, int c, int d) {
        int numberAdd = add(a, b);
        int numberDif = dif(numberAdd, c);
        int numberDiv = div(numberAdd, numberDif);
        return times(numberAdd, numberDiv);
    }
}
