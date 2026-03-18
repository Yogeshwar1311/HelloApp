public class HelloApp6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello");
        } else {
            String result = "";

            // Build string with delimiter
            for (String arg : args) {
                result += arg + ", ";
            }

            // Remove trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello " + result);
        }
    }
}