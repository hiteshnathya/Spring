package org.example.setter;

import org.springframework.stereotype.Service;

@Service("Cat")
public class Cat implements Animal{
    public String speaks(){
        return "meo";
    }
}
