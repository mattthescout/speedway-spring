package com.example.speedwayspring.controllers;

import com.example.speedwayspring.domain.InventoryTag;
import com.example.speedwayspring.service.TagServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(TagController.BASE_URL)
public class TagController {

    public static final String BASE_URL = "/api/v1/tags";

    private final TagServices tagServices;


    public TagController(TagServices tagServices) {
        this.tagServices = tagServices;
    }

    @GetMapping
    List<InventoryTag> getAllTags() {
        return tagServices.findAllTag();
    }

    @GetMapping("/{id}")
    public InventoryTag getTagByID(@PathVariable Long id) {
        return tagServices.findTagByID(id);
    }

}
