package com.umam.khairul.perpustakaan.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.umam.khairul.perpustakaan.dao.BukuDao;
import com.umam.khairul.perpustakaan.dao.PenerbitDao;
import com.umam.khairul.perpustakaan.model.Buku;
import com.umam.khairul.perpustakaan.model.Penerbit;

@Controller
@RequestMapping("/buku")
public class BukuController {
	@Autowired BukuDao bd;
	@Autowired PenerbitDao pd;
	
	@RequestMapping(value ="/form", method=RequestMethod.GET)
	public String viewForm(@RequestParam(value="id", required=false) String id, Model mod) {
		List<String> list = new ArrayList<>();
		list.add("ahay");
		list.add("ahay2");
		list.add("ahay3");
			
		mod.addAttribute("mapPenerbit", pd.findAll());
		
		mod.addAttribute("buku",new Buku());
		if(null != id && !id.isEmpty()) {
			Buku buku = bd.findOne(id);
			if(null != buku) {
				mod.addAttribute("buku",buku);
			}
		}
		return "/buku/form-buku";
	}
	
	public Map<String, Object> getListPenerbit(){
		Map<String, Object> list = new HashMap<>();
		list.put("penerbits", pd.findAll());
		return list;
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String saveBuku(@Valid Buku buk,BindingResult errors) {
		if(!errors.hasErrors()) {
			bd.save(buk);
			System.out.println("sukses save==============");
		}
		
		return "/buku/form-buku";
	}
}
