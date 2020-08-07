package com.bytesw.farmacy.bs.service.Impl;

import com.bytesw.farmacy.bs.dao.ShelfRepository;
import com.bytesw.farmacy.bs.service.ShelfService;
import com.bytesw.farmacy.eis.bo.Shelf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShelfServiceImpl implements ShelfService {

    private ShelfRepository shelfRepository;

    @Autowired
    public ShelfServiceImpl(ShelfRepository shelfRepository){
        this.shelfRepository = shelfRepository;
    }


    @Override
    public Shelf createShelf(Shelf shelf) {
        Shelf response = this.shelfRepository.save(shelf);
        return response;
    }

    @Override
    public Shelf getShelf(int id) {
        Optional<Shelf> response = this.shelfRepository.findById(id);
        return response.isPresent() ? response.get() : new Shelf();
    }

    @Override
    public Shelf updateShelf(Shelf shelf) {
        Shelf response = this.shelfRepository.save(shelf);
        return response;
    }

    @Override
    public Shelf deleteShelf(int id) {
        Optional<Shelf> response = this.shelfRepository.findById(id);
        this.shelfRepository.deleteById(id);
        return response.isPresent() ? response.get() : new Shelf();
    }

    @Override
    public List<Shelf> getAllShevels() {
        List<Shelf> response = this.shelfRepository.findAll();
        return response;
    }
}
