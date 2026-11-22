import javax.swing.*;

public class Calculadora {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 2"));
        // Se muestra el resultado por consola
        System.out.println("El resultado de la suma es: "+calculadora.sumar(num1,num2));
        // Se muestra el resulta por pantalla
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + calculadora.sumar(num1, num2));
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + calculadora.sumar(num1, num2));
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + calculadora.sumar(num1, num2));
        JOptionPane.showMessageDialog(null, "El resultado de la division es: " + calculadora.sumar(num1, num2));

    }
}