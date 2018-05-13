package com.umam.khairul.perpustakaan.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.umam.khairul.perpustakaan.model.Buku;

public interface BukuDao extends PagingAndSortingRepository<Buku, String>{

	
}
