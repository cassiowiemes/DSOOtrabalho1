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
	private final String filename;
	private Integer ultimaId = 0;
	private HashMap<Integer, T> cache;
	
	public Mapeador (String filename){
		this.filename = filename;
		cache = new HashMap<>();
		load();
	}
	
	public T get(Integer id) {
		return cache.get(id);
	}
	
	public void put(Integer chave, T objeto){
		cache.put(chave, objeto);
		persist();
	}
	
	public Collection<T> getValues(){
		return cache.values();
	}
	
	public Integer getId(){
		return ultimaId;
	}
	
	public void incrementId(){
		ultimaId++;
	}
	
	public void setLastId(Integer id){
		ultimaId = id;
	}
	
	public Integer getHighestKey(){
		Integer maxKey = 0;
		for(Integer key : cache.keySet()){
			if(key > maxKey) maxKey = key;
		}
		return maxKey;
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