package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Coche {
    String save;
    String findAll;
    String delete;
    public Coche(){
    }

    public Coche(String save, String findAll, String delete) {
        this.save = save;
        this.findAll = findAll;
        this.delete = delete;
    }
}
