package com.example.winVote;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://winevotefrontend.onrender.com")
public class MyController {

    @GetMapping("/wine")
    public List<WineEntry> greeting() {
        WineEntry entry = new WineEntry("Wine Vote!", "Post which wine you would like to try today! Users then will vote on it.", false, "Rotwein oder Weißwein", "Scanner?");
/*        WineEntry entry1 = new WineEntry("Test1", "Test", false);
        WineEntry entry2 = new WineEntry("Test2", "Test", false);
        WineEntry entry3 = new WineEntry("Test3", "Test", false);
        WineEntry entry4 = new WineEntry("Test4", "Test", false);*/
        return List.of(entry/*, entry1, entry2, entry3, entry4*/);
    }

}
