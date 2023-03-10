package com.market.detoMarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class holaMundoController {
    @GetMapping("/hola")
    final public String saludar(){
        return "nunca hay que dejar de estudiar";
    }
}
