package com.cyclingapp.cyclingservice;

import static org.springframework.http.MediaType.APPLICATION_JSON;
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
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@ContextConfiguration(classes = {CyclingServiceApplication.class})
public class DivisionControllerTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webCtx;
	
	@BeforeEach
	public void init() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webCtx).build();
	}
	
	@Test
	public void testAllDivisionsOk() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/api/division/"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(APPLICATION_JSON))
		.andDo(MockMvcResultHandlers.print());
	}
}
