package com.codingdojo.lookify.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;

@Service
public class SongService {
	
	
	private SongRepository songRepository;
	
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	
	public void addSong(Song song) {
		songRepository.save(song);
	}
	
	public List<Song> allSongs(){
		return (List<Song>) songRepository.findAll();
	}
	
	public Song findSongById(Long id) {
		return songRepository.findOne(id);
	}
	
	public void updateSong(Song song) {
		songRepository.save(song);
	}
	
	public void deleteSong(Long id) {
		songRepository.delete(id);
		
	}
	public List<Song> findByArtist(String search){
		return (List<Song>) songRepository.findByArtistContaining(search);
	}
	
	public List<Song> topTen(){
		List<Song> topTen = new ArrayList<Song>();
		topTen = songRepository.findTop10ByOrderByRatingDesc();
		return topTen;
	}
	
	
	
}
