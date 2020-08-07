package com.bytesw.farmacy.bs.service;

import com.bytesw.farmacy.eis.bo.Medicine;

import java.util.List;

public interface MedicineService {

    Medicine createMedicine(Medicine medicine);

    Medicine getMedicine(int id);

    Medicine updateMedicine(Medicine medicine);

    Medicine deleteMedicine(int id);

    List<Medicine> getAllMedicines();

}
