package th.co.acmesys.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import th.co.acmesys.domain.Country;
import th.co.acmesys.domain.OrganizationGroup;
import th.co.acmesys.domain.Province;
import th.co.acmesys.utils.HibernateUtil;

public abstract class GenericDao {
	
	public static List<Country> getCountryList(){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = null;
		Transaction tx = null;
		
		try {
			session = sf.openSession();
			tx = session.beginTransaction();
			
			List<Country> countries = session.createQuery(
					"from Country")
					.list();
			
			tx.commit();
			return countries;
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			return null;
		} finally {
			session.clear();
			session.close();
		}
	}
	
	public static List<Province> getProvinceList(){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = null;
		Transaction tx = null;
		
		try {
			session = sf.openSession();
			tx = session.beginTransaction();
			
			List<Province> provinces = session.createQuery(
					"from Province")
					.list();
			
			tx.commit();
			return provinces;
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
			return null;
		} finally {
			session.clear();
			session.close();
		}
	}
}
