package org.example;

public class Notes2Pattern {
    private String notesType;
    private int[] offset;
    private String duration;
private Duration durationNote;
    public Notes2Pattern(String notesType, Duration durationNote) {
        this.notesType = notesType;

        this.duration = durationNote.getSignature() + " , " + durationNote.getCount();
    }

    public String getNotesType() {
        return notesType;
    }

    public int[] getOffset() {
        return offset;
    }

    public String getDuration() {
        return duration;
    }
}
