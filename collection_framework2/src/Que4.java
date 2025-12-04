import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Que4 {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> count = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        String line;

        while ((line = br.readLine()) != null) {

            line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");

            String[] words = line.split(" ");

            for (String w : words) {
                if (w.isEmpty()) continue;
                count.put(w, count.getOrDefault(w, 0) + 1);
            }
        }

        br.close();

        ArrayList<String> unique = new ArrayList<>();
        ArrayList<String> duplicates = new ArrayList<>();

        for (String word : count.keySet()) {
            if (count.get(word) == 1) {
                unique.add(word);
            } else {
                duplicates.add(word);
            }
        }

        System.out.println("Unique words: " + unique);
        System.out.println("Duplicate words: " + duplicates);


    }
}
