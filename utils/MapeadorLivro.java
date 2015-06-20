package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import model.Livro;

public class MapeadorLivro
{
	private static int ultimaId = 0;
    private final String filename = "livros.txt";
    private HashMap<Integer,Livro> cacheLivros;

    
    public MapeadorLivro(){
        cacheLivros = new HashMap<>();
        load();
    }
    
    public Livro get(Integer id){
        return cacheLivros.get(id);
    }
    
    public void put(Livro livro){
        ultimaId++;
        livro.setId(ultimaId);
        cacheLivros.put(ultimaId, livro);
        persist();
    }

<<<<<<< HEAD
=======
	private static int ultimaId = 0;
    private final String filename = "revistas.txt";
    private HashMap<Integer,Livro> cacheRevista;
    //cacheLivros.values(); para pegar valor do hashMap
    
    public MapeadorLivro(){
        cacheRevista = new HashMap<>();
        load();
    }
    
    public Livro get(Integer id){
        return cacheRevista.get(id);
    }
    
    public void put(Livro revista){
        ultimaId++;
        revista.setId(ultimaId);
        cacheRevista.put(ultimaId, revista);
        persist();
    }

>>>>>>> primeiras mudancas
    public void persist(){
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fout);
<<<<<<< HEAD
            oo.writeObject(cacheLivros);
=======
            oo.writeObject(cacheRevista);
>>>>>>> primeiras mudancas
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
<<<<<<< HEAD
    
=======
>>>>>>> primeiras mudancas
    public void load(){
        try{
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fin);
<<<<<<< HEAD
            this.cacheLivros = (HashMap<Integer,Livro>) oi.readObject();
            oi.close();
            fin.close();
            oi = null;
            fin = null;
=======
            this.cacheRevista = (HashMap<Integer,Livro>) oi.readObject();
            oi.close();
            fin.close();
            oi = null;
            fin = null;;
>>>>>>> primeiras mudancas
        }catch(ClassNotFoundException ex){
            System.out.print("Não pode!");
        } catch(FileNotFoundException ex){
            System.out.print("Ser a mesma!");
        } catch(IOException ex){
            System.out.print("PALAVRA!");
        }
    }
}
