package com.springBootApk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		ApplicationContext context =  
				SpringApplication.run(Application.class, args);

		
				
				
		// CRUD Operation 
/*
		UserRepository userRepo = context.getBean(UserRepository.class);
		//Create a new User and saved it.
		User user1 = new User();
		user1.setuName("JD");
		user1.setCity("Brampton");
		
		//saving a single User
		//User saveduser = userRepo.save(user);
		//System.out.println(saveduser);
		
		User user2 = new User();
		user2.setuName("DO");
		user2.setCity("India");
		
		//Save & Display Multiple Objects 
		List<User> userList = List.of(user1, user2);
		Iterable<User> userItr= userRepo.saveAll(userList);
		userItr.forEach(user->{
			System.out.println(user);
		});
		System.out.println(userItr);
		
		//Update the data
		Optional<User> optional = userRepo.findById(2);
		User updateUser = optional.get();
		updateUser.setuName("Second Name");
		userRepo.save(updateUser);
		System.out.println(updateUser);
		
		//Get User
		//with findById(); , findAll();
		Iterable<User> itr = userRepo.findAll();
		//Old Method Using Iterator Iterator
//		Iterator<User> iterator = itr.iterator();	
//		while(iterator.hasNext()) {
//			User findAllUser = iterator.next();
//			System.out.println(findAllUser);
//		}
		
		itr.forEach(user->{System.out.println(user);});

		
		//Deleting Use Element
		//userRepo.deleteById(4);
		//userRepo.delete(user1);
		
*/
	}
	@Bean 
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}