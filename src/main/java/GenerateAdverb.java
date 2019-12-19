import java.util.ArrayList;

import edu.princeton.cs.algs4.In;

public class GenerateAdverb {

    ArrayList<String> positiveAdverbs = new ArrayList<String>();
    
    final static int DATA_SIZE = 399;

    public GenerateAdverb() {
        In input = new In("word-data-files/PositiveAdverbs");

        for (int i = 0; i < DATA_SIZE; i++) {
            positiveAdverbs.add(input.readString().toLowerCase());
        }
    }

    public String randomAdverb() {
        int randomIndex = (int)(Math.random() * DATA_SIZE) + 1;
        return positiveAdverbs.get(randomIndex - 1);
    }
}
