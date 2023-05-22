/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enumeradores.FormaPago;
import Enumeradores.TipoCobertura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dudum
 */
public class Polizas {
    
    private Vehiculos auto;
    private Clientes cliente;
    private int nroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<Cuota> cuotas;
    private FormaPago formaPago;
    private double montoAsegurado;
    private boolean granizo;
    private double maxGranizo;
    private TipoCobertura cobertura;
    
    
}
