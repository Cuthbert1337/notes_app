package org.waschke.notes_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.waschke.notes_app.entity.Notes;
import org.waschke.notes_app.repository.NotesRepository;

@Controller
@RequestMapping("/notes")
public class NotesController {
	@Autowired
	private NotesRepository notesRepository;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Notes>getAllNotes(){
		return notesRepository.findAll();
	}

}
