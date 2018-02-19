package edu.kennesaw.seclass;

/**
 * Created by mperry on 2/18/18.
 */
public class FlawedClass {

    public int flawedMethod1(int n)
    {
        /*
        I broke the rules here a little. I defined a function to illustrate my answer instead of leaving it blank...

        While you can create a test suite that does not find the div/0 fault using Branch Coverage, and a test suite that finds the fault using statement coverage, neither are inherent to the test method and instead depend on the values chosen.

        This aligns with the subsumption diagram:

                    Branch Coverage
                         |
                         V
                    Statement Coverage

        You cannot have branch coverage without also having statement coverage.
         */
        int someValue = 0;

        if(n >= 0)
        {
            someValue = someValue/n;
        }

        return someValue;
    }

    public void flawedMethod2()
    {
        /*
        It is not possible.
        It cannot be an unreachable code block because then you could not have statement coverage.
        It cannot be an unstated else noop condition becasue that would not cause a div/0 error.

        If you have any test suite that has less than full statement coverage but reveals the fault, then it implies that a statement can be executed that causes the fualt. This would preclude you form being able to devise a 100% statement coverage suite that would reveal the fault, causing the ability to have ALL 100% statement coverage tests not find the fault to be impossible.

         */
    }

    public void flawedMethod3()
    {
        /*
        It is not possible.

        If you execute a branch you must execute the statements in the branch. This would imply that there would be at least 1 statement coverage test that would not reveal the fault.

        Note that you could certainly have code where 100% branch coverage does not reveal the fault, but SOME 100% statement coverage suites reveal the fault.
        */
    }

    public boolean flawedMethod4 (boolean a, boolean b)
    {
        int x = 2;
        int y = 6;
        if(a)
            x = 4;
        else
            y = y / x;
        if(b)
            x -= 1;
        else
            x += 1;
        return ((2/(y-x)) >= 1);
    }
// | a | b |output|
// ================
// | T | T |   F   |
// | T | F |   T   |
// | F | T |   T   |
// | F | F |   E   |
// ================
// Coverage required: statement coverage
}
