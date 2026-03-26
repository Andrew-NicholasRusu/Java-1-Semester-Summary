package February.February_15_2026.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.multiply(10, 20)); // 200
        // Self-Check: Does it correctly multiply two integers?
        System.out.println(c.multiply(10.9, 20.5)); // 223.45
        System.out.println(c.multiply(10.5, 20)); // 210.0
        System.out.println(c.multiply(10.5, 20.5, 30.5)); // 6551.625
        // Self-Check: Do all the overloaded methods work correctly for their respective input types?
    }
}
