package com.atguigu.financial.hetong;

import org.codehaus.groovy.antlr.treewalker.SourcePrinter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinancialHetongApplicationTests {

	@Test
	public void contextLoads() {
		long temp = (int)3.9;
		temp%=2;
		System.out.println("========================================"+temp);
	}

}
