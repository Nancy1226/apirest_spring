package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.FabricanteDao;
import com.basedatos.basededatos.models.FabricanteModel;
import com.basedatos.basededatos.models.GassModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@CrossOrigin
public class FabricanteService {
    @Autowired
    FabricanteDao fabricanteDao;

    public List<FabricanteModel> getFAll(){
        return fabricanteDao.getFAll();
    }

    public FabricanteModel getF(long id){
        return fabricanteDao.getF(id);
    }
    public FabricanteModel registerF(FabricanteModel fabricanteModel){
        return fabricanteDao.registerF(fabricanteModel);
    }

    public FabricanteModel updateF(@RequestBody FabricanteModel fabricanteModel){
        return fabricanteDao.updateF(fabricanteModel);
    }

    public void deleteF(@PathVariable long id){
        fabricanteDao.deleteF(id);
    }
}
