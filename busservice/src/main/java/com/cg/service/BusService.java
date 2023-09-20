package com.cg.service;

import java.util.List;

import com.cg.model.Bus;

public interface BusService {
	
	    Bus saveBus(Bus bus);
	
	    Bus getBusById(int busId);
		
		List<Bus> getAllBus();
		
		public Bus updateBus(Bus bus);
		
		public void deleteBus(int busId);

}
