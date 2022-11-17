package pe.com.deliveryfaster.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.deliveryfaster.entity.PagosEntity;

public interface PagosRepository extends JpaRepository<PagosEntity,Long>{
    @Query("select c from PagosEntity c where c.estado=1")
    List<PagosEntity> findAllCustom();
}
