package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import model.Aluno;


public class MapeadorAluno
{
	private static int ultimaId = 0;
    private final String filename = "alunos.txt";
    private HashMap<Integer,Aluno> cacheAlunos;
    //cacheLivros.values(); para pegar valor do hashMap
    
    public MapeadorAluno(){
        cacheAlunos = new HashMap<>();
        load();
    }
    
    public Aluno get(Integer id){
        return cacheAlunos.get(id);
    }
    
    public void put(Aluno aluno){
        ultimaId++;
        aluno.setId(ultimaId);
        cacheAlunos.put(ultimaId, aluno);
        persist();
    }

    public void persist(){
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheAlunos);
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
            this.cacheAlunos = (HashMap<Integer,Aluno>) oi.readObject();
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
