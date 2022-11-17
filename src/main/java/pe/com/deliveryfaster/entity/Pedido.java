package pe.com.deliveryfaster.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="Pedido")
@Table(name="pedido_faster")

public class Pedido implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="pedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pedido;
    @Column (name="producto" /*insertable = false, updatable = false*/)
    private String producto;
    @Column (name="precio")
    private double precio;
    @Column (name="cantidad")
    private double cantidad;
    @Column (name="descuento")
    private double descuento;
    @Column (name="disponible")
    private boolean disponible;
    @ManyToOne
    @JoinColumn(name="clientDNI", nullable = false)
    private Cliente cliente;
}