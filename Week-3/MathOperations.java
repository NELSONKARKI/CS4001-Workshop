class MathOperations {
    public static void main(String[] args){
        int a = 45;
        int b = 32;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        boolean x = true;
        boolean y = false;
        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));

        System.out.println("\n=== Assignment Operators ===");
        int c = 20;
        c += 5;
        System.out.println("c += 5 → " + c);

        System.out.println("\n=== Unary Operators ===");
        int num = 7;
        System.out.println("num++ = " + (num++));
        System.out.println("++num = " + (++num));

        System.out.println("\n=== Ternary Operator ===");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}
