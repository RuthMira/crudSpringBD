package com.example.crud.controller;

import com.example.crud.model.Cachorro;
import com.example.crud.service.CachorroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CachorroController {
    @Autowired
    private CachorroService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("cachorros", service.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("cachorro", new Cachorro());
        return "create";
    }

    @PostMapping("/create")
    public String createCachorro(Cachorro cachorro) {
        service.save(cachorro);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Cachorro cachorro = service.findById(id);
        if (cachorro != null) {
            model.addAttribute("cachorro", cachorro);
            return "update";
        }
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String updateCachorro(@PathVariable("id") Long id, Cachorro cachorro) {
        cachorro.setId(id);
        service.save(cachorro);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCachorro(@PathVariable("id") Long id) {
        service.deleteById(id);
        return "redirect:/";
    }
}
