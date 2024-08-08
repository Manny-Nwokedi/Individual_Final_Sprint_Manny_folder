
package com.example.demo.controller;

import com.example.demo.model.Tree;
import com.example.demo.repository.TreeRepository;
import com.example.demo.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TreeController {

    @Autowired
    private TreeService treeService;

    @Autowired
    private TreeRepository treeRepository;

    @PostMapping("/process-numbers")
    public Tree processNumbers(@RequestParam List<Integer> numbers) {
        return treeService.processNumbers(numbers);
    }

    @GetMapping("/previous-trees")
    public List<Tree> getPreviousTrees() {
        return treeRepository.findAll();
    }
}
