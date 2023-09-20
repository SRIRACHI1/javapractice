package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Bus;
import com.cg.service.BusService;
    @EnableEurekaClient
	@RestController
	@RequestMapping("/Bus")
	public class BusController {

		@Autowired
		private BusService busService;
		
		@PostMapping("/save")
		public ResponseEntity<Bus> addPolicy(@RequestBody Bus bus) {
			
			Bus newBus = busService.saveBus(bus);	
			ResponseEntity<Bus> responseEntity = new ResponseEntity<>(newBus,HttpStatus.CREATED);		
			return responseEntity;
		}
		
		@GetMapping("/{busId}")
		public ResponseEntity<Bus> fetchBus(@PathVariable("busId") int busId) {
			
			Bus bus = busService.getBusById(busId);
			ResponseEntity<Bus> responseEntity = new ResponseEntity<>(bus,HttpStatus.OK);		
			return responseEntity;
		}
		
		@GetMapping("/all")
		public List<Bus> fetchAllBus() {
			
			List<Bus> busList = busService.getAllBus();	
			return busList;
		}
		@DeleteMapping("/delete/{busId}")
	public ResponseEntity<String> removeFlight(@PathVariable("busId") int busId) {
			
			busService.deleteBus(busId);
			ResponseEntity<String> responseEntity = new ResponseEntity<>("Bus deleted successfully",HttpStatus.OK);		
			return responseEntity;
		}
		@PutMapping("/update")
		public ResponseEntity<Bus> modifyBus(@RequestBody Bus bus) {
			
			Bus updatedBus= busService.updateBus(bus);	
			ResponseEntity<Bus> responseEntity = new ResponseEntity<>(bus,HttpStatus.CREATED);
			return responseEntity;
		}
	}

