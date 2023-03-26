package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.FabricanteModel;
import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.services.FabricanteService;
import com.basedatos.basededatos.services.GassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fabricante")
@CrossOrigin
public class FabricanteController {
    @Autowired
    FabricanteService fabricanteService;

    @GetMapping("/getAll")
    List<FabricanteModel> getFAll(){
        return fabricanteService.getFAll();
    }

    @GetMapping(value = "/getId/{id}")
    FabricanteModel getById(@PathVariable("id") long id ){
        return fabricanteService.getF(id);
    }

    @PostMapping(value = "/create")
    FabricanteModel createF(@RequestBody FabricanteModel fabricanteModel){
        return fabricanteService.registerF(fabricanteModel);
    }

    @PutMapping(value = "/updateF/{id}")
    FabricanteModel updateUserById(@RequestBody FabricanteModel fabricanteModel ){
        return fabricanteService.updateF(fabricanteModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        fabricanteService.deleteF(id);
    }
}
