package org.example.setter;

import org.springframework.stereotype.Service;

@Service("Dog")
public class Dog implements Animal{
    public String speaks(){
        return "bark";
    }
}
