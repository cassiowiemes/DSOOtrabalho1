package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import model.Disciplina;

public class MapeadorDisciplina {
	private static int ultimaId = 0;
    private final String filename = "disciplina.txt";
    private HashMap<Integer,Disciplina> cacheDisciplina;
    
    public MapeadorDisciplina(){
    	cacheDisciplina = new HashMap<>();
        load();
    }
    
    public Disciplina get(Integer id){
        return cacheDisciplina.get(id);
    }
    
    public void put(Disciplina disciplina){
        ultimaId++;
        disciplina.setId(ultimaId);
        cacheDisciplina.put(ultimaId, disciplina);
        persist();
    }

    public void persist(){
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheDisciplina);
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
        try{
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fin);
            this.cacheDisciplina = (HashMap<Integer,Disciplina>) oi.readObject();
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
