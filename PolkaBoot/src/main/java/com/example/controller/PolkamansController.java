package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Polkamans;
import com.example.repository.PolkamansRepository;

//@RestController = @Controller + @ReponseBody
@RestController

//@RequestMapping when used above a class will append the indicated mapping to
//the url path
@RequestMapping("/polkamans")
public class PolkamansController {
	@Autowired
	private PolkamansRepository polkamansRepository;
	
	@GetMapping(value="/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping(value="/all")
	public List<Polkamans> findAll(){
		return polkamansRepository.findAll();
	}
	
	@GetMapping(value="/{name}")
	public Polkamans findByName(@PathVariable String name){
		return polkamansRepository.findByName(name);
	}
	
	@PostMapping(value="/load")
	public Polkamans load(@RequestBody Polkamans polkamans) {
		polkamansRepository.save(polkamans);
		return polkamansRepository.findByName(polkamans.getName());
	}
}
