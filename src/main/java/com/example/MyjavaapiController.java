package com.example;

import io.micronaut.http.annotation.*;

@Controller("/myjavaapi")
public class MyjavaapiController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}