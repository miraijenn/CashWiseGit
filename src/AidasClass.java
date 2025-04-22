public class AidasClass {

    public static void replaceString(String[] args){
        String str = "Hello World! Hello Java!";

        // Replace all 'l' with 'p'
        String replacedChar = str.replace('l', 'p');
        System.out.println(replacedChar); // Output: Heppo Worpd! Heppo Java!

        // Replace "Hello" with "Greetings"
        String replacedSequence = str.replace("Hello", "Greetings");
        System.out.println(replacedSequence); // Output: Greetings World! Greetings Java!

        // Replace the first occurrence of "Hello" with "Hi"
        String replacedFirst = str.replaceFirst("Hello", "Hi");
        System.out.println(replacedFirst); // Output: Hi World! Hello Java!

        // Replace all occurrences of "Hello" (case-sensitive) with "Bonjour"
        String replacedAll = str.replaceAll("Hello", "Bonjour");
        System.out.println(replacedAll); // Output: Bonjour World! Bonjour Java!

        // Replace all occurrences of "hello" or "Hello" (case-insensitive) with "Ciao"
        String replacedAllCaseInsensitive = str.replaceAll("(?i)hello", "Ciao");
        System.out.println(replacedAllCaseInsensitive); // Output: Ciao World! Ciao Java!
    }
}
