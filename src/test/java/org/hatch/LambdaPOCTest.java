package org.hatch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LambdaPOCTest {

    @Test
    public void TestHandleRequest(){
        var test = new LambdaPOC();
        assertEquals("This message comes from lambda",test.handleRequest());
    }

}
