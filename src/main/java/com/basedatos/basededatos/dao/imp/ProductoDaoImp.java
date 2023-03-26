package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.ProductoModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ProductoDaoImp implements ProductoDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<ProductoModel> getPRAll(){
        String hql = "FROM ProductoModel as u";
        return (List<ProductoModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public ProductoModel getPR( long id){
        return entityManager.find(ProductoModel.class, id);

    }
    @Transactional
    @Override
    public ProductoModel registerPR( ProductoModel productoModel){
        entityManager.merge(productoModel);
        return productoModel;
    }
    @Transactional
    @Override
    public ProductoModel updatePR( ProductoModel productoModel){
        entityManager.merge(productoModel);
        return productoModel;
    }
    @Transactional
    @Override
    public void deletePR(  long id){
        ProductoModel productoModel = getPR(id);
        entityManager.remove( productoModel);
    }
}
