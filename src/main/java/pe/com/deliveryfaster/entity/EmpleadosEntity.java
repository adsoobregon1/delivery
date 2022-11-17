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

@Entity(name="EmpleadosEntity")
@Table(name="EMPLEADOS")

public class EmpleadosEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="empleado_dni")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name="empleado_nombre")
    private String nombre;
    
    @Column(name="empleado_numero")
    private int telefono;
    
    @Column(name="empleado_contrato")
    private int contrato;

    }
      
