public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int divide(int a, int b) {
        return a / b;  // bug: no division by zero check
    }
    
    public String formatResult(int result) {
        String output = "Result: " + result;
        System.out.println(output);  // bad practice: console print in library
        return output;
    }
}
