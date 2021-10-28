package com.clases.apirest.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
public class LoginController {

    @GetMapping("/login")
    public boolean login(
            @RequestParam(value = "error", required = false) String error,
            Model model, Principal principal, RedirectAttributes retorno){
        if(principal!=null){
            retorno.addFlashAttribute("info", "Ya has iniciado sesion.");
            return true;
        }
        if(error!=null)
            model.addAttribute("error","error en el login");
        return true;
    }
}
