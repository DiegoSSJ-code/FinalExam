/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demop2bsegundo.dao;

import gt.edu.umg.demop2bsegundo.Departamento;
import gt.edu.umg.demop2bsegundo.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Win10
 */
public interface IdeptoDao extends CrudRepository<Departamento, Long> {
    
}
