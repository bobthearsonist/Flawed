import edu.kennesaw.seclass.FlawedClass;
import org.junit.Test;

/**
 * Created by mperry on 2/18/18.
 *
 * This test suite shows that you can create a Statement Coverage Test suite that either finds or does not find the fault depending on the vlaues tested.
 */
public class FlawedClassTestSC1 {
    @Test
    public void FullStatementCoverageDoesNotFindFault() {
        FlawedClass flawed = new FlawedClass();
        flawed.flawedMethod1(-1);
        flawed.flawedMethod1(10);
    }

    @Test
    public void FullStatementCoverageDoesFindFault() {
        FlawedClass flawed = new FlawedClass();
        flawed.flawedMethod1(0);
        flawed.flawedMethod1(10);
    }
}
