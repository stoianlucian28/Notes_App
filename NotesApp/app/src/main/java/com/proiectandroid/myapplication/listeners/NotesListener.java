package com.proiectandroid.myapplication.listeners;

import com.proiectandroid.myapplication.entities.Note;

public interface NotesListener {

    void onNoteClicked(Note note, int position);
}
