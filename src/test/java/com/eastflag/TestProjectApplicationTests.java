package com.eastflag;

import com.eastflag.persistence.ApiMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestProjectApplication.class)
public class TestProjectApplicationTests {

	@Autowired
	private ApiMapper apiMapper;

	@Test
	public void () {
	}

}
