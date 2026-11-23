
package ABROVIA;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/enquiries")
@CrossOrigin(origins = "*")
public class EnquiryController {

    private final EnquiryRepository repository;

    public EnquiryController(EnquiryRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Enquiry addEnquiry(@Valid @RequestBody Enquiry enquiry) {
        return repository.save(enquiry);
    }

    @GetMapping
    public List<Enquiry> getAllEnquiries() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteEnquiry(@PathVariable Long id) {

        if (!repository.existsById(id)) {
            return "Enquiry not found";
        }

        repository.deleteById(id);
        return "Enquiry deleted successfully";
    }
}
