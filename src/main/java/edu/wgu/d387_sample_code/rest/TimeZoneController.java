package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.LanguagesThreader;
import edu.wgu.d387_sample_code.TimeZoneConvertor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.TimeZone;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TimeZoneController {

    @GetMapping("/times")
    public ResponseEntity<ArrayList<String>>getTimeZones() throws InterruptedException {

        TimeZoneConvertor timeZoneConvertor = new TimeZoneConvertor();

        ArrayList<String> times = timeZoneConvertor.convertTimeZones();

        return ResponseEntity.ok(times);
    }
}
