
package com.example.demo.service;

import com.example.demo.model.Tree;
import com.example.demo.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {

    @Autowired
    private TreeRepository treeRepository;

    public Tree processNumbers(List<Integer> numbers) {
        // Logic to create a binary search tree and store it
        Tree tree = new Tree();
        tree.setInputNumbers(numbers);
        // Convert the tree to JSON or another format
        tree.setTreeStructure("Binary Tree JSON Representation");

        return treeRepository.save(tree);
    }
}