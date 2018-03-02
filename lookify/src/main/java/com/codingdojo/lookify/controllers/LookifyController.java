package com.codingdojo.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.services.SongService;


@Controller
public class LookifyController {
		
	
	private final SongService songService;
	
	public LookifyController(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String root(Model model) {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(@Valid @ModelAttribute("song") Song song, BindingResult result, Model model) {
		@SuppressWarnings("unused")
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songService.allSongs());
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		return "add.jsp";
	}
	
	@PostMapping("/songs/new")
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "add.jsp";
		}else {
			songService.addSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/songs/{id}")
	public String findSongByIndex(Model model, @PathVariable("id") Long id) {
		Song song = songService.findSongById(id);
		model.addAttribute("song", song);
		model.addAttribute("id", id);
		return "display.jsp";
	}
	
	@RequestMapping("/songs/topTen")
	public String topTen(Model model) {
		List<Song> songs = songService.topTen();
		model.addAttribute("songs", songs);
		return "topten.jsp";
	}
	
	@RequestMapping("/search/{artist}")
	public String byArtist(Model model, @PathVariable("artist") String artist, @Valid @ModelAttribute("song") Song song, BindingResult result) {
		List<Song> songs = songService.findByArtist(artist);
		model.addAttribute("songs", songs);
		return "song.jsp";
	}
	
	@PostMapping("/search")
	public String Artist(@Valid @ModelAttribute("song") Song song, BindingResult result, Model model, @RequestParam("artist") String artist) {
		if(result.hasErrors()) {
			return "redirect:/dashboard";
		}else {
			return "redirect:/search/" + artist;
		}
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteSong(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}


	
}
