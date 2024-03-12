package review.example.v15;

public class StringMethodExpand {
    public static void main(String[] args) {
        String str = " hello world ";

        // java 11 used to remove leading and trailing white spaces from a string
        // Unicode-aware, which handles white space characters defined in the Unicode standard.
        // trim() only removes space characters that are less or equal to U+0020 in the Unicode space.
        System.out.println("Strip: [" + str.strip() + "]");

        // part of the text blocks feature
        String strMul = """
                Returns a string whose value is this string,
                with incidental white space removed from the beginning and end of every line.
                Incidental white space is often present in a text block to align the content with the opening delimiter.
                For example, in the following code
                   """;
        System.out.println("With stripIndent:" +  strMul.stripIndent());

        String str1 = "\"bezier\"";
        System.out.println(str1.translateEscapes());

        // String::formatted Method
        String str2 = "This is %s %d";
        System.out.println(str2.formatted("Java", 14));
    }
}
