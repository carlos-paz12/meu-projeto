/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.carlos_paz12.meuprojeto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author carlos-paz12
 */
@Controller
public class MeuController {

    @GetMapping("/meu-controller")
    public String index(@RequestParam(required = false) String nome, Model model) {
        model.addAttribute("nome", nome);
        return "index";
    }

}
