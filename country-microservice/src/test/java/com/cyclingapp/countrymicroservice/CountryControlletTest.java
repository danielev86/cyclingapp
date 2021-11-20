package com.cyclingapp.countrymicroservice;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@ContextConfiguration(classes = CountryMicroserviceApplication.class)
public class CountryControlletTest {
	
	@Autowired
	private WebApplicationContext webCtx;
	
	private MockMvc mockMvc;
	
	@BeforeEach
	public void init() {
		mockMvc = MockMvcBuilders
				.webAppContextSetup(webCtx)
				.build();
	}
	
	@Test
	public void testAllCountries() throws Exception {
		mockMvc.perform(get("/api/country/countries"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(APPLICATION_JSON))
			.andDo(MockMvcResultHandlers.print());
	}
	
	@Test
	public void testFindCountryById() throws Exception{
		mockMvc
		.perform(MockMvcRequestBuilders.get("/api/country/1"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(APPLICATION_JSON))
		.andExpect(content().json("{id:1, countryCode: 'ITA' , countryName: 'Italy'}"))
		.andDo(MockMvcResultHandlers.print());
	}

}
