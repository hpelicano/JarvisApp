package com.fiserv.jarvis.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author F1W1JF7
 */
public class Utils {
    
    public static void initDirectoryJarvis(){
        File fileDirectory = null;
        
        List<String> listaFolders =new ArrayList<>();
        listaFolders.add("C:/Jarvis");
        listaFolders.add("C:/Jarvis/Config");
        listaFolders.add("C:/Jarvis/Enform");
        listaFolders.add("C:/Jarvis/Audit");
        listaFolders.add("C:/Jarvis/Libs");
        listaFolders.add("C:/Jarvis/Libs/ddls");
        listaFolders.add("C:/Jarvis/Libs/tkns");
        listaFolders.add("C:/Jarvis/Test");
        listaFolders.add("C:/Jarvis/Docs");
        listaFolders.add("C:/Jarvis/Temp");
        
        for(int i=0; i<listaFolders.size(); i++){
            fileDirectory =new File(listaFolders.get(i));
            if (!fileDirectory.exists()) {
                //Creamos el Directorio
                fileDirectory.mkdir();
            }
        }
        
    }
        
    public static boolean checkFileOrDirectory(String file){
        File fileDirectory =new File(file);

        return fileDirectory.exists();
    }
    
    
    public static List<String> readFile(String filename)  {
        List<String> lst =new ArrayList<>();
        try{
            File myObj = new File( filename);

            BufferedReader br = new BufferedReader(new FileReader(myObj));
            String line;
            while ((line = br.readLine()) != null){
                lst.add(line);
            }

            return lst;
            
        }catch(FileNotFoundException e){
            System.out.println("Error al leer el archivo.");
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
        
    }
    
    public static boolean saveFile(String file, String text){
        try(FileWriter myWriter = new FileWriter(file)) {
            myWriter.write(text);
            return true;
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo.");
        }
        
        return false;
    }
    
    public static int createFile(String file){
        
        File myFile = new File(file);
        try {
            if (myFile.createNewFile()) {
                return 1;
            } else {
                return 0;
            }
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 2;
    }
        
    public static String getProperty(String file, String property){
        
        try(InputStream fis = new FileInputStream(file)) {
            Properties prop = new Properties();    
            prop.load(fis);
            
            String valorProp = prop.getProperty(property);
            
            return valorProp;
        
        }catch(Exception e) {
            System.out.println("Unable to find the specified properties file");
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static File[] getFilesFromDirectory(String directoryPath){

        try{
            File directory = new File(directoryPath); 

            File[] files = directory.listFiles(); 

            if (files != null) { 
                return files;
            }else{
                JOptionPane.showMessageDialog(null,"No se han encontrado archivos en el Directorio." );
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en el Directorio. \n Verificar Property File." );
            System.out.println(directoryPath);
        }

        return null;

    }
    
    
    public static List<String> fetchAndReadFile(String pathfile, String filename){
        
        try{
            File directory = new File(pathfile); 

            File[] files = directory.listFiles(); 

            for(File f : files){
                if(f.isFile() && f.getName().equals(filename + ".txt")){
                    
                    return readFile(pathfile + "\\\\" +filename + ".txt");
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en el Directorio. \n Verificar Property File." );
        }
        
        return null;
    }
    
    
}
