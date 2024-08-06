package maratonlar.maraton02.utility;


import maratonlar.maraton02.entities.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager<T extends BaseEntity> implements ICRUD<T> {

    protected ArrayList<T> veriListesi = new ArrayList<>();

    @Override
    public T save(T t) {
        if (veriListesi.add(t)) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public List<T> saveAll(List<T> t) {
        if (veriListesi.addAll(t)) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public T update(T t) {
        int index = veriListesi.indexOf(t);
        return veriListesi.set(index,t);
    }

    @Override
    public List<T> findAll() {
        return veriListesi;
    }

    @Override
    public T findByID(int id) {
        for (BaseEntity entity : veriListesi ){
            if(entity.getId() == id){
                return (T) entity;
            }
        }
        return null;
    }

    @Override
    public void deleteByID(int id) {
       if(veriListesi.remove(findByID(id))){
           System.out.println("Entity successfully deleted...");
       } else {
           System.out.println("Entity is not deleted...");
       }
    }
}
