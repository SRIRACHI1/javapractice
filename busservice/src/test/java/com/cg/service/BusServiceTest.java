package com.cg.service;

	import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
	import static org.mockito.Mockito.times;
	import static org.mockito.Mockito.verify;
	import static org.mockito.Mockito.when;

	import java.util.ArrayList;
	import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.junit.jupiter.MockitoExtension;
	import org.springframework.boot.test.context.SpringBootTest;

import com.cg.exception.BusNotFoundException;
import com.cg.model.Bus;
import com.cg.repository.BusRepository;

	
	@SpringBootTest
	@ExtendWith(MockitoExtension.class)
	public class BusServiceTest {
		
		@Mock
		private BusRepository busRes;
		
		@InjectMocks
		private BusServiceImpl busServiceImpl;
		
	    @Test
	    public void TestssaveBus() throws BusNotFoundException{
	    	Bus b1 = new Bus(8,"First class","pune","hyd",7000);
	    	when(busServiceImpl.saveBus(any())).thenReturn(b1);
	    	busServiceImpl.saveBus(b1);
	    	verify(busRes,times(1)).save(any());
	    }
	    @Test
	    public void testGetAllFlights() {
	    	Bus b1 = new Bus(8,"First class","pune","hyd",7000);
	    	busRes.save(b1);
	    	Bus b2 = new Bus(9,"Premium class","Delhi","hyd",7000);
	    	busRes.save(b2);
	    	Bus b3 = new Bus(10,"Business class","pune","Chennai",7000);
	    	busRes.save(b3);
	    	List<Bus> busList = new ArrayList<>();
	    	busList.add(b1);
	    	busList.add(b2);
	    	busList.add(b3);
	    	
	    	when(busRes.findAll()).thenReturn(busList);
	    	List<Bus> busList1 = busServiceImpl.getAllBus();
	    	assertEquals(busList,busList1);
	    	verify(busRes,times(1)).save(b1);
	    	verify(busRes,times(1)).findAll();
	    }
	    @Test
		public void testGetBusById()
		{
			Bus bus = new Bus();
			bus.setBusId(101);
			bus.setBookingType("First class");
			bus.setSource("Pune");
			bus.setDestination("Mumbai");
			bus.setBookingPrice(2000);
			
			Optional<Bus> optionalpayment = Optional.of(bus);
			
			when(busRes.findById(101)).thenReturn(optionalpayment);
			
			Bus myBus = busServiceImpl.getBusById(101);
			
			assertEquals(2000,myBus.getBookingPrice());
			
		
		}
		
}
