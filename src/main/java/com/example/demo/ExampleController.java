package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/hello")
    public String hello()  throws URISyntaxException, IOException, NullPointerException{
      

        URI uri = new URI("hdfs://192.168.0.162:9000");
        Configuration configuration = new Configuration();

        FileSystem fs = FileSystem.get(uri,configuration);
        fs.mkdirs(new Path("/junxian428/Spring"));
        fs.close();
        return "Start Downloading...";
    }
}
