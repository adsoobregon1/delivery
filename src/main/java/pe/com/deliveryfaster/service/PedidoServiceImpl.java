package pe.com.deliveryfaster.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.deliveryfaster.entity.Pedido;
import pe.com.deliveryfaster.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository pedidoRepository;
    @Override
    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    @Override
    public List<Pedido> findAllCustom() {
        return pedidoRepository.findAllCustom();
    }

    @Override
    public Optional<Pedido> findById(long id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Pedido add(Pedido p) {
        return pedidoRepository.save(p);
        }

    @Override
    public Pedido update(Pedido p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        /*Pedido objpedido = pedidoRepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objpedido);
        return pedidoRepository.save(objpedido);*/
    }

    @Override
    public Pedido delete(Pedido c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        /*Pedido objpedido=pedidoRepository.getById(p.getCodigo());
        objpedido.setEstado(false);
        return pedidoRepository.save(objpedido)*/
        
    }      
}
