package pe.com.deliveryfaster.service;


import java.util.List;
import java.util.Optional;
import pe.com.deliveryfaster.entity.ProductosEntity;

public interface ProductosService {
    List <ProductosEntity> findAll();
    
    Optional<ProductosEntity> findById(Long id);
    
    ProductosEntity add(ProductosEntity c);
    
    ProductosEntity update(ProductosEntity c);

    ProductosEntity delete(ProductosEntity c);
    
    List<ProductosEntity> findAllCustom();
}