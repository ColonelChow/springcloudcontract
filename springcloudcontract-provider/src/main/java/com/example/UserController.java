package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Slf4j
public class UserController {

    @GetMapping("/api/users")
    public ResponseData getAllCustomers(){
        ResponseData responseData = new ResponseData();
        //responseData.setData(null);
        return responseData;
    }

    @GetMapping("/api/userById")
    public String getById(@RequestParam(value = "id",defaultValue = "1") String id){
        //log.info("id:",id);
        return id;
    }

    @GetMapping("/api/userById2/123")
    public String getById(@RequestBody Map map){
        String id = (String) map.get("id");
        //log.info("id:",id);
        return id;
    }
}

