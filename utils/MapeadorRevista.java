package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import model.Revista;

public class MapeadorRevista
{
	private static int ultimaId = 0;
    private final String filename = "revistas.txt";
    private HashMap<Integer,Revista> cacheRevista;
    //cacheLivros.values(); para pegar valor do hashMap
    
    public MapeadorRevista(){
        cacheRevista = new HashMap<>();
        load();
    }
    
    public Revista get(Integer id){
        return cacheRevista.get(id);
    }
    
    public void put(Revista revista){
    	//chama o metodo que grava a revista no disco
    	//incrementa ultima id
        ultimaId++;
        revista.setId(ultimaId);
        cacheRevista.put(ultimaId, revista);
        persist();
    }


    public void persist(){
    	//salva a revista em arquivo
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheRevista);
            oo.flush();
            fout.flush();
            oo.close();
            fout.close();
            oo = null;
            fout = null;
        } catch(FileNotFoundException ex){
            System.out.print("Jagaranga!");
        } catch(IOException ex){
            System.out.print("Jabuticaba!");
        }
    }
    public void load(){
    	//carrega o conjunto de revistas para a mem�ria
        try{
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fin);
            this.cacheRevista = (HashMap<Integer,Revista>) oi.readObject();
            oi.close();
            fin.close();
            oi = null;
            fin = null;;
        }catch(ClassNotFoundException ex){
            System.out.print("Não pode!");
        } catch(FileNotFoundException ex){
            System.out.print("Ser a mesma!");
        } catch(IOException ex){
            System.out.print("PALAVRA!");
        }
    }
}
