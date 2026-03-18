public class HelloApp7 {
    public static void main(String[] args) {

        if (args.length == 0) {
            // Default message if no arguments
            System.out.println("Hello");
        } else {
            // Join all arguments with comma and space
            String result = String.join(", ", args);

            System.out.println("Hello " + result);
        }
    }
}