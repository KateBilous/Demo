package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance(){
        Point lengthP1 = new Point(7, 5);
        Point lengthP2 = new Point(7, -5);
        Assert.assertEquals(lengthP1.distance(lengthP2), 10.0);
    }



}
