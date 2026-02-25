
// This program illustrate how various String methods work.

public class VariousStringMethods
{
    public static void main(String[] args)
    {
        String sentence;
        String str1;
        String str2;
        String str3;
        int index;

        sentence = "Now is the time for the birthday party";

        System.out.println("sentence = \"" + sentence + "\"");
        System.out.println("The length of sentence = "
                         + /*Enter string method here */);

        System.out.println("The character at index 16 in "
                         + "sentence = " + /*Enter string method here */);

        System.out.println("The index of first t in sentence = "
                         + /*Enter string method here */);

        System.out.println("The index of for in sentence = "
                         + /*Enter string method here */);

        System.out.println("sentence.substring(0, 6) = \""
                          + /*Enter string method here */ + "\"");

        System.out.println("sentence.substring(7, 12) = \""
                          + /*Enter string method here */ + "\"");

        System.out.println("sentence.substring(7, 22) = \""
                          + /*Enter string method here */ + "\"");

        System.out.println("sentence.substring(4, 10) = \""
                          + /*Enter string method here */ + "\"");

        //Assign to str1 first 8 characters of sentence

        System.out.println("str1 = \"" + str1 + "\"");

        //Assign to str2 character 2 to 12
        System.out.println("str2 = \"" + str2 + "\"");

        System.out.println("sentence in uppercase = \""
                         + sentence.toUpperCase() + "\"");

        //Assign to index the index of birthday in the sentence

        //Using the index of birthday store the rest of the sentence in str1

        System.out.println("str1 = \"" + str1 + "\"");

        System.out.println("sentence.replace('t', 'T') = \""
                           + sentence.replace('t', 'T') + "\"");
    }
}
