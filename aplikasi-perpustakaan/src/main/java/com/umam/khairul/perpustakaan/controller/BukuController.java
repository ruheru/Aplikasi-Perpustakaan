package com.umam.khairul.perpustakaan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/buku")
public class BukuController {

	@RequestMapping(value ="/form", method=RequestMethod.GET)
	public String viewForm(@RequestParam(value="id", required=false) String id, Model mod) {
		if(null != id && !id.isEmpty()) {
			
		}
		return "";
	}
}
