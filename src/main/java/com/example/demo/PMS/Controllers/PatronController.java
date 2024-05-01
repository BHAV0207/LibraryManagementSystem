package com.example.demo.PMS.Controllers;

import com.example.demo.BMS.Models.Book;
import com.example.demo.PMS.Models.Patron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patrons")
public class PatronController {

    @Autowired
    private PatronService patronService;

    @GetMapping("/{id}")
    public ResponseEntity<Patron> getPatronById(@PathVariable Long id) {
        Patron patron = patronService.findById(id);
        if (patron != null) {
            return ResponseEntity.ok().body(patron);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public ResponseEntity<Patron> createPatron(@RequestBody Patron patron) {
        Patron createdPatron = patronService.create(patron);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatron);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patron> updatePatron(@PathVariable Long id, @RequestBody Patron patron) {
        Patron updatedPatron = patronService.update(id, patron);
        if (updatedPatron != null) {
            return ResponseEntity.ok().body(updatedPatron);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatron(@PathVariable Long id) {
        boolean deleted = patronService.delete(id);
        if (deleted) {
            return ResponseEntity.ok().body("Patron with ID " + id + " deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}/books")
    public ResponseEntity<List<Book>> getBooksBorrowedByPatron(@PathVariable Long id) {
        List<Book> books = patronService.getBooksBorrowedByPatron(id);
        return ResponseEntity.ok().body(books);
    }
}
