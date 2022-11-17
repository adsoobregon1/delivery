package pe.com.deliveryfaster.service;


import java.util.List;
import java.util.Optional;
import pe.com.deliveryfaster.entity.EmpleadosEntity;

public interface EmpleadosService {
    List <EmpleadosEntity> findAll();
    
    Optional<EmpleadosEntity> findById(Long id);
    
    EmpleadosEntity add(EmpleadosEntity c);
    
    EmpleadosEntity update(EmpleadosEntity c);

    EmpleadosEntity delete(EmpleadosEntity c);
    
    List<EmpleadosEntity> findAllCustom();
}