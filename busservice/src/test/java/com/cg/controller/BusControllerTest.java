package com.cg.controller;

	import static org.mockito.ArgumentMatchers.any;
	import static org.mockito.Mockito.times;
	import static org.mockito.Mockito.verify;
	import static org.mockito.Mockito.when;
	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

	import java.util.List;

	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.junit.jupiter.MockitoExtension;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.MediaType;
	import org.springframework.test.web.servlet.MockMvc;
	import org.springframework.test.web.servlet.setup.MockMvcBuilders;
	import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
	import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cg.model.Bus;
import com.cg.service.BusService;
import com.fasterxml.jackson.databind.ObjectMapper;
	@ExtendWith(MockitoExtension.class)
	public class BusControllerTest {

		@Autowired
		private MockMvc mockMvc;
		
		@Mock
		private BusService busService;
		private Bus bus;
		private List<Bus> busList;
		
		@InjectMocks
		private BusController BusCon;
		
		@BeforeEach
		public void setUp() {
			bus = new Bus(1,"First class","Pune","Mumbai",6000);
			mockMvc = MockMvcBuilders.standaloneSetup(BusCon).build();
		}
		@Test
		public void saveBusControllerTest() throws Exception{
			when(busService.saveBus(any())).thenReturn(bus);
			mockMvc.perform(post("/Bus/save")
					.contentType(MediaType.APPLICATION_JSON)
					.content(asJsonString(bus)))
			        .andExpect(status().isCreated());
			verify(busService, times(1)).saveBus(any());
		
		}
		@Test
		public void updateBusControllerTest() throws Exception{
			when(busService.updateBus(any())).thenReturn(bus);
			mockMvc.perform(put("/Bus/update")
					.contentType(MediaType.APPLICATION_JSON)
					.content(asJsonString(bus)))
			        .andExpect(status().isCreated());
			verify(busService, times(1)).updateBus(any());
		
		}
		@Test
		public void getAllBusControllerTest() throws Exception{
			when(busService.getAllBus()).thenReturn(busList);
			mockMvc.perform(MockMvcRequestBuilders.get("/Bus/all")
					.contentType(MediaType.APPLICATION_JSON)
					.content(asJsonString(bus)))
			        .andDo(MockMvcResultHandlers.print());
			verify(busService, times(1)).getAllBus();
		
		}
		@Test
	    public void getBusControllerTest() throws Exception {
	        when(busService.getBusById(bus.getBusId())).thenReturn(bus);
	        mockMvc.perform(MockMvcRequestBuilders.get("/Bus/1")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(asJsonString(bus)))
	                .andDo(MockMvcResultHandlers.print());
	        verify(busService, times(1)).getBusById(1);


	    }
		@Test
	    public void deleteBusControllerTest() throws Exception {

			busService.deleteBus(bus.getBusId());
	        mockMvc.perform(MockMvcRequestBuilders.delete("/Bus/delete/1",1)
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(asJsonString(bus)))
	                .andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	    }
		
		public static String asJsonString(final Object obj) {
		    try {
		        final ObjectMapper mapper = new ObjectMapper();
		        final String jsonContent = mapper.writeValueAsString(obj);
		        return jsonContent;
		    } catch (Exception e) {
		        throw new RuntimeException(e);
		    }
		}  
	}

