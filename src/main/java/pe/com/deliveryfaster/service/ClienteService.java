package pe.com.deliveryfaster.service;

import java.util.List;
import java.util.Optional;
import pe.com.deliveryfaster.entity.Cliente;

public interface ClienteService {
    public List<Cliente> findAll();
    public List<Cliente> findAllCustom();
    public Optional<Cliente> findById(long id);
    public Cliente add(Cliente c);
    public Cliente update(Cliente c);
    public Cliente delete(Cliente c);
    
    
}