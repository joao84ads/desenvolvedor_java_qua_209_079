package com.ProjetoFinal.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProjetoFinal.app.CruidRepository;
import com.ProjetoFinal.app.models.Enums.CorOlhos;
import com.ProjetoFinal.app.models.Enums.Estado;
import com.ProjetoFinal.app.models.Pessoa;

@Controller
public class ProjetoController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/cadastrar")
    public String cadastrar() {
        return "cadastrar";
    }

    @RequestMapping("/lista_desaparecidos")
    public String lista_desaparecidos() {
        return "lista_desaparecidos";
    }

    @RequestMapping("/faq")
    public String faq() {
        return "faq";
    }

    @Autowired
    private CruidRepository pessoaRepository;

    @GetMapping("/cadastrar")
    public String cadastrarForm(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarSubmit(@ModelAttribute Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return "redirect:/";
    }

    @ModelAttribute("estados")
    public Estado[] getEstados() {
        return Estado.values();
    }

    @ModelAttribute("corOlhos")
    public CorOlhos[] getCorOlhos() {
        return CorOlhos.values();
    }

    

}
