package net.mv.week3.flashcardapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static HibernateUtil util;
	private SessionFactory sf;

	/*
	 * Builds SessionFactory when HibernateUtil is instantiated
	 */
	private HibernateUtil() {
		Configuration cfg = new Configuration()
				.configure("net/mv/week3/flashcardapp/resources/flashcardapp.cfg.xml");
		sf = cfg.buildSessionFactory();
	}

	public static HibernateUtil getUtil() {
		if (util == null) {
			util = new HibernateUtil();
		}
		return util;
	}

	public SessionFactory getSF() {
		return sf;
	}
}