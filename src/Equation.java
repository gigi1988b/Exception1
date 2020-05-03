public class Equation {
    private double root(double A, double B, double C)
            throws IllegalArgumentException {

        if (A == 0) {
            throw new IllegalArgumentException("A не может быть равно 0.");
        }
        else {
            double disc = B*B - 4*A*C;
            if (disc < 0)
                throw new IllegalArgumentException("Дискриминант < 0.");
            return  (-B + Math.sqrt(disc)) / (2*A);
        }
    }
}
