package com.bytesw.farmacy.bs.controller;

import com.bytesw.farmacy.bs.service.ShelfService;
import com.bytesw.farmacy.eis.bo.Shelf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/shelf", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShelfController {

    private ShelfService shelfService;

    @Autowired
    public ShelfController(ShelfService shelfService){
        this.shelfService = shelfService;
    }

    @PostMapping("/create")
    public ResponseEntity<Shelf> createShelf(@RequestBody Shelf shelf){
        Shelf response = this.shelfService.createShelf(shelf);
        return new ResponseEntity<Shelf>(response, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Shelf> getShelf(@PathVariable int id){
        Shelf response = this.shelfService.getShelf(id);
        return new ResponseEntity<Shelf>(response, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Shelf> updateShelf(@RequestBody Shelf shelf){
        Shelf response = this.shelfService.updateShelf(shelf);
        return new ResponseEntity<Shelf>(response,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Shelf> deleteShelf(@RequestParam int id){
        Shelf response = this.shelfService.deleteShelf(id);
        return new ResponseEntity<Shelf>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Shelf>> getAllShelves(){
        List<Shelf> response = this.shelfService.getAllShevels();
        return new ResponseEntity<List<Shelf>>(response, HttpStatus.OK);
    }

}
