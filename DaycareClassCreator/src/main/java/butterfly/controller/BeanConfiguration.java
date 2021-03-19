/**@author wuebk - Tyler Wuebker
 * Class : CIS175 Spring 2021
 * Mar 18, 2021
 */
package butterfly.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import butterfly.beans.Classroom;

/**
 * @author wuebk
 *
 */
@Configuration
public class BeanConfiguration {

	
	@Bean
	public Classroom classroom() {
		Classroom bean = new Classroom("Adeline");
		bean.setName("Adeline Wuebker");
		bean.setParentsName("Tyler Wuebker, Katelyn Wuebker");
		bean.setAgeMonths(19);
		return bean;
	}
}
