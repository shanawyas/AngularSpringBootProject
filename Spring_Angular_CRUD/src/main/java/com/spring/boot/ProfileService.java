package com.spring.boot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.nio.file.Paths;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class ProfileService {
@Autowired ProfileRepository pr;

public Profile getById(Long id) {
	return pr.findById(id).get();
}
public List<Profile> getAllProfile(){
	return pr.findAll();
}
public Profile save(Profile profile) {
	return pr.save(profile);
}
public void delete(Long id) {
	pr.deleteById(id);
}
public boolean saveFileToFolder(String userCode, MultipartFile file) {
	boolean flag = false;
	String name = file.getOriginalFilename();
	if(name.contains(".")) {
		int index = name.lastIndexOf(".");
		name = name.substring(index, name.length());
	}
	String URL =  "D:\\Angular\\BootAngular\\src\\assets\\images/" + userCode + name;
	

	
	try {
		
		Files.copy(file.getInputStream(), Paths.get(URL), StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Hello"+ URL);
		//System.out.println("image uploaded from this side");
		flag = true;
	}catch(IOException io) {
		System.out.println(io);
		flag = false;
	}
	
	return flag;
}

}
