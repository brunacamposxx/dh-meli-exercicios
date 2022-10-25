package com.dh.meli.tutoriais.controller;

import com.dh.meli.tutoriais.model.Status;
import com.dh.meli.tutoriais.model.Tutorial;
import com.dh.meli.tutoriais.service.ITutorialService;
import com.dh.meli.tutoriais.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tutorial")
public class TutorialController {

    @Autowired
    private ITutorialService service;

    // TODO: Tratar exception de title null;
    @PostMapping
    public ResponseEntity<Tutorial> insert(@RequestBody Tutorial tutorial) {
        Tutorial newTutorial = service.insert(tutorial);
        return ResponseEntity.ok(newTutorial);
    }

    @PatchMapping("/{id}/published")
    public ResponseEntity<Tutorial> updateStatusPublished(@PathVariable Long id) {
        Optional<Tutorial> optionalTutorial = service.getById(id);
        if (optionalTutorial.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Tutorial newTutorial = optionalTutorial.get();
        newTutorial.setStatus(Status.PUBLISHED);
        newTutorial = service.update(newTutorial);
        return new ResponseEntity<>(newTutorial, HttpStatus.OK);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<Tutorial>> getByTitle(@PathVariable String title) {
        List<Tutorial> tutorials = service.getByTitle(title);
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }
}
