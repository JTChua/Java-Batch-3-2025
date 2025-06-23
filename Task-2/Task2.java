public class Task2 {
    public static void main(String[] args) {

        // Create primitives with specific values
        byte b = 0;
        short s = 3110;
        int i = 0;
        float f = 2.0f;
        char c = ' ';
        boolean bool = true;
        
        // Concatenate them to form the desired output
        String output = "H" + s + c + "w" + b + "rld" + c + f + c + bool;
        
        // Print the result
        System.out.println(output);  // Output: H3110 w0rld 2.0 true

    }
}