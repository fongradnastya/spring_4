package com.example.demo.controllers;

import com.example.demo.models.Clothes;
import com.example.demo.services.ClothesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClothesController {
    private static final Logger logger = LoggerFactory.getLogger(ClothesController.class);
    private final ClothesService clothesService;

    /**
     * Конструктор для внедрения сервиса мебели.
     *
     * @param clothesService Сервис для работы с мебелью.
     */
    @Autowired
    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }

    @GetMapping("/")
    public String listClothes(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("currentPage", "index");
        if (name != null) {
            model.addAttribute("clothes", clothesService.filterByName(name));
        } else {
            model.addAttribute("clothes", clothesService.findAll());
        }
        return "index";
    }
    @GetMapping("/{id}")
    public String viewClothesDetails(@PathVariable("id") int id, Model model) {
        model.addAttribute("currentPage", "details");
        Clothes clothes = clothesService.findOne(id);
        if (clothes != null) {
            model.addAttribute("furniture", clothes);
            return "show";
        } else {
            logger.error("Clothes with id {} not found", id);
            model.addAttribute("error", "Clothes not found");
            return "error";
        }
    }
}