package org.hatch.Controllers;


import org.hatch.LambdaPOC;

@RestController
public class SampleController {

    @PostMapping("/sample")
    public String returnPOC(){
        var test = new LambdaPOC();
        return test.handleRequest();
    }
}
