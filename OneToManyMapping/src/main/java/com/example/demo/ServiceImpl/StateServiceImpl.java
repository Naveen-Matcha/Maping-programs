package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.State;
import com.example.demo.Repository.StateRepository;
import com.example.demo.Service.StateService;

@Service
public class StateServiceImpl implements StateService {
	
	@Autowired
	StateRepository stateRepository;

	@Override
	public State createState(State statede) {
		// TODO Auto-generated method stub
		return stateRepository.save(statede);
	}

	@Override
	public List<State> getState() {
		// TODO Auto-generated method stub
		return stateRepository.findAll();
	}

	/*
	 * @Override public State updateState(int id, State statede) { // TODO
	 * Auto-generated method stub State str = staterepository.getById(id);
	 * statede.setId(statede.getId()); statede.setStatename(statede.getStatename());
	 * statede.setStatecode(statede.getStatecode()); return
	 * staterepository.save(statede) ; }
	 */

	/*
	 * @Override public void deleteStateById(int id) { // TODO Auto-generated method
	 * stub staterepository.deleteById(id); }
	 */
}
