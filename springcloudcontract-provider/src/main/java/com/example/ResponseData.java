package com.example;



import lombok.Data;

import java.util.Collection;

@Data
public class ResponseData {
    private Collection<User> data;
}
