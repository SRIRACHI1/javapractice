package com.cg.repository;
	
	import static org.junit.jupiter.api.Assertions.*;

	import java.util.List;

	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.test.context.junit.jupiter.SpringExtension;

    import com.cg.model.Bus;

	@ExtendWith(SpringExtension.class)
	@SpringBootTest
	public class BusRepositoryTest {
		
		@Autowired
		private BusRepository BusRepos;
		
		@Test
		public void giveBusShouldReturnBusObject() {
			
			Bus b1 = new Bus (1,"Sleeper","Delhi","Chennai",2000);
			BusRepos.save(b1);
			Bus b2 = BusRepos.findById(b1.getBusId()).get();
			assertNotNull(b2);
			assertEquals(b1.getBookingType(),b2.getBookingType());
		}

		@Test
		public void getAllMustReturnBus() {
			Bus b3 = new Bus(6,"Fisrt Class","Delhi","Chennai",2000);
			Bus b4 = new Bus(7,"Fisrt Class","Assam","Mumbai",2000);
			BusRepos.save(b3);
			BusRepos.save(b4);
			List<Bus> busList = (List<Bus>) BusRepos.findAll();
			assertEquals("Fisrt Class",busList.get(2).getBookingType());
			}
		
}
