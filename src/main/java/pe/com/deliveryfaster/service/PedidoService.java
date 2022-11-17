package pe.com.deliveryfaster.service;

import java.util.List;
import java.util.Optional;
import pe.com.deliveryfaster.entity.Pedido;

public interface PedidoService {
    public List<Pedido> findAll();
    public List<Pedido> findAllCustom();
    public Optional<Pedido> findById(long id);
    public Pedido add(Pedido p);
    public Pedido update(Pedido p);
    public Pedido delete(Pedido p);
    
}
