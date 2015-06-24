package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import model.Professor;

public class MapeadorProfessor
{
	private static int ultimaId = 0;
    private final String filename = "professor.txt";
    private HashMap<Integer,Professor> cacheProfessor;
    
    public MapeadorProfessor(){
        cacheProfessor = new HashMap<>();
        load();
    }
    
    public Professor get(Integer id){
        return cacheProfessor.get(id);
    }
    
    public void put(Professor professor){
        ultimaId++;
        professor.setId(ultimaId);
        cacheProfessor.put(ultimaId, professor);
        persist();
    }

    public void persist(){
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheProfessor);
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
            this.cacheProfessor = (HashMap<Integer,Professor>) oi.readObject();
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
