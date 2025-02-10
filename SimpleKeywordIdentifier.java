import java.util.*;

public class SimpleKeywordIdentifier {
    public static void main(String[] args) {
        // Java ke reserved keywords ka set
        Set<String> javaKeywords = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if",
            "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while"
        ));

        // User se input lein
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if it's a Java keyword:");
        String inputWord = scanner.next();

        // Check karein ke yeh keyword hai ya nahi
        if (javaKeywords.contains(inputWord)) {
            System.out.println("'" + inputWord + "' is a Java keyword!");
        } else {
            System.out.println("'" + inputWord + "' is NOT a Java keyword.");
        }

        scanner.close();
    }
}
