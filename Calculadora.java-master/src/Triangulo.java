public class Triangulo {

    public static String tipoTriangulo(int a, int b, int c) {
        // Validar que los lados sean positivos
        if (a <= 0 || b <= 0 || c <= 0) {
            return "No es un triángulo válido";
        }

        // Validar desigualdad triangular
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "No es un triángulo válido";
        }

        // Equilátero
        if (a == b && b == c) {
            return "Equilátero";
        }

        // Rectángulo
        if ((a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a)) {
            return "Rectángulo";
        }

        // Escaleno
        if (a != b && a != c && b != c) {
            return "Escaleno";
        }

        return "Isósceles";
    }

    public static void main(String[] args) {
        System.out.println(tipoTriangulo(3, 3, 3)); // Equilátero
        System.out.println(tipoTriangulo(3, 4, 5)); // Rectángulo
        System.out.println(tipoTriangulo(4, 5, 6)); // Escaleno
        System.out.println(tipoTriangulo(2, 2, 3)); // Isósceles
    }
}
