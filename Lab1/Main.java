package Lab1;



public class Main {
    public static void main(String[] args) {
        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length(); //TODO: Complete the code statement to find out the length of bookTitle
        System.out.println("Length of the book title: " + titleLength);

        //Declare and initialize the length of the shortened book title
        int maxLength = 20;


        // Shortened the book title
        String shortBookTitle = bookTitle.substring(0, maxLength); // TODO: Write the code to shorten the bookTitle to 20 characters
        System.out.println("Original title: " + bookTitle);
        System.out.println("Shortened title: " + shortBookTitle);

        String sentence = "Java programming is fun and educational";
        String searchWord = "fun";
        boolean containsWord = sentence.contains(searchWord);
        System.out.println(containsWord);
        String newsentence = sentence.replace("educational", "awesome");
        System.out.println(newsentence);
        System.out.println(sentence.length());
        System.out.println(sentence.substring(0,17));


        
    }
 }
