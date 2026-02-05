package strings;

public class built_in_func {
    public static void main(String[] args) {
        String str = " Hello, World! ";
        String name = "Nirmit";
        String surname = "Bhanushali";

        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // Convert to uppercase
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Convert to lowercase
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // Trim whitespace
        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // Replace characters
        String replaced = str.replace("World", "Java");
        System.out.println("Replaced: " + replaced);

        // Substring
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring);

        // Check if string contains a substring
        boolean contains = str.contains("Hello");
        System.out.println("Contains 'Hello': " + contains);

        // Index of a character
        char charAt = surname.charAt(2);
        System.out.println("CharAt:" + charAt);

        // Check starts with
        boolean StartsWith = name.startsWith("N");
        System.out.println("StartsWith:" + StartsWith);

        // Check ends with
        boolean endsWith = surname.endsWith("i");
        System.out.println("EndsWith:" + endsWith);

        // Concatenate strings
        String concatenated = name.concat(surname);
        System.out.println("Concatenation:" + concatenated);

        // Substring from index 2 to 5
        String subString = surname.substring(2, 5);
        System.out.println("SubString:" + subString);
    }
}
