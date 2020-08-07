package com.bytesw.farmacy.bs.service.Impl;

import com.bytesw.farmacy.bs.dao.MedicineRepository;
import com.bytesw.farmacy.bs.service.MedicineService;
import com.bytesw.farmacy.eis.bo.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineServiceImpl implements MedicineService {

    private MedicineRepository medicineRepository;

    @Autowired
    public MedicineServiceImpl(MedicineRepository medicineRepository){
        this.medicineRepository = medicineRepository;
    }

    @Override
    public Medicine createMedicine(Medicine medicine) {
        Medicine response = this.medicineRepository.save(medicine);
        return response;
    }

    @Override
    public Medicine getMedicine(int id) {
        Optional<Medicine> response = this.medicineRepository.findById(id);
        return response.isPresent() ? response.get() : new Medicine();
    }

    @Override
    public Medicine updateMedicine(Medicine medicine) {
        Medicine response = this.medicineRepository.save(medicine);
        return response;
    }

    @Override
    public Medicine deleteMedicine(int id) {
        Optional<Medicine> response = this.medicineRepository.findById(id);
        this.medicineRepository.deleteById(id);
        return response.isPresent() ? response.get() : new Medicine();
    }

    @Override
    public List<Medicine> getAllMedicines() {
        List<Medicine> response = this.medicineRepository.findAll();
        return response;
    }
}
