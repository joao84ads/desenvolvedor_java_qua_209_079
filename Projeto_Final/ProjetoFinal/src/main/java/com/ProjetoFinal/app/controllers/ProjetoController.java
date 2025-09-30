package com.ProjetoFinal.app.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ProjetoFinal.app.models.Caracteristicas;
import com.ProjetoFinal.app.models.Endereco;
import com.ProjetoFinal.app.CruidRepository;
import com.ProjetoFinal.app.models.Enums.CorCabelo;
import com.ProjetoFinal.app.models.Enums.CorOlhos;
import com.ProjetoFinal.app.models.Enums.Estado;
import com.ProjetoFinal.app.models.Enums.Genero;
import com.ProjetoFinal.app.models.Enums.TipoCabelo;
import com.ProjetoFinal.app.models.Enums.TipoCorpo;
import com.ProjetoFinal.app.models.Enums.TipoPele;
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
        Pessoa pessoa = new Pessoa();
        pessoa.setCaracteristicas(new Caracteristicas());
        pessoa.setEndereco(new Endereco()); 
        model.addAttribute("pessoa", pessoa);
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarSubmit(@ModelAttribute Pessoa pessoa, @RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                byte[] fotoBytes = file.getBytes();
                pessoa.setFoto(fotoBytes);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        pessoaRepository.save(pessoa);
        return "redirect:/lista_desaparecidos";
    }

    @GetMapping("/imagem/{id}")
    public ResponseEntity<byte[]> exibirImagem(@PathVariable Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).orElse(null);
        if (pessoa != null && pessoa.getFoto() != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_JPEG)
                    .body(pessoa.getFoto());
        }
        return ResponseEntity.notFound().build();
    }
    

    @GetMapping("/lista_desaparecidos")
    public String listaDesaparecidos(Model model) {
        List<Pessoa> desaparecidos = (List<Pessoa>) pessoaRepository.findAll();
        model.addAttribute("desaparecidos", desaparecidos);
        return "lista_desaparecidos";
    }

    @ModelAttribute("estados")
    public Estado[] getEstados() {
        return Estado.values();
    }

    @ModelAttribute("corOlhos")
    public CorOlhos[] getCorOlhosValues() {
        return CorOlhos.values();
    }

    @ModelAttribute("corCabelo")
    public CorCabelo[] getCorCabeloValues() {
        return CorCabelo.values();
    }

    @ModelAttribute("genero")
    public Genero[] getGenero() {
        return Genero.values();
    }

    @ModelAttribute("tipoCabelo")
    public TipoCabelo[] getTipoCabeloValues() {
        return TipoCabelo.values();
    }

    @ModelAttribute("tipoCorpo")
    public TipoCorpo[] gettipoCorpoValues() {
        return TipoCorpo.values();
    }

    @ModelAttribute("tipoPele")
    public TipoPele[] gettipoPeleValues() {
        return TipoPele.values();
    }



}
