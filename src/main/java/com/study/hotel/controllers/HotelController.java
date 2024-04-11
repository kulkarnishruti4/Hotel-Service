package com.study.hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.hotel.Service.HotelService;
import com.study.hotel.entity.Hotel;
import java.util.*;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	HotelService service;
	
	@PostMapping("/create")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
		
		Hotel response = service.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
		
	}
	
	@GetMapping("/findAllHotels")
	public ResponseEntity<List<Hotel>> findAllHotels(){
		
		List<Hotel> list = service.getAllHotel();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/findHotelById")
	public ResponseEntity<Hotel> getMethodName(@RequestParam String hotelId) {
		return ResponseEntity.ok(service.getHotelById(hotelId));
		
	}
	
	

}
