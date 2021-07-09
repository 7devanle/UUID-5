package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UUIDController {
	
	@Autowired 
	UuidRepo repo;
	
//	generate uuid and print existing ones
	@RequestMapping("")
	@ResponseBody
	public List<UUIDClass> list(@RequestParam()UUIDClass uuid) {
		uuid = new UUIDClass();
		repo.save(uuid);
		return repo.findAll();
	}
	
//	get existing UUIDs and time in list format
	@RequestMapping("uuids")
	@ResponseBody
	public List<UUIDClass> listOfUuids() {
		return repo.findAll();
	}
	
//	get single uuid and time
	@RequestMapping("uuids/{uuid}")
	@ResponseBody
	public Optional<UUIDClass> listOfUuids(@PathVariable("uuid") UUID uuid) {
		return repo.findById(uuid);
	}
	
//	create a uuid
	@PostMapping("/createuuid")
	public UUIDClass creatUuid(@RequestBody UUIDClass uuid) {
		repo.save(uuid);
		return uuid;
	}
//	delele a uuid
	@DeleteMapping("/deleteuuid/{uuid}")
	public UUIDClass deleteuuid(@PathVariable("uuid") UUID uuid) {
		UUIDClass uuuid = repo.getById(uuid);
		repo.delete(uuuid);
		return uuuid;
	}
	
//	update uuid
	@PutMapping(path= "/updateuuid", consumes= {"application/json"})
	public UUIDClass updateuuid(@RequestBody UUIDClass uuid) {
		repo.save(uuid);
		return uuid;
	}
	
}
