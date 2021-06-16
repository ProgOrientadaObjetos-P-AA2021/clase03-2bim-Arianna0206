/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class ReportePolicia extends Reporte {
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String c, ArrayList<Policia> l){
        super(c);
        setLista(l);
    }
    
    public void setLista(ArrayList<Policia> l){
        lista = l;
    }
    public void setPromedio(){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + getLista().get(i).getEdad();
        }
        promedioEdades = suma/lista.size();
    }
    
    public double getPromedioEdades(){
        return promedioEdades;
    }
    
    public ArrayList<Policia> getLista(){
        return lista;
    }
    
    
    @Override
    public String toString(){
        String cadena = String.format("%s\nLista de Policias: \n", 
                super.toString());
        for(int i = 0; i < lista.size(); i++){
            cadena = String.format("%s%s %s - %d - %s\n", cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad(),
                    getLista().get(i).getRango());
        }
        cadena = String.format("%sPromedio de edades es: %.2f\n", cadena,
                getPromedioEdades());
        return cadena;
    }
}
