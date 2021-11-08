/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demop2bsegundo.servicio;

import gt.edu.umg.demop2bsegundo.Profesion;
import gt.edu.umg.demop2bsegundo.dao.IprofesionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Win10
 */
public class ProfesionServiceImpl implements ProfesionService{

    @Autowired
    private IprofesionDao IprofesionDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Profesion> listaProfesiones() {
        return (List<Profesion>) IprofesionDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Profesion profesion) {
        IprofesionDao.save(profesion);
    }

    @Override
    @Transactional
    public void eliminar(Profesion profesion) {
        IprofesionDao.delete(profesion);
    }

    @Override
    public Profesion encontrarProfesion(Profesion profesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
