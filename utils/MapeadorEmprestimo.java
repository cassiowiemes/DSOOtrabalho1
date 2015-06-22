package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;

import model.Emprestimo;

public class MapeadorEmprestimo {
	private static Integer ultimaId = 0;
	private final String filename = "emprestimos.txt";
	private HashMap<Integer, Emprestimo> cache;
	
	public MapeadorEmprestimo(){
		cache = new HashMap<>();
		load();
	}
	
	public Emprestimo get(Integer id){
		return cache.get(id);
	}
	
	public void put(Emprestimo emprestimo){
		ultimaId++;
		emprestimo.setId(ultimaId);
		cache.put(ultimaId, emprestimo);
		persist();
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
            System.out.print("File not Found!");
        } catch(IOException ex){
            System.out.print("IO Exception!");
        }
	}
	
	public void load(){
        try{
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fin);
            this.cache = (HashMap<Integer,Emprestimo>) oi.readObject();
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

	public Collection<Emprestimo> getValues() {
		return cache.values();
	}
}