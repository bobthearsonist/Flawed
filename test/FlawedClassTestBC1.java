import edu.kennesaw.seclass.FlawedClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mperry on 2/18/18.
 *
 * This test suite shows that you can create a Branch Coverage Test suite that either finds or does not find the fault depending on the vlaues tested.
 */
public class FlawedClassTestBC1 {

    @Test
    public void FullBranchCoverageDoesNotFindFault() {
        FlawedClass flawed = new FlawedClass();
        flawed.flawedMethod1(10);
        flawed.flawedMethod1(-1);

    }

    @Test
    public void FullBranchCoverageDoesFindFault() {
        FlawedClass flawed = new FlawedClass();
        flawed.flawedMethod1(-1);
        flawed.flawedMethod1(0);
    }
}