package com.spboot.test;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
class ThisDate{
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	private Date date;
}
@RestController
@Slf4j
public class TimeController {

	
	@GetMapping("/date")
	public ThisDate getDate() {
		ThisDate td = new ThisDate();
		td.setDate(new Date());
		return td;
	}
}
