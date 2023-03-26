package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@CrossOrigin
public class ProductoService {
    @Autowired
    ProductoDao productoDao;

    public List<ProductoModel> getPRAll(){
        return productoDao.getPRAll();
    }

    public ProductoModel getPR(long id){
        return productoDao.getPR(id);
    }
    public ProductoModel registerPR(ProductoModel productoModel){
        return productoDao.registerPR(productoModel);
    }

    public ProductoModel updatePR(@RequestBody ProductoModel productoModel){
        return productoDao.updatePR(productoModel);
    }

    public void deletePR(@PathVariable long id){
        productoDao.deletePR(id);
    }
}
