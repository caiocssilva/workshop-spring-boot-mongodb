package com.caiocesar.workshopmongo.resources;

import com.caiocesar.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User caio = new User("1", "Caio Cesar", "caio@gmail.com");
        User mara = new User("2", "Mara Silva", "mara@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(caio, mara));
        return ResponseEntity.ok().body(list);
    }
}
