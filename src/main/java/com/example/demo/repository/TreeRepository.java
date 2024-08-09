
package com.example.demo.repository;

import com.example.demo.model.Tree;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;


public interface TreeRepository extends CrudRepository<Tree, Long> {
    // Custom query to find trees based on the size of input numbers
    Iterable<Tree> findByInputNumbersSize(Integer size);
}