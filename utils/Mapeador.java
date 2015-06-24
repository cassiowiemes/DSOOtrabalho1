package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;

public class Mapeador<T>{
	private static Integer ultimaId = 0;
	private final String filename;
	private HashMap<Integer, T> cache;
	
	public Mapeador (String filename){
		this.filename = filename;
		cache = new HashMap<>();
	}
	
	public T get(Integer id) {
		return cache.get(id);
	}
	
	public void put(T thing){
		ultimaId++;
		cache.put(ultimaId, thing);
		persist();
	}
	
	public Collection<T> getValues(){
		return cache.values();
	}
	
	public Integer getId(){
		ultimaId++;
		return ultimaId;
	}
	
	public void persist(){
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cache);
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
        try{
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fin);
            this.cache = (HashMap<Integer,T>) oi.readObject();
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
}