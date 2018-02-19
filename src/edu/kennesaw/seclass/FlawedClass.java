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

    
}
