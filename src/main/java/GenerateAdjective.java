import java.util.ArrayList;

import edu.princeton.cs.algs4.In;

public class GenerateAdjective {

    ArrayList<String> positiveAdjectives = new ArrayList<String>();
    
    final static int DATA_SIZE = 379;

    public GenerateAdjective() {
        In input = new In("word-data-files/PositiveAdjectives");

        for (int i = 0; i < DATA_SIZE; i++) {
            positiveAdjectives.add(input.readString().toLowerCase());
        }
    }

    public String randomAdjective() {
        int randomIndex = (int)(Math.random() * DATA_SIZE) + 1;
        return positiveAdjectives.get(randomIndex - 1);
    }
}
