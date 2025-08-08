package com.example.donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Required for VS Code Live Server
public class DonationController {

    @Autowired
    private DonorService donorService;

    @GetMapping
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }

    @GetMapping("/{id}")
    public Donor getById(@PathVariable Long id) {
        return donorService.getDonorById(id);
    }

    @PostMapping
    public Donor addDonor(@RequestBody Donor donor) {
        return donorService.addDonor(donor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        donorService.deleteDonor(id);
    }
}