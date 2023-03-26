package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.MecaSoftModel;
import com.basedatos.basededatos.models.ProductoModel;

import java.util.List;

public interface ProductoDao {
    List<ProductoModel> getPRAll();
    ProductoModel getPR( long id);
    ProductoModel registerPR(ProductoModel productoModel);
    ProductoModel updatePR(ProductoModel productoModel);
    void deletePR(long id);
}
