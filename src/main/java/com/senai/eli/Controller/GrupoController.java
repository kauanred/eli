package com.senai.eli.Controller;

import com.senai.eli.Model.Grupo;
import com.senai.eli.Repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GrupoController {

    @Autowired
    private GrupoRepository er;

    @GetMapping("/grupo/criar")
    public String criar(){
        return "grupo/criar";
    }

    @PostMapping("/grupo/criar")
    public String criar(Grupo ev){
        er.save(ev);
        return "redirect:/grupo";
    }

    @GetMapping("/grupo")
    public String listar(Model view){
        List<Grupo> listaGrupos = er.findAll();

        view.addAttribute("listaGruposNoFront", listaGrupos);

        return "grupo/listar";
    }

    @GetMapping("/grupo/alterar/{id}")
    public String alterar(@PathVariable Long id, Model model){
        Grupo grupo;
        grupo = er.findById(id).orElseThrow();

        model.addAttribute("id", id);
        model.addAttribute("grupo",grupo);
        return "grupo/alterar";
    }

    @PostMapping("/grupo/alterar/{id}")
    public String alterar(@PathVariable Long id, Grupo ev){
        ev.setId(id);

        er.save(ev);
        return "redirect:/grupo";
}
}
