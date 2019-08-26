package com.bootcamp.ujianwebservice.UjianWeb;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.ujianwebservice.controller.Controller;
import com.bootcamp.ujianwebservice.model.Group;
import com.bootcamp.ujianwebservice.model.User;

@RestController
public class ServiceController {

	@GetMapping(path = "hello-world")
	public void HelloGroup() {

	}

	@GetMapping(path = "absensi/group/all")
	public List<Group> getAllGroup() {
		return Controller.getInstance().getAllGroup();
	}

	@GetMapping(path = "absensi/user")
	public List<User> getAllUser() {
		return Controller.getInstance().getAllUser();
	}

}
