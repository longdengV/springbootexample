package com.example.bio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;
/**
 * 测试方法
 * @author yangtao__anxpp.com
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest("Application.class")
public class Test2 {
	//测试主方法
	public static void main(String[] args) throws InterruptedException {

	}

	@Test
	public void test1() throws InterruptedException {
		//运行服务器
		new Thread(new ServerBetter()).start();
		//避免客户端先于服务器启动前执行代码
		Thread.sleep(100);
		//运行客户端
		char operators[] = {'+','-','*','/'};
		Random random = new Random(System.currentTimeMillis());
		new Thread(new Runnable() {
			@SuppressWarnings("static-access")
			@Override
			public void run() {
				while(true){
					//随机产生算术表达式
					String expression = random.nextInt(10)+""+operators[random.nextInt(4)]+(random.nextInt(10)+1);
					Client.send(expression);
					try {
						Thread.currentThread().sleep(random.nextInt(1000));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
