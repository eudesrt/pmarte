package com.br.marte.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.marte.api.model.Wstatus;
import com.br.marte.api.repository.WstatusRepository;

@RestController
@RequestMapping("/status")
public class Wstatusresource {
	
	@Autowired
	private WstatusRepository ws;
	
	@GetMapping
	public List<Wstatus> findAll(){
		
		return ws.findAll();
	}
	
	
	@PostMapping
	public Wstatus statusAdd(@Valid @RequestBody Wstatus status) {
		
		return ws.save(status);
	}
	
	
	

}
