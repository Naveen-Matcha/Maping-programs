package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.State;

public interface StateService {

	State createState(State statede);

	List<State> getState();

	//State updateState(int id, State statede);

	//void deleteStateById(int id);

}
