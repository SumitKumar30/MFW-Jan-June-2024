package org.ncu.rest_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller {
	List<User> userList = new ArrayList<>();
	
	//	1. Get Request
	@GetMapping("/user/getdetails")  // REST endpoint for GET Request
	public List<User> getUserDetails(){
		return userList;
	}
	
	// 2. Post Request
	@PostMapping("/user/saveuser")    // REST endpoint for POST Request
	public String saveUserDetails(@RequestBody User user) {
		userList.add(user);
		return "user added : "+user;
	}
	
	// 3. Delete Request
	@DeleteMapping("/user/deleteuser/{id}")  // REST endpoint for DELETE Request
	public String deleteUserDetails(@PathVariable int id) {
		Iterator<User> iterator = userList.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getUserId() == id) {
				iterator.remove();
				return "user deleted: "+user;
			}
		}
		return "record not found!!";
	}
	
	// 4. Update Request
	@PutMapping("/updateuser/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User updatedUser) {
		Iterator<Person> iterator = userList.iterator();
	    while (iterator.hasNext()) {
	        User existingUser = iterator.next();
	        if (existingPerson.getUserId() == id) {
	            // Update the existing person's details
	            existingUser.setUserName(updatedPerson.getUserName());
	            existingUser.setUserAge(updatedPerson.getUserAge());
	            existingUser.setUserAddress(updatedPerson.getUserAddress());
	            // You can update other fields similarly

	            return "User updated: " + existingUser;
	        }
	    }
	    return "User with ID " + id + " not found";
	}
	
}
