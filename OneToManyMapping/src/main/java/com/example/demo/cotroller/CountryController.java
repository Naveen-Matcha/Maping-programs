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

import com.example.demo.Entity.Country;
import com.example.demo.Service.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;

	@RequestMapping("/Country")
	public String des() {
		return "State";
	}
	 @PostMapping("/Country/add") 
	  public ResponseEntity<String>createCountry(@RequestBody Country countryde){
		  Country country =countryService.createCountry(countryde); 
		  return ResponseEntity.status(200).body("sucessfully id is created "+country.getcid());
	   }
	  @GetMapping("/Country/list")
	  public List<Country> getCountry(){
		  return countryService.getCountry();
	  }

		/*
		 * @PutMapping("/Country/edit/{id}") public ResponseEntity<String>
		 * updateCountry(@PathVariable int id, @RequestBody Country countryde){ Country
		 * country = countryservice.updateCountry(id,countryde); return
		 * ResponseEntity.status(200).body("successfully id is updated "+country.getCid(
		 * )); }
		 */
		/*
		 * @DeleteMapping("/Country/delete/{id}") public ResponseEntity<String>
		 * deleteCountry(@PathVariable int id){ countryservice.deleteCountryById(id);
		 * return ResponseEntity.status(200).body("successfully id is deleted");
		 * 
		 * }
		 */
	  
	 
}
