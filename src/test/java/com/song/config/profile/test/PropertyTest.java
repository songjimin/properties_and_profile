package com.song.config.profile.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:/application-test.properties")
public class PropertyTest {

    @Autowired
    Environment environment;

    @Test
    public void propertyTest(){

        assertThat(environment.getProperty("song.name")).isEqualTo("songjimin");
        assertThat(environment.getProperty("song.age")).isEqualTo("33");
    }
}
