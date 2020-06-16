package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance(){
        Point length = new Point(7,7,5,-5);
        Assert.assertEquals(length.distance(), 10.0);
    }

}
