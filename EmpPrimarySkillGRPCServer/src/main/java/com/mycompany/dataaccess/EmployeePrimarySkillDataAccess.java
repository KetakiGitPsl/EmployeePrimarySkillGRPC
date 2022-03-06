package com.mycompany.dataaccess;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mycompany.entity.EmpPrimarySkill;

public class EmployeePrimarySkillDataAccess {

	private static final EntityManagerFactory emf;

	/**
	 * Static block for creating EntityManagerFactory. The Persistence class looks for META-INF/persistence.xml in the classpath.
	 */
	static {
		emf = Persistence.createEntityManagerFactory("PrimarySkillPU");
	}

	/**
	 * Static method returning EntityManager.
	 * @return EntityManager
	 */
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}


	public static String getEmployeePrimarySkill(int empId) {

		EntityManager em = EmployeePrimarySkillDataAccess.getEntityManager();

		String pri = "NA";

		EmpPrimarySkill e = em.find(EmpPrimarySkill.class, empId);
		
		if(e!=null)
			pri = e.getPrimarySkill();

		return pri;

	}

}
