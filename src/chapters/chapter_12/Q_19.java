package chapters.chapter_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Q_19 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt.");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.println("Number of words in the Gettysburg Address is " + countWords(bufferedReader));
        } catch (MalformedURLException ex1) {
            ex1.printStackTrace();
        } catch (IOException ex2) {
            ex2.printStackTrace();
        }
    }

    public static int countWords(BufferedReader bufferedReader) throws IOException {
        int wordCount = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split("\\s");
            if (words.length == 0) {
                continue;
            }
            for (String word : words) {
                word = word.trim();
                if (word.length() > 0 && !word.equals(" ")) {
                    wordCount++;
                }
            }
        }
        return wordCount;
    }
}
