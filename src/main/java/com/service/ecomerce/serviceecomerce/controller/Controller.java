package com.service.ecomerce.serviceecomerce.controller;
import com.service.ecomerce.serviceecomerce.model.AllPost;
import com.service.ecomerce.serviceecomerce.model.Post;
import com.service.ecomerce.serviceecomerce.service.Connection;
import org.apache.catalina.startup.ConnectorCreateRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;


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

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String post(@RequestBody Post post){
        return connection.post(post);
    }
}
