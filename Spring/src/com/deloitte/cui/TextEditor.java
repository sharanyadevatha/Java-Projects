package com.deloitte.cui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;

	public void getName() {
		System.out.println("name:" + name);
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditorCDI Constructor");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.CheckSpelling();
	}

	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	// a setter method for DI
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside TextEditorSDI setSpellChecker");
		this.spellChecker = spellChecker;
	}

	public TextEditor() {
		System.out.println("Inside TextEditorSDI Constructor");
	}

}