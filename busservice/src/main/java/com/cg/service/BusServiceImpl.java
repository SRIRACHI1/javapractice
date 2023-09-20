package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.ResourceNotFoundException;
import com.cg.model.Bus;
import com.cg.repository.BusRepository;
@Service
public class BusServiceImpl implements BusService {
	
	@Autowired
	private BusRepository busRepository;

	@Override
	public Bus saveBus(Bus bus) {
		return busRepository.save(bus);
	}

	@Override
	public Bus getBusById(int busId) {
Optional<Bus>  optionalBus = busRepository.findById(busId);
		
		if(optionalBus.isEmpty()) {
			throw new ResourceNotFoundException("Bus not existing with id: "+busId);
		}
		
		return optionalBus.get();
	}
	@Override
	public List<Bus> getAllBus() {
		return busRepository.findAll();
	}

	@Override
	public Bus updateBus(Bus bus) {
	
			Optional<Bus> optionalBus =  busRepository.findById(bus.getBusId());
			
			if(optionalBus.isEmpty()) {
				throw new ResourceNotFoundException("Bus Details Not found with id: "+bus.getBusId());
			}
			
			Bus updatedBus = busRepository.save(bus);
			
			return updatedBus;
		}

	@Override
	public void deleteBus(int busId) {
Optional<Bus>  optionalBus = busRepository.findById(busId);
		
		if(optionalBus.isEmpty()) {
			throw new ResourceNotFoundException("Flight not existing with id: "+busId);
		}
		
		busRepository.deleteById(busId);
		
		
	}

}
