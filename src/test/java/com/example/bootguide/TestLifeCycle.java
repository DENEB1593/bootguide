package com.example.bootguide;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("## BeforeAll Annotation 호출 ## ");
        System.out.println();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("## AfterAll Annotation 호출 ## ");
        System.out.println();
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("## BeforeEach Annotation 호출 ## ");
        System.out.println();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("## AfterEach Annotation 호출 ## ");
        System.out.println();
    }

    @Test
    public void test1() {
        System.out.println("TEST1");
        System.out.println();
    }

    @Test
    public void test2() {
        System.out.println("TEST2");
        System.out.println();
    }
}
