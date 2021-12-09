public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws SideIsTooLargeException, NonPositiveSideException {
        if ((a <= 0) || (b <= 0) || (c <= 0))  {
            throw new NonPositiveSideException();
        }

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        if ((a2 > b2+c2) || (b2  > a2 + c2) || (c2 > a2 + b2))  {
            throw new SideIsTooLargeException();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        double p = semiPerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double semiPerimeter() {
        return (a + b + c) / 2.;
    }

    public static class SideIsTooLargeException extends Throwable {
        public SideIsTooLargeException() {
            super("Одна из сторон слишком большая");
        }
    }

    public static class NonPositiveSideException extends Throwable {
        public NonPositiveSideException() {
            super("Как минимум одна из сторон не больше 0");
        }
    }
}
