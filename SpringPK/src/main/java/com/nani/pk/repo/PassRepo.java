package com.nani.pk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nani.pk.entity.Person;
import com.nani.pk.entity.PersonPk;

@Repository
public interface PassRepo extends JpaRepository<Person, PersonPk> {
	

}
