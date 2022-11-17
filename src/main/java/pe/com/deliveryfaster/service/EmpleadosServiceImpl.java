package pe.com.deliveryfaster.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.deliveryfaster.entity.EmpleadosEntity;
import pe.com.deliveryfaster.repository.EmpleadosRepository;

public class EmpleadosServiceImpl implements EmpleadosService{
    @Autowired
    private EmpleadosRepository empleadosRepository;

    @Override
    public List<EmpleadosEntity> findAll() {
        return empleadosRepository.findAll();
    }

    @Override
    public Optional<EmpleadosEntity> findById(Long id) {
        return empleadosRepository.findById(id);
    }

    @Override
    public EmpleadosEntity add(EmpleadosEntity c) {
        return empleadosRepository.save(c);
    }

    @Override
    public EmpleadosEntity update(EmpleadosEntity c) {
        EmpleadosEntity objCurso=empleadosRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objCurso);
        return empleadosRepository.save(c);
    }

    @Override
    public EmpleadosEntity delete(EmpleadosEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       /*EmpleadosEntity objEmpleados=empleadosRepository.getById(c.getCodigo());
        objEmpleados.setEstado(false);
        return empleadosRepository.save(c)*/
    }

    @Override
    public List<EmpleadosEntity> findAllCustom() {
         return empleadosRepository.findAllCustom ();
    }
    
    
}
