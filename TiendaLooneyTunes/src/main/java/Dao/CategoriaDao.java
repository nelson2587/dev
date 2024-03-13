package Dao;
import Domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface CategoriaDao extends JpaRepository <Categoria,Long> {
}