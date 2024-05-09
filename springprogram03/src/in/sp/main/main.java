package in.sp.main;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.bean.bean;

public class main {
	public static void main(String args[])
	{
			String resource_file_path= "/in/sp/resource/applicationcontext.xml";
			ApplicationContext contex= new ClassPathXmlApplicationContext(resource_file_path);
			
			bean std= contex.getBean(bean.class);
			std.display();
			
			
	}
}
