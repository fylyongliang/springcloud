package com.kaikeba.provider.service;

import com.kaikeba.provider.bean.Depart;
import com.kaikeba.provider.repository.DepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fyl
 * @data
 **/
@Service
public class DepartServiceimpl implements DepartService{
    @Autowired
    private DepartRepository departRepository;

    @Override
    public boolean saveDepart(Depart depart) {
        Depart result = departRepository.save(depart);
        if (result != null){

            return true;
        }
        return false;
    }

    @Override
    public boolean removeDepartById(int id) {
        if (departRepository.existsById(id)){
            departRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyDepart(Depart depart) {
        Depart result = departRepository.save(depart);
        if (result != null){

            return true;
        }
        return false;
    }

    @Override
    public Depart getDepartById(int id) {
        if (departRepository.existsById(id)){
            return departRepository.getOne(id);
        }
        Depart depart = new Depart();
        depart.setName("no this depart");

        return depart;
    }

    @Override
    public List<Depart> listAllDeparts() {
        return departRepository.findAll();
    }

}
