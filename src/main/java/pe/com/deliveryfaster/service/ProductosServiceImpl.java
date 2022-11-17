package pe.com.deliveryfaster.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.deliveryfaster.entity.ProductosEntity;
import pe.com.deliveryfaster.repository.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService{
    
    @Autowired
    private ProductosRepository productosRepository;

    @Override
    public List<ProductosEntity> findAll() {
        return productosRepository.findAll();
    }

    @Override
    public Optional<ProductosEntity> findById(Long id) {
        return productosRepository.findById(id);
    }

    @Override
    public ProductosEntity add(ProductosEntity c) {
        return productosRepository.save(c);
    }

    @Override
    public ProductosEntity update(ProductosEntity c) {
        ProductosEntity objCurso=productosRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objCurso);
        return productosRepository.save(c);
    }

    @Override
    public ProductosEntity delete(ProductosEntity c) {
        ProductosEntity objProductos=productosRepository.getById(c.getCodigo());
        objProductos.setEstado(false);
        return productosRepository.save(c);
    }

    @Override
    public List<ProductosEntity> findAllCustom() {
         return productosRepository.findAllCustom ();
    }
    
    
}
