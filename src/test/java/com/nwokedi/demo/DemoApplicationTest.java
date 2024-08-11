
package com.nwokedi.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    // 1. Context Load Test
    @Test
    void contextLoads() {
        // This test will fail if the application context cannot start
    }

    // 2. Test for Binary Search Tree Creation
    @Test
    void testBinarySearchTreeCreation() {
        String numbers = "5,3,7,2,4,6,8";
        ResponseEntity<String> response = this.restTemplate.postForEntity("/process-numbers", numbers, String.class);
        assertThat(response.getStatusCode().is2xxSuccessful()).isTrue(); // Check if status is 2xx
        assertThat(response.getBody()).contains("root"); // Check if the response contains "root"
    }

    // 3. Test for Previous Trees Retrieval
    @Test
    void testRetrievePreviousTrees() {
        ResponseEntity<String> response = this.restTemplate.getForEntity("/previous-trees", String.class);
        assertThat(response.getStatusCode().is2xxSuccessful()).isTrue(); // Check if status is 2xx
        assertThat(response.getBody()).contains("trees");
    }
}