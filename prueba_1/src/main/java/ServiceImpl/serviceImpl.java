/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceImpl;
import com.prueba_1.dao.PruebaDao;
import com.prueba_1.domain.pruebaDomain;
import com.prueba_1.service.pruebaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Nelson
 */
public class serviceImpl {
   @Service
public class CategoriaServiceImpl implements serviceImpl {
    
    @Autowired
    private PruebaDao PruebaDao;

    @Override
    @Transactional(readOnly=true)
    public List<PruebaDao> getCategorias(boolean activos) {
        var lista=PruebaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    @Override
    @Transactional(readOnly = true)
    public PruebaDao getCategoria(PruebaDao categoria) {
        return PruebaDao.findById(PruebaDao.getId_PruebaDao()).orElse(null);
    }

    @Override
    @Transactional
    public void save(PruebaDao categoria) {
     PruebaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(PruebaDao PruebaDao) {
      PruebaDao.delete(PruebaDao);
    }
} 
}
