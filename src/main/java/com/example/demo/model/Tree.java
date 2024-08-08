
package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<Integer> inputNumbers;

    @Lob
    private String treeStructure;

    // Getters and Setters
}