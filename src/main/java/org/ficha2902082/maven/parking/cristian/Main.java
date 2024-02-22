package org.ficha2902082.maven.parking.cristian;

import org.ficha2902082.maven.parking.cristian.entities.Cupo;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Registro;
import java.util.List;
import java.util.ArrayList;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        
        //Crear dos cupos
        //Instanciar dos cupos: 
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B' ,
                                 5.0 ,
                                  2.5 );

        //Instanciar dos carros:
        Carro carrito1 = new Carro("ASJ 456" , 
                                  TipoVehiculo.MOTO);
        Carro carrito2 = new Carro("DFR 234" ,
                                  TipoVehiculo.CAMIONETA);

        //Instanciar un cliente:
        Cliente cli = new Cliente("Cristian",
                                  "Buitrago", 
                                  TipoDocumento.CC , 
                                  25234234L, 
                                  3005555555L);
        
        //vincular carros al cliente
        cli.addCar(carrito1);
        cli.addCar(carrito2);
        cli.addCar("ERT TYU",
                   TipoVehiculo.CAMION);

        //Declara una lista de Registros
        List<Registro> misRegistros = new ArrayList<>();

        //Instanciar dos Registros E/S
        Registro registro1 = new Registro(
            LocalDate.of(2024 , Month.JANUARY , 23) , 
            LocalTime.of(15 , 30 , 34) , 
            LocalDate.of(2024 , Month.FEBRUARY , 1),
            LocalTime.of(6 , 30 , 23), 
            50000.00,
            cli.misCarros.get(0),
            cupito1
        );

        //vincular los registros a la lista
        //de registros
        misRegistros.add(registro1);

        //Recorrer la lista de registros
        for( Registro r : misRegistros  ){
                System.out.println( "Placa: " +  
                                    r.carro.placa  + "|" +
                                    "Cupo: " + 
                                    r.cupo.letra + "|" + 
                                    "Valor: " + 
                                    r.valor + "|" +
                                    "Fecha Inicio: " + 
                                    r.fechaInicio.toString() + "|"

                );
        }



        
    }

 }