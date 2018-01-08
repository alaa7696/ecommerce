package com.service.ecomerce.serviceecomerce.controller;
import com.service.ecomerce.serviceecomerce.model.AllPost;
import com.service.ecomerce.serviceecomerce.model.Post;
import com.service.ecomerce.serviceecomerce.service.Connection;
import org.apache.catalina.startup.ConnectorCreateRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;


@RestController
public class Controller {
    Connection connection;

    @Autowired
    public Controller(Connection connection) {
        this.connection = connection;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Post get(@PathVariable(value = "id") String id){
        return connection.get(id);
    }

    @RequestMapping("/getAll")
    public Post[] getAll(){

        return connection.getAll();
    }
    @RequestMapping("/getGenre")
    public List<String> getGenre(){

        return connection.getGenre();
    }
    @RequestMapping(value = "getByGenre/{genre}",method = RequestMethod.GET)
    public List<Post> getByGenre(@PathVariable(value = "genre" ) String genre){
        return connection.getByGenre(genre);
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String post(@RequestBody Post post){
        return connection.post(post);
    }
}
