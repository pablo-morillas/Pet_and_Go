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

    public Usuario addUser(Usuario user){
        newSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        return user;
    }

    public Usuario GetUsuario(Integer pId){
        newSession();
        return  session.get(Usuario.class, pId);
    }

    public List<Usuario> GetUsuarios(){
        newSession();
        return session.createQuery("FROM Usuario").getResultList();
    }

}
