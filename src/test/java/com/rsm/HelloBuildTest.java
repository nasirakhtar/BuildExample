package com.rsm;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HelloBuildTest {

    @Test
    public void getName() {
        HelloBuild helloBuild = new HelloBuild("Anjum");
        assertEquals("Anjum", helloBuild.getName());
    }

}