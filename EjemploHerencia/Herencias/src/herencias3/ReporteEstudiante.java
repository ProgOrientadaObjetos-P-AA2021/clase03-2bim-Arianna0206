/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class ReporteEstudiante extends Reporte{
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String c, ArrayList<Estudiante> l){
        super(c);
        setLista(l);
    }
    
    public void setLista(ArrayList<Estudiante> l){
        lista = l;
    }
    public void setPromedio(){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + getLista().get(i).getMatricula();
        }
        promedioMatriculas = suma/lista.size();
    }
    
    public double getPromedioMatriculas(){
        return promedioMatriculas;
    }
    
    public ArrayList<Estudiante> getLista(){
        return lista;
    }
    
    
    @Override
    public String toString(){
        String cadena = String.format("%s\nLista de Estudiantes: \n", 
                super.toString());
        for(int i = 0; i < lista.size(); i++){
            cadena = String.format("%s%s %s - %d - %.2f\n", cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad(),
                    getLista().get(i).getMatricula());
        }
        cadena = String.format("%sPromedio matriculas es: %.2f\n", cadena,
                getPromedioMatriculas());
        return cadena;
    }
    
    
}
