package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.LanguagesThreader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WelcomeMsgController {

    @GetMapping("/translation")
    public ResponseEntity<ArrayList<String>>getWelcomeMsgs() throws InterruptedException {
        ArrayList<String> msgs = new ArrayList<>();

        Thread enThreader = new Thread(new LanguagesThreader("translation_en_US", msgs));
        Thread frThreader = new Thread(new LanguagesThreader("translation_fr_CA", msgs));

        enThreader.start();
        frThreader.start();

        enThreader.join();
        frThreader.join();

        return ResponseEntity.ok(msgs);
    }
}
