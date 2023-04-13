package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Project;
import com.example.demo.Service.ProjectService;

@RestController
public class ProjectController {
	
	
	@Autowired
	ProjectService projectService;
	
	@PostMapping("/project/add")
	public ResponseEntity<String> createProject(@RequestBody Project proReq){
		Project project = projectService.createProject(proReq);
		return ResponseEntity.status(200).body("Id is created"+project.getId());
	}
	@GetMapping("/project/list")
	public List<Project> getProject(){
		return projectService.getProject();
	}

}
