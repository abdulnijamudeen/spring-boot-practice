package com.nizam.springbootpractice;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import com.nizam.springbootpractice.entity.Role;
import com.nizam.springbootpractice.entity.User;
import com.nizam.springbootpractice.service.user.UserService;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringBootPracticeApplication {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}

	@PostConstruct
	public void insertDbData() {

		User user = User.builder().name("Mohideen").email("nizam@gmail.com").mobile("123654789")
				.roles(Arrays.asList(
					Role.builder().name("ROLE_ADMIN").build(),
					Role.builder().name("ROLE_USER").build()
					)).build();
		userService.save(user);
	}

}
