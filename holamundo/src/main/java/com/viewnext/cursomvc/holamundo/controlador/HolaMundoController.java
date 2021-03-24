package com.viewnext.cursomvc.holamundo.controlador;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viewnext.cursomvc.holamundo.modelo.HolaMundo;

@Controller
public class HolaMundoController {

    @RequestMapping("/holamundo")
    public String handler(Model model) {

        HolaMundo holaMundo = new HolaMundo();
        holaMundo.setMessage("Hola mundo con Spring MVC 5!!!");
        holaMundo.setDateTime(LocalDateTime.now().toString());
        model.addAttribute("holaMundo", holaMundo);
        return "holaMundo";
    }
}
