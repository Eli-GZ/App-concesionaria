
package com.mycompany.app.concesionaria.logica;

import com.mycompany.app.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas, int precio) {

        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);        
        auto.setPrecio(precio);
        
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
         return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
       controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
      return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas, int precio) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);        
        auto.setPrecio(precio);
        
        //le pido a la persistencia que modifique
        
        controlPersis.modificarAuto(auto);
        
    }

   
    
}
