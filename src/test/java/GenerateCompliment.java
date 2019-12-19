
import org.junit.Before;
import org.junit.Test;

public class GenerateCompliment {

    private GenerateAdjective adjective;
    private GenerateAdverb adverb;

    @Before
    public void setup() {
        adjective = new GenerateAdjective();
        adverb = new GenerateAdverb();
    }

    @Test
    public void generateAll() {
        String adj = adjective.randomAdjective();
        String adv = adverb.randomAdverb();
        System.out.print("You are so " + adv + " " + adj + "!");
    }
}
