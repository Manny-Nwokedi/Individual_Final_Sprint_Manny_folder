
package com.example.demo.controller;

import com.example.demo.model.Tree;
import com.example.demo.repository.TreeRepository;
import com.example.demo.service.TreeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@RestController
public class TreeController {

    @Autowired
    private TreeService treeService;

    @Autowired
    private TreeRepository treeRepository;

    @PostMapping("/process-numbers")
    public ResponseEntity<Tree> processNumbers(@RequestParam @Valid List<Integer> numbers) {
        try {
            Tree tree = treeService.processNumbers(numbers);
            return new ResponseEntity<>(tree, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/previous-trees")
    public ResponseEntity<List<Tree>> getPreviousTrees() {
        List<Tree> trees = treeRepository.findAll();
        if (trees.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(trees, HttpStatus.OK);
    }

    // Additional methods to add
}