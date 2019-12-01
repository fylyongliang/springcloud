package com.kaikeba.provider.controller;

import com.kaikeba.provider.bean.Depart;
import com.kaikeba.provider.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fyl
 * @data
 * 部门
 **/
@RequestMapping("/provider/depart")
@RestController
public class DepartController {

    @Autowired
    private DepartService departService;

    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart){

        return departService.saveDepart(depart);
    }

    @DeleteMapping("/del/{id}")
    public boolean deleteHandle(@PathVariable("id") int id){

        return  departService.removeDepartById(id);
    }

    @PutMapping("/update")
    public boolean modifyHandle(@RequestBody Depart depart){
        depart.setDbase("test");
        return  departService.modifyDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getDepartHandle(@PathVariable("id") int id){
        return  departService.getDepartById(id);
    }

    @GetMapping("/list")
    public List<Depart> listAllDepartsHandle(){
        return departService.listAllDeparts();
    }
}
