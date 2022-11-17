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
@Entity(name="Cliente")
@Table(name="cliente_faster")


public class Cliente implements Serializable {
   private static final long serialVersionUID=1L;
   @Id
   @Column(name="clienteDNI")
   @GeneratedValue(strategy = GenerationType.IDENTITY)   
   private long codigo;
   @Column(name="nombre")
   private String nombre;
   @Column(name="estado")
   private boolean estado;
     
}
