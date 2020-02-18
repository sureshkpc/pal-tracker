package io.pivotal.pal.tracker;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("time-entries")
public class TimeEntryController {


    private TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepo) {
        timeEntryRepository = timeEntryRepo;
    }

    @PostMapping
    public ResponseEntity<TimeEntry> create(@RequestBody TimeEntry timeEntryToCreate) {

        TimeEntry entry = timeEntryRepository.create(timeEntryToCreate);
        return new ResponseEntity<>(entry,HttpStatus.CREATED);

    }

    @GetMapping("{id}")
    public ResponseEntity<io.pivotal.pal.tracker.TimeEntry> read(@PathVariable long id) {
        TimeEntry timeEntry = timeEntryRepository.find(id);
        if(timeEntry== null){
            return new ResponseEntity<>(timeEntry,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(timeEntry,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<io.pivotal.pal.tracker.TimeEntry>> list() {
        List<TimeEntry> entry = timeEntryRepository.list();
        return new ResponseEntity<>(entry,HttpStatus.OK);
    }
    @PutMapping("{timeEntryId}")
    public ResponseEntity update( @PathVariable Long timeEntryId, @RequestBody  TimeEntry timeEntry) {
        TimeEntry timeEntry1 = timeEntryRepository.update(timeEntryId,timeEntry);
        if(timeEntry== null){
            return new ResponseEntity<>(timeEntry,HttpStatus.NOT_FOUND);
        }
        else
        return new ResponseEntity<>(timeEntry1,HttpStatus.OK);
    }
    @DeleteMapping("{timeEntryId}")
    public ResponseEntity delete(@PathVariable Long timeEntryId) {
         timeEntryRepository.delete(timeEntryId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
