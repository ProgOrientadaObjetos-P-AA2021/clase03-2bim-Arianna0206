/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class ReporteDocente extends Reporte{
    double promedioSueldo;
    ArrayList<Docente> lista;
    
    public ReporteDocente(String c, ArrayList<Docente> l){
        super(c);
        setLista(l);
    }

    public void setLista(ArrayList<Docente> l){
        lista = l;
    }
    public void setPromedio(){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + getLista().get(i).getSueldo();
        }
        promedioSueldo = suma/lista.size();
    }
    
    public double getPromedio(){
        return promedioSueldo;
    }
    
    public ArrayList<Docente> getLista(){
        return lista;
    }
    
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n Lista de Docentes: \n", 
                super.toString());
        for(int i = 0; i < lista.size(); i++){
            cadena = String.format("%s%s %s - %d - %.2f\n", cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad(),
                    getLista().get(i).getSueldo());
        }
        cadena = String.format("%sPromedio de sueldos es: %.2f\n",cadena,
                getPromedio());
        return cadena;
    }
    
    
}
