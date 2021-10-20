package com.example.demo.web;

import com.example.demo.dao.PersonaDao;
import com.example.demo.domain.Persona;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladoInicio {
    @Autowired
    private PersonaDao personaDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaDao.findAll();
        model.addAttribute("personas", personas);
        return "index";
    }
}
