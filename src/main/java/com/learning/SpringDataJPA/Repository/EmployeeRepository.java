package com.learning.SpringDataJPA.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.SpringDataJPA.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	/*
	 * public boolean saveRecord(Employee emp) {
	 * System.out.println("Here in Repo"); EntityManagerFactory entityManFactory
	 * = Persistence.createEntityManagerFactory("myDb");
	 * System.out.println("Factory created"); EntityManager entityManager =
	 * entityManFactory.createEntityManager();
	 * System.out.println("Manager created");
	 * entityManager.getTransaction().begin();
	 * System.out.println("Begin Transaction"); entityManager.persist(emp);
	 * System.out.println("Persists Transaction");
	 * entityManager.getTransaction().commit();
	 * System.out.println("Commit Transaction"); entityManager.close();
	 * System.out.println("Close Manager"); entityManFactory.close();
	 * System.out.println("Close Factory");
	 * 
	 * return true;
	 */

}
