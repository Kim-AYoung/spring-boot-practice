package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Tests {

    @Test
    void success() {
		assertTrue(true);
    }

    @Test
    void failed() {
		assertTrue(false);
	}
}
