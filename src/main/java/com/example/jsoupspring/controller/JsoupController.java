package com.example.jsoupspring.controller;


import com.example.jsoupspring.service.JsoupService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@RestController
@AllArgsConstructor
public class JsoupController {

    public final JsoupService jsoupService;

    @GetMapping("title")
    public String hello(@RequestParam String url) throws IOException {
        return jsoupService.getTitle(url);

    }

    @DeleteMapping("delete")
    public void delete(@RequestParam long id) {
        jsoupService.delete(id);

    }




}
