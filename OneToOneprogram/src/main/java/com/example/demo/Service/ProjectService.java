package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Project;

@Service
public interface ProjectService {

	

	List<Project> getProject();

	Project createProject(Project proReq);

}
