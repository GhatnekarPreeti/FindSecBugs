package com.findsec.find;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.GetMapping;

public class SpringEntityLeak {

	@GetMapping("/sample/api")
    public SpringEntityLeak sampleMethod() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select c from SampleTable c");
        SpringEntityLeak entityObject = (SpringEntityLeak) query.getResultList().get(0);
        entityManager.persist(entityObject);
        return entityObject;
    }
}
