package com.bytesw.farmacy.bs.service;

import com.bytesw.farmacy.eis.bo.Shelf;

import java.util.List;

public interface ShelfService {

    Shelf createShelf(Shelf shelf);

    Shelf getShelf(int id);

    Shelf updateShelf(Shelf shelf);

    Shelf deleteShelf(int id);

    List<Shelf> getAllShevels();

}
