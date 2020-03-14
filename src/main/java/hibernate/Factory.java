package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class Factory {

    public static SessionFactory getSession(Class TipoEntity){
        File F = new HibernateConfig().getConfigFile();
        return new Configuration().configure(F).addAnnotatedClass(TipoEntity).buildSessionFactory();
    }

}
