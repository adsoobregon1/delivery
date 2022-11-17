package pe.com.deliveryfaster.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="ProductosEntity")
@Table(name="PRODUCTOS")

public class ProductosEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="pedido_producto")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
    @Column (name="pollo")
    private int comidapollo;
    @Column (name="chifa")    
    private int comidachifa;
    @Column (name="parrilla")    
    private boolean comidaparrilla;
    @Column (name="gaseosa")
    private int comidagaseosa;
    @Column (name="limonada")
    private int comidalimonada;
    @Column (name="agua")
    private int comidaagua;

    public void setEstado(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}