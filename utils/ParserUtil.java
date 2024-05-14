package com.fiserv.jarvis.utils;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ParserUtil {

    public static List<String> getContentField(String dllPath, String tknPath, String file){
        //Busco la existencia del archivo en el subvol DLL, si no lo encuentro lo bueco en TKN
        List<String> records;
        
        records = Utils.fetchAndReadFile(dllPath, file);
        if (records == null){
            
            records = Utils.fetchAndReadFile(tknPath, file);
            
            if(records == null){
                JOptionPane.showMessageDialog(null, "No se encontró el archivo");
            }else{
                return records;
            }
        }else{
            return records;
        }

        return null;
    }
    
    public static List<String> FileMapper(List<String> lista){
        List<String> listSalida =new ArrayList<>();
        String pos = null;
        String longitud = null;
        String nombre = null;
        try{
            for(String linea : lista){
                if(linea.equals("              END")){ break; }

                if(linea.charAt(0) != ' '){ 
                    int i=0;
                    int posIni=0;

                    while(linea.charAt(i) != ' '){ i++; }
                    pos = linea.substring(0, i);

                    while(linea.charAt(i) != '['){ i++; }
                    i++;
                    posIni = i;
                    while(linea.charAt(i) != ']'){ i++; }
                    longitud = linea.substring(posIni, i);

                    i++;
                    while(linea.charAt(i) == ' '){ i++; }

                    posIni = i;
                    if(linea.length() < 60){
                        nombre = linea.substring(posIni, linea.length());
                    }else{
                        while(linea.charAt(i) != ' '){ i++; }
                        nombre = linea.substring(posIni, i);
                    }
                    //while(linea.charAt(i) != ' ' && linea.charAt(i) != 10 ){ i++; }
                    //nombre = linea.substring(posIni, i);

                    listSalida.add(pos + "," + longitud + "," + nombre);
                    //System.out.println(pos + "," + longitud + "," + nombre);
                }
            }
            
        }catch(StringIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Error en el parser del Registro.\n Verificar los datos de los campos.");
        }
        
        
        return listSalida;
    }
    
    public static List<String> ParserExecute(List<String> listMapper, String message, boolean tieneEspacios){
        String[] campos =new String[3];
        List<String> recordSet =new ArrayList<>();
        StringBuilder sb =new StringBuilder();
        String clave;
        String valor;
        
        //Armo el mensaje en una variable continua
        for(String line : message.split("\\n")){
            if(tieneEspacios){
                sb.append(line.substring(6));
            }else{
                sb.append(line);
            }
        }

        //comienzo a procesar la listMapper junto con el mensaje
        for(String linea : listMapper){
            campos = linea.split(",");
            int posIni = Integer.parseInt(campos[0]);
            int posFinal = posIni + Integer.parseInt(campos[1]);
            
            clave = campos[2];
            valor = sb.substring(posIni, posFinal);

            recordSet.add(clave + "," + valor);
            //System.out.println("clave: " + clave + " - valor: " + valor);
        }
        
        return recordSet;
    }
    
    
    
    public static List<String> TokenScanner(String ptr){
        
        
        return null;
    }
    
}
