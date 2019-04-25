package flyweight;

public class Client {

    public static void main(String[] args) {
        WordProcessor processor = new WordProcessor();

        String textToAdd = "Helllllllllllllo i'm aaaaaaaaaaaaaaaaaaaaaaaaa wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwword processsssssssssssssssssssssor";
        int length = textToAdd.length();

        LetterFactory factory = new LetterFactory();

        long start = System.currentTimeMillis();

        for (int i = 0; i < length; i++) {
            String value = textToAdd.substring(i,i+1);

         processor.addLetter(new Letter(value));
          processor.addLetter(factory.createLetter(value));
        }

        long end = System.currentTimeMillis();

        System.out.println("Samlet tid: "+(end-start));

        processor.printLetters();
    }
}
