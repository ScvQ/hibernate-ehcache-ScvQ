package cn.spiderpig.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestEhcache {
    
    @Test
    public void testEhcache(){
        
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session1 = sf.openSession();
        User user1 = session1.get(User.class, 1);
        System.out.println(user1.getName());
        
        Session session2 = sf.openSession();
        User user2 = session2.get(User.class, 1);
        System.out.println(user2.getName());
        
        session1.close();
        session2.close();
        sf.close();
        
    }

}
