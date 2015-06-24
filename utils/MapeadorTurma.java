package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import model.Turma;

public class MapeadorTurma {
	private static int ultimaId = 0;
    private final String filename = "turma.txt";
    private HashMap<Integer,Turma> cacheTurma;
    
    public MapeadorTurma(){
    	cacheTurma = new HashMap<>();
        load();
    }
    
    public Turma get(Integer id){
        return cacheTurma.get(id);
    }
    
    public void put(Turma turma){
        ultimaId++;
        turma.setId(ultimaId);
        cacheTurma.put(ultimaId, turma);
        persist();
    }

    public void persist(){
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheTurma);
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
            this.cacheTurma = (HashMap<Integer,Turma>) oi.readObject();
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
