package com.codingdojo.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoninja.models.Dojo;
import com.codingdojo.dojoninja.reposotories.DojoRepository;

@Service
public class DojoService {
		
		private final DojoRepository dojoRepository;
		
		public DojoService(DojoRepository dojoRepository) {
			this.dojoRepository = dojoRepository;
		}
		
		public List<Dojo> allDojos(){
			return dojoRepository.findAll();
		}
		
		public Dojo createDojo(Dojo dojo) {
			return dojoRepository.save(dojo);
		}
		
		public Dojo findDojo(Long id) {
			// Optional means the object can exist or not
			Optional<Dojo> optionalDojo = dojoRepository.findById(id);
			if(optionalDojo.isPresent()) {
				return optionalDojo.get();
			}else {
				return null;
			}
		}
		

}
