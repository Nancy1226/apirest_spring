package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.MecaSoftModel;
import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.services.MecaSoftService;
import com.basedatos.basededatos.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Producto")
@CrossOrigin
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/getAll")
    List<ProductoModel> getPRAll(){
        return productoService.getPRAll();
    }

    @GetMapping(value = "/getId/{id}")
    ProductoModel getById(@PathVariable("id") long id ){
        return productoService.getPR(id);
    }

    @PostMapping(value = "/create")
    ProductoModel createPR(@RequestBody ProductoModel productoModel){
        return productoService.registerPR(productoModel);
    }

    @PutMapping(value = "/updateG/{id}")
    ProductoModel updateUserById(@RequestBody ProductoModel productoModel){
        return productoService.updatePR(productoModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        productoService.deletePR(id);
    }
}
