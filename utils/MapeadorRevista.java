package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;

import model.Livro;
import model.Revista;

public class MapeadorRevista
{
	private static int ultimaId = 0;
    private final String filename = "revistas.txt";
    private HashMap<Integer,Revista> cacheRevistas;
    //cacheLivros.values(); para pegar valor do hashMap
    
    public MapeadorRevista(){
        cacheRevistas = new HashMap<>();
        load();
    }
    
    public Revista get(Integer id){
        return cacheRevistas.get(id);
    }
    
    public void put(Revista revista){
    	//chama o metodo que grava a revista no disco
    	//incrementa ultima id
        ultimaId++;
        revista.setId(ultimaId);
        cacheRevistas.put(ultimaId, revista);
        persist();
    }


    public void persist(){
    	//salva a revista em arquivo
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheRevistas);
            oo.flush();
            fout.flush();
            oo.close();
            fout.close();
            oo = null;
            fout = null;
        } catch(FileNotFoundException ex){
            System.out.println(ex);
        } catch(IOException ex){
            System.out.println(ex);
        }
    }
    public void load(){
    	//carrega o conjunto de revistas para a memória
        try{
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fin);
            this.cacheRevistas = (HashMap<Integer,Revista>) oi.readObject();
            oi.close();
            fin.close();
            oi = null;
            fin = null;;
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        } catch(FileNotFoundException ex){
            System.out.println(ex);
        } catch(IOException ex){
            System.out.println(ex);
        }
    }

	public Collection<Revista> getValues() {
		return cacheRevistas.values();
	}
}
