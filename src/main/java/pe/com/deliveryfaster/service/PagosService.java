package pe.com.deliveryfaster.service;


import java.util.List;
import java.util.Optional;
import pe.com.deliveryfaster.entity.PagosEntity;

public interface PagosService {
    List <PagosEntity> findAll();
    
    Optional<PagosEntity> findById(Long id);
    
    PagosEntity add(PagosEntity c);
    
    PagosEntity update(PagosEntity c);

    PagosEntity delete(PagosEntity c);
    
    List<PagosEntity> findAllCustom();
}