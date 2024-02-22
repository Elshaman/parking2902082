package org.ficha2902082.maven.parking.cristian.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;
    public List<Carro> misCarros;

    
                    

    public Cliente(String nombre,
                   String apellidos,
                   TipoDocumento tipoDocumento,
                   Long numeroDocumento,
                   Long celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
        this.misCarros = new ArrayList<Carro>();
    }
    public void addCar(Carro c ){
        this.misCarros.add(c);
    }
    public void addCar( String placa,
           TipoVehiculo tipoVehiculo ){
        Carro c = new Carro();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;
        this.misCarros.add(c);
    }
}
