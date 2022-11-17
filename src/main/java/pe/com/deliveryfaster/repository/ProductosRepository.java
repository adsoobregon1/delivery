package pe.com.deliveryfaster.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.deliveryfaster.entity.ProductosEntity;

public interface ProductosRepository extends JpaRepository<ProductosEntity,Long>{
    @Query("select c from ClienteEntity c where c.estado=1")
    List<ProductosEntity> findAllCustom();
}
