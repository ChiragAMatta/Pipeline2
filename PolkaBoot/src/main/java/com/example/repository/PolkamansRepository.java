package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Polkamans;

/*
 * the following interface declaration followed by the extension of
 * JpaRelpository is what allows Sprig Data to work its "magic"
 * note that in the generics, you put the model that is associated with the
 * repository,
 * followed by the datatype of the id
 */
public interface PolkamansRepository extends JpaRepository<Polkamans, Integer>{

	Polkamans findByName(String name);

}