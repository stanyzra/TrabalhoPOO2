/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author aleix
 */
public class GenericDAO<E> {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public GenericDAO() {
        this.emf = Persistence.createEntityManagerFactory("trabalho2PU");
        this.em = emf.createEntityManager();
    }
    
    public E salvar(E entidade){
        
        try{                                                 
            em.getTransaction().begin();                 
            em.persist(entidade);                          
            em.getTransaction().commit();                
        }catch(Exception e){           
            em.getTransaction().rollback();               
            e.printStackTrace();        
        }finally{                       
            em.close();          
        }
        return entidade;                 
    }
    
    //método para alterar e retornar a Entidade alterada
    public E alterar(E entidade){
        try{       
            em.getTransaction().begin();
            entidade = em.merge(entidade);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally{
            em.close();
        }                                    
        return entidade;
    }
    
    //método para excluir uma Entidade 
    public boolean excluir(int id, Class c){
        try{                                                //tente
            em.getTransaction().begin();                                      //inicia transação    
            em.remove(em.find(c,id));             //exclui a entidade a ser salva
            em.getTransaction().commit();                                     //confirma a transação
            return true;                                    //retorna verdadeiro (significa que deu certo!)
        }catch(Exception e){                                //captura o erro caso ocorra
            em.getTransaction().rollback();                                   //descarta transação
            e.printStackTrace();                            //imprime o erro
            return false;                                   //retorna falso (significa que deu errado!)
        }finally{                                           //no final faça
            em.close();                                //fecha o Gerenciador de Entidades
        }                                                   
    }
    
    //método para buscar uma Entidade que possua o id passado pelo parâmetro (retorna somente uma Entidade)
    public E consultar(int id, Class c){
        
        try{                                                            //tente            
            return (E) em.find(c,id);                       //busca a Entidade com o id passado pelo parâmetro                                           //retorna a Entidade 
        }catch(Exception e){                                            //captura o erro caso ocorra
            e.printStackTrace();                                        //imprime o erro
            return null;                                                //retorna nulo (não deu certo ou não foi encontrada!)
        }finally{                                                       //no final faça
            em.close();                                            //fecha o Gerenciador de Entidades
        }
    }
    
    //método que busca todas as Ent idades 
    public List<E> consultar(Class c){
        try{                                                                            //tente
            em.getTransaction();
            List<E> entidades = em.createQuery("SELECT a FROM "+c.getSimpleName()+" a").getResultList();
            return entidades;                                                             //busca todas as Entidades e transforma em uma List
        }catch(Exception e){                                                            //captura o erro caso ocorra
            e.printStackTrace();                                                        //imprime o erro
            return null;                                                                //retorna nulo (não deu certo ou não foi encontrada!)
        }finally{                                                                       //no final faça
            em.close();                                                            //fecha o Gerenciador de Entidades
        }
    }

    
    //método que busca todas as Entidades com like
    public List<E> consultar(Class c, String p){
        try{                                       
            Query query = em.createQuery("from "+c.getSimpleName()+" e where e.nome like :nomeParam");
            return query.setParameter("nomeParam","%"+ p + "%").getResultList();  
        }catch(Exception e){                                                            
            e.printStackTrace();                                                       
            return null;                                                                
        }finally{                                                                       
            em.close();                                                            
        }
    }
}


