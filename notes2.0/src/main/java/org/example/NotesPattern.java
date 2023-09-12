package org.example;

import java.util.List;

public class NotesPattern {
    private String notesType;
    private List<Integer> offset;
   private int duration;

    public NotesPattern(String notesType, List<Integer> offset, int duration) {
        this.notesType = notesType;
        this.offset = offset;
        this.duration = duration;
    }

    public String getNotesType() {
        return notesType;
    }

    public List<Integer> getOffset() {
        return offset;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "NotesPattern{" +
                "notesType='" + notesType + '\'' +
                ", offset=" + offset +
                ", duration=" + duration +
                '}';
    }
}
