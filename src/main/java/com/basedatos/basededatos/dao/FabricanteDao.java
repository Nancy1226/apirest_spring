package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.FabricanteModel;
import com.basedatos.basededatos.models.GassModel;

import java.util.List;

public interface FabricanteDao {
    List<FabricanteModel> getFAll();
    FabricanteModel getF( long id);
    FabricanteModel registerF(FabricanteModel fabricanteModel);
    FabricanteModel updateF(FabricanteModel fabricanteModel);
    void deleteF(long id);
}
