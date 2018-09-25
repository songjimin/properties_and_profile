package com.song.config.profile.test;

import com.song.config.profile.test.model.SongProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    SongProperties songProperties;

    @Autowired
    String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(songProperties.getName());
        System.out.println(songProperties.getLocation());
        System.out.println(songProperties.getAge());

        System.out.println(args.containsOption("test"));

        System.out.println(hello);
    }
}
