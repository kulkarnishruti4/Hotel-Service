package com.study.hotel.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.hotel.Dto.HotelDto;
import com.study.hotel.Service.HotelService;
import com.study.hotel.entity.Hotel;
import com.study.hotel.exception.ResourceNotFoundException;
import com.study.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepo;

	@Override
	public Hotel saveHotel(HotelDto hotelDto) {
		Hotel hotel = new Hotel(hotelDto.getHotelName(), hotelDto.getLocation(), hotelDto.getAbout(), hotelDto.getRatingId());
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotelById(Long id) {
		return hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel not found!"));
	}

	@Override
	public Hotel getHotelByRatingId(Long ratingId) {
		return hotelRepo.findByRatingId(ratingId);
	}

}
