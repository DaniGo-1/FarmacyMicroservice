package com.bytesw.farmacy.bs.dao;

import com.bytesw.farmacy.eis.bo.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
}
