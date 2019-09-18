package com.cts.stockmarketcharting.*;
import org.junit.Before; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.mod.controller.AdminController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminControllerTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks
	private AdminController adminController;

	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(adminController).build();
	}
	@Test
	public void performanceTest() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/performanceTest"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Stress Testing the Server"));

}	@Test
	public void returnTest() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/logout"))
		.andExpect(MockMvcResultMatchers.status().isGone())
		.andExpect(MockMvcResultMatchers.content().string("You have been sucessfully logged out"));

}	@Test
	public void loginTest() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/login")
		.accept(MediaType.APPLICATION_JSON))
		;
		//.andExpect(MockMvcResultMatchers.status().isAccepted());

}
}
	/*@Test
	public void performanceFailTest() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/performanceTest"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Purposefully Failing"));*/


