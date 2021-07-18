package multimodule.controller;

import multimodule.domain.LibraryDTO;
import multimodule.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class Controller {

    @Autowired
    Service service;
    @PostMapping("/crear")
    public ResponseEntity<LibraryDTO> create(@RequestBody LibraryDTO libraryDTO) {
        return new ResponseEntity<>(service.createlibrary(libraryDTO), HttpStatus.CREATED);
    }
}
