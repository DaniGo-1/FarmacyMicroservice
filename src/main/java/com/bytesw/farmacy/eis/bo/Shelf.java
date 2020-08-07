package com.bytesw.farmacy.eis.bo;

import javax.persistence.*;

@Entity
@Table(name = "shelves")
public class Shelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_shelf;
    private String letter;
    private String therapeutic_activity;

    public int getId_shelf() {
        return id_shelf;
    }

    public void setId_shelf(int id_shelf) {
        this.id_shelf = id_shelf;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getTherapeutic_activity() {
        return therapeutic_activity;
    }

    public void setTherapeutic_activity(String therapeutic_activity) {
        this.therapeutic_activity = therapeutic_activity;
    }
}
