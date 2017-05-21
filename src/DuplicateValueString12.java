import java.util.*;

/**
 * Created by DIPAK on 3/6/2017.
 */
public class DuplicateValueString12 {
    public static void main(String[] args) {
        String text = "a r b b h j j k f  a d f";

        List<String> list = Arrays.asList(text.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }

    }

}