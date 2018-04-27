package com.PCDproject.PCDproject.CONTROLLER;

import com.PCDproject.PCDproject.MODEL.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import C:\Users\Admin\Documents\PCDproject\src\main\java\com\PCDproject\PCDproject\MODEL.user;
import C:\Users\Admin\Documents\PCDproject\src\main\java\com\PCDproject\PCDproject\CONTROLLER.UserRepository;

@RestController
@RequestMapping(path="/utilisateur")
public class UserRESTController {
    @Autowired
    private userRepository userRepository;

    @PostMapping
    public ResponseEntity<user> CreatUser (@RequestBody user user) {

        user n = new user();
        n.setPseudo(com.PCDproject.PCDproject.MODEL.user.getPseudo());
        n.setMdp(mdp);
        n.setNom(nom);
        n.setPrenom(prenom);
        n.setGenre(genre);
        n.setAge(age);
        userRepository.save(n);
        return new ResponseEntity<>(n,HttpStatus.CREATED);
    }
    @GetMapping("{pseudo}")
    public ResponseEntity<user> Getuser(@PathVariable String pseudo) {
        user n = new user();
        return new ResponseEntity<>(n.userRepository.findOne(pseudo),HttpStatus.NOT_FOUND);
    }

}