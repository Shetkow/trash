package org.example;

import java.util.List;

public class DrumPattern {
        private Integer id;
        private String patternType;
        private String patternName;
        private int notesPerBar;
        private int timeSignature;
        private List<NotesPattern> notesPatternList;

        public DrumPattern(Integer id, String patternName, int notesPerBar, int timeSignature, List<NotesPattern> notesPatternList) {
            this.id = id;
            this.patternType = InstrumentsType.Drums.toString();
            this.patternName = patternName;
            this.notesPerBar = notesPerBar;
            this.timeSignature = timeSignature;
            this.notesPatternList = notesPatternList;
        }


        public Integer getId() {
            return id;
        }


        public String getPatternType() {
            return patternType;
        }


        public String getPatternName() {
            return patternName;
        }


        public int getNotesPerBar() {
            return notesPerBar;
        }


        public int getTimeSignature() {
            return timeSignature;
        }


        public List<NotesPattern> getNotesPatternList() {
            return notesPatternList;
        }

    @Override
    public String toString() {
        return "DrumPattern{" +
                "id=" + id +
                ", patternType='" + patternType + '\'' +
                ", ptternName='" + patternName + '\'' +
                ", tactSize=" + notesPerBar +
                ", noteSizeInPattern=" + timeSignature +
                ", notesPatternList=" + notesPatternList +
                '}';
    }
}


