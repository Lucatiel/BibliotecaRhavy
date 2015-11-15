package br.edu.ifpb;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;


public class VolumeDao {
	
	public List<Volume> listaTudo(){
		Session session = HibernateUtil.getSessionFactory().openSession();
	    Criteria c = session.createCriteria(Volume.class);  
	    return c.list();   
}

}
