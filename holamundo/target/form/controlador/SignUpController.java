package com.viewnext.cursomvc.form.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.viewnext.cursomvc.form.modelo.SignUpForm;

@Controller
public class SignUpController {

    /**
     * Creamos un nuevo objeto signUpForm vacio
     * 
     * @return
     */
    @ModelAttribute("signUpForm")
    public SignUpForm setSignUpForm() {
        return new SignUpForm();
    }

    /**
     * Metodo para presentar el formulario inicial
     * 
     * @return
     */
    @GetMapping("/showSignUpForm")
    public String showForm() {
        return "signup-form";
    }

    /**
     * Presentación del formulario
     * 
     * @param signUpForm
     * @param model
     * @return
     */
    @PostMapping("/saveSignUpForm")
    public String saveUser(@ModelAttribute("signUpForm") SignUpForm signUpForm, Model model) {

        model.addAttribute("message", "Usuario registrado correctamente.");
        model.addAttribute("user", signUpForm);

        return "signup-success";
    }
}
