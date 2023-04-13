package com.example.demo.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.State;
import com.example.demo.Service.StateService;

@RestController
public class StateController {
	
	@Autowired
	StateService satateService;
	@RequestMapping("/State")
	public String str() {
		return "country";
	}
	@PostMapping("/State/add")
	public ResponseEntity<String> createState(@RequestBody State statede){
		State state = satateService.createState(statede);
		return ResponseEntity.status(200).body("successfully id is created"+state.getId());
	}
	@GetMapping("/State/list")
	public List<State> getState(){
		return satateService.getState();
		
	}

	/*
	 * @PutMapping("/State/edit/{id}") public ResponseEntity<String>
	 * updateState(@PathVariable int id, @RequestBody State statede){ State state =
	 * satateservice.updateState(id,statede); return
	 * ResponseEntity.status(200).body("successfully id is updated"+state.getId());
	 * }
	 */
	/*
	 * @DeleteMapping("/State/delete/{id}") public ResponseEntity<String>
	 * deleteState(@PathVariable int id){ satateservice.deleteStateById(id); return
	 * ResponseEntity.status(200).body("successfully id deleted");
	 * 
	 * }
	 */

}
