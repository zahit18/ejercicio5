package Interfaces;

public class Main {
    //static CocheCRUD cocheCrud = new CocheCRUDimpl();

    public static void main(String[] args) {

        Coche cocheCrud = new Coche("save","findAll","delete");
        System.out.println(cocheCrud.save);
        System.out.println(cocheCrud.findAll);
        System.out.println(cocheCrud.delete);
        
    }



}
