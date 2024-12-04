public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by zero error");
        }

        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int a, int b, int c) {
        int numberAdd = add(a, b);
        int numberDif = dif(numberAdd, c);
        int numberDiv = div(numberDif, 1);
        return times(numberAdd, numberDiv);
    }
}
