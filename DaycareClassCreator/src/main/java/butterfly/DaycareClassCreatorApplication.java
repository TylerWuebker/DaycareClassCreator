package butterfly;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import butterfly.beans.Classroom;
import butterfly.controller.BeanConfiguration;
import butterfly.repository.ClassroomRepository;

@SpringBootApplication
public class DaycareClassCreatorApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DaycareClassCreatorApplication.class, args);
	}
	
	ClassroomRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			
			/*Classroom c = appContext.getBean("classroom", Classroom.class);
			c.setParentsName("Tyler Wuebker");
			c.setName("Adenline Amy Wuebker");
			c.setAgeMonths(20);
			System.out.println(c.toString());
			repo.save(c);*/
			
			Classroom d = new Classroom("Aden Johnson", "Bob Johnson, Alice Johnson", 14);
			System.out.println(d.toString());
			repo.save(d);
			
			List<Classroom> allKids = repo.findAll();
			for(Classroom cl : allKids) {
			System.out.println(cl.toString());
			}
			((AbstractApplicationContext) appContext).close();
	}
}


