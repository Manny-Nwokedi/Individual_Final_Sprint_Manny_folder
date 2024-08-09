
package com.example.demo.controller;

import com.example.demo.model.Tree;
import com.example.demo.repository.TreeRepository;
import com.example.demo.service.TreeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

public class TreeController {

    private TreeService treeService;

    private TreeRepository treeRepository;

    public ResponseEntity<Tree> processNumbers(@RequestParam  List<Integer> numbers) {
        try {
            Tree tree = treeService.processNumbers(numbers);
            return new ResponseEntity<>(tree, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/previous-trees")
    public ResponseEntity<Iterable<Tree>> getPreviousTrees() {
        Iterable<Tree> trees = treeRepository.findAll();
        if (trees.equals(null)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(trees, HttpStatus.OK);
    }

    // Additional methods to add
}