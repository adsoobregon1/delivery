package pe.com.deliveryfaster.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.deliveryfaster.entity.EmpleadosEntity;

public interface EmpleadosRepository extends JpaRepository<EmpleadosEntity,Long>{
    @Query("select c from EmpleadosEntity c where c.estado=1")
    List<EmpleadosEntity> findAllCustom();
}
