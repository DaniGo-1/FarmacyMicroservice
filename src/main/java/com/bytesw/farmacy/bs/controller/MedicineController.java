package com.bytesw.farmacy.bs.controller;

import com.bytesw.farmacy.bs.service.MedicineService;
import com.bytesw.farmacy.eis.bo.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/medicine", produces = MediaType.APPLICATION_JSON_VALUE)
public class MedicineController {

    private MedicineService medicineService;

    @Autowired
    public MedicineController(MedicineService medicineService){
        this.medicineService = medicineService;
    }

    @PostMapping("/create")
    public ResponseEntity<Medicine> createMedicine(@RequestBody Medicine medicine){
        Medicine response = this.medicineService.createMedicine(medicine);
        return new ResponseEntity<Medicine>(response, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Medicine> getMedicine(@PathVariable int id){
        Medicine response = this.medicineService.getMedicine(id);
        return new ResponseEntity<Medicine>(response, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Medicine> updateMedicine(@RequestBody Medicine medicine){
        Medicine response = this.medicineService.updateMedicine(medicine);
        return new ResponseEntity<Medicine>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Medicine> deleteMedicine(@RequestParam int id){
        Medicine response = this.medicineService.deleteMedicine(id);
        return new ResponseEntity<Medicine>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Medicine>> getAllMedicines(){
        List<Medicine> response = this.medicineService.getAllMedicines();
        return new ResponseEntity<List<Medicine>>(response, HttpStatus.OK);
    }

}
