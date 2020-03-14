package hibernate.BD;

import Entities.Usuario;
import hibernate.Factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

public class UsuariosBD {

    private Session session;
    private static  SessionFactory sessionFactory;

    public UsuariosBD(){
        sessionFactory = new Factory().getSession(Usuario.class);
    }

    private void newSession(){
        if (session == null) session = sessionFactory.openSession();
    }

    public Usuario add(Usuario user){
        newSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        return user;
    }

    public void update(Usuario user){
        newSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();

    }

    public Usuario get(Integer pId){
        newSession();

        return session.get(Usuario.class, pId);
    }

    public List<Usuario> getAll(){
        newSession();
        return session.createQuery("FROM Usuario").getResultList();
    }

}
