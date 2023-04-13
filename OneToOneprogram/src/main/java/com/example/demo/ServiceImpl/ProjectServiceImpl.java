package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Project;
import com.example.demo.Repository.ProjectRepository;
import com.example.demo.Service.ProjectService;


@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;

	
	
	

	@Override
	public List<Project> getProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}





	@Override
	public Project createProject(Project proReq) {
		// TODO Auto-generated method stub
		return projectRepository.save(proReq);
	}

}
