package pe.com.deliveryfaster.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.deliveryfaster.entity.PagosEntity;
import pe.com.deliveryfaster.repository.PagosRepository;

public class PagosServiceImpl implements PagosService{
    @Autowired
    private PagosRepository pagosRepository;

    @Override
    public List<PagosEntity> findAll() {
        return pagosRepository.findAll();
    }

    @Override
    public Optional<PagosEntity> findById(Long id) {
        return pagosRepository.findById(id);
    }

    @Override
    public PagosEntity add(PagosEntity c) {
        return pagosRepository.save(c);
    }

    @Override
    public PagosEntity update(PagosEntity c) {
        PagosEntity objPagos=pagosRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objPagos);
        return pagosRepository.save(c);
    }

    @Override
    public PagosEntity delete(PagosEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        /*
        PagosEntity objPagos=pagosRepository.getById(c.getCodigo());
        objPagos.setEstado(false);
        return pagosRepository.save(c);
    */
    }

    @Override
    public List<PagosEntity> findAllCustom() {
         return pagosRepository.findAllCustom ();
    }
    
    
}
