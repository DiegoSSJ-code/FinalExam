/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.demop2bsegundo.servicio;

import gt.edu.umg.demop2bsegundo.Persona;
import gt.edu.umg.demop2bsegundo.Profesion;
import java.util.List;

/**
 *
 * @author Win10
 */
public interface ProfesionService {
    public List<Profesion> listaProfesiones();
    public void guardar(Profesion profesion);
    public void eliminar(Profesion profesion);
    public Profesion encontrarProfesion(Profesion profesion);
}
