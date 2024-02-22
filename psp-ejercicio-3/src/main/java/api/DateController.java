package api;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DateController {

    @GetMapping("/date")
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    @GetMapping("/date/{n}")
    public LocalDate getDatePlusDays(@PathVariable int n) {
        return LocalDate.now().plusDays(n);
    }

    @PostMapping("/date")
    public String updateSystemDate(@RequestBody Map<String, Integer> date) {

        int day = date.get("day");
        int month = date.get("month");
        int year = date.get("year");
        return "To update the system date to " + day + "-" + month + "-" + year + ", you would need system-level permissions.";
    }
}