package com.bytesw.farmacy.bs.controller;

import com.bytesw.farmacy.bs.service.ProviderService;
import com.bytesw.farmacy.eis.bo.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/provider", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProviderController{

    private ProviderService providerService;

    @Autowired
    public ProviderController(ProviderService providerService){
        this.providerService = providerService;
    }

    @PostMapping("/create")
    public ResponseEntity<Provider> createProvider(@RequestBody Provider provider){
        Provider response = this.providerService.createProvider(provider);
        return new ResponseEntity<Provider>(response, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Provider> getProvider(@PathVariable int id){
        Provider response = this.providerService.getProvider(id);
        return new ResponseEntity<Provider>(response, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Provider> updateProvider(@RequestBody Provider provider){
        Provider response = this.providerService.updateProvider(provider);
        return new ResponseEntity<Provider>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Provider> deleteProvider(@RequestParam int id){
        Provider response = this.providerService.deleteProvider(id);
        return new ResponseEntity<Provider>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Provider>> getAllProviders(){
        List<Provider> response = this.providerService.getAllProviders();
        return new ResponseEntity<List<Provider>>(response, HttpStatus.OK);
    }

}
