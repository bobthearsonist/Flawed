package edu.kennesaw.seclass;

/**
 * Created by mperry on 2/18/18.
 */
public class FlawedClass {

    public int flawedMethod1(int n)
    {
        int someValue = 0;

        if(n >= 0)
        {
            someValue = someValue/n;
        }

        return someValue;
    }
}
