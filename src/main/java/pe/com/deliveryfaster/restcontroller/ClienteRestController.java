/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.deliveryfaster.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.deliveryfaster.entity.Cliente;
import pe.com.deliveryfaster.service.ClienteService;

@RestController
@RequestMapping("/cliente")

public class ClienteRestController {
    @Autowired
    private ClienteService servicio;
    
    @GetMapping
    public List<Cliente> findAll() {
        return servicio.findAll();
    }
}