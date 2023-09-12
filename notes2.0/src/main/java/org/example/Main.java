package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        NotesPattern notesPattern = new NotesPattern("Tom1", new ArrayList<>(Arrays.asList(1, 2)), 2);
        DrumPattern drumPattern = new DrumPattern(0, "Drum", 2, 2, new ArrayList<>(Arrays.asList(notesPattern)));
        System.out.println(drumPattern);
       Notes2Pattern notes2Pattern = new Notes2Pattern("Tom1",Duration.quater);

        ObjectMapper mapper = new ObjectMapper();
        try {
          mapper.writeValue(new File("duration.json"),notes2Pattern);
            mapper.writeValue(new File("drum.json"), drumPattern);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        System.out.println(InstrumentsType.Drums);


    }

}