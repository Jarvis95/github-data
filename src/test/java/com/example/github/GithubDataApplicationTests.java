package com.example.github;

import com.example.github.service.VmArgsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubDataApplicationTests {

    @InjectMocks
    private VmArgsService vmArgsService;

    @Value("${sample.count}")
    private String appName;

    @Test
    void testVM(){
        String s = System.getenv("COUNT");
        String secret = System.getenv("SECRET");
        System.out.println("VM Secret : " +secret);
        System.out.println("VM count : " +s);
        System.out.println("VM args : " +appName);
        Assertions.assertEquals("5", appName);
    }

}
