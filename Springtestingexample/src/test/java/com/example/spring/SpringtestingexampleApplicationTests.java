package com.example.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringtestingexampleApplicationTests {

	Data d=new Data();
	@Test
	void contextLoads() {
	}
	
	@Test
	void addtest()
	{
		int expectedresult=18;
		
		int actual=d.add(10,5);
		
		assertThat(actual).isEqualTo(expectedresult);
	}
	@Test
	void comparetest()
	{
			
		boolean actual=d.compare(10,5);
		
		assertThat(actual).isTrue();
	}

}
