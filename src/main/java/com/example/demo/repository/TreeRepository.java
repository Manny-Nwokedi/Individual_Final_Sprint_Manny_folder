
package com.example.demo.repository;

import com.example.demo.model.Tree;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreeRepository extends JpaRepository<Tree, Long> {
    // Custom query to find trees based on the size of input numbers
    List<Tree> findByInputNumbersSize(int size);
}