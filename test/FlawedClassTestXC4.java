import edu.kennesaw.seclass.FlawedClass;
import org.junit.Test;

/**
 * Created by mperry on 2/18/18.
 */
public class FlawedClassTestXC4 {

    /*these first two tests were just to show the fualts.*/
    @Test
    public void TestCaseForBigBangStatementCoverage()
    {
        FlawedClass flawedClass = new FlawedClass();
        boolean test;
        test = flawedClass.flawedMethod4(true,true);
        test = flawedClass.flawedMethod4(true,false);
        test = flawedClass.flawedMethod4(false,true);
        test = flawedClass.flawedMethod4(false,false);
    }

    @Test
    public void TestCaseShowingFault()
    {
        boolean test = new FlawedClass().flawedMethod4(false,false);
    }

    /*
    If we were coding individual test cases you would want something like this.
     */
    @Test
    public void TestCase1()
    {
        boolean test = new FlawedClass().flawedMethod4(true,true);
    }
    @Test
    public void TestCase2()
    {
        boolean test = new FlawedClass().flawedMethod4(true,false);
    }
    @Test
    public void TestCase3()
    {
        boolean test = new FlawedClass().flawedMethod4(false,true);
    }
    @Test
    public void TestCase4()
    {
        boolean test = new FlawedClass().flawedMethod4(false,false);
    }

}
