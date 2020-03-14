package hibernate;

import java.io.File;

public class HibernateConfig{
    static File F;
    public HibernateConfig(){
        if (F == null) F  = new File("src\\hibernate.cfg.xml");
    }
    public static File getConfigFile() {
        return F;
    }
}
