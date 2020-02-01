package com.workshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User andrew = new User("1", "Andrew", "andrew@gmail.com");
		User patrick = new User("2", "Patrick", "patrik@gmail.com");

		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(andrew, patrick));
		return ResponseEntity.ok().body(list);
	}
}
