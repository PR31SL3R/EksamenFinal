package com.preisler.eksamen;


import com.preisler.eksamen.service.CompanyService;
import com.preisler.eksamen.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternController {

    @Autowired
    private InternService internService;
    @Autowired
    private CompanyService companyService;

    @GetMapping("/getInterns")
    public ResponseEntity getAllInterns(){
        return ResponseEntity.ok(internService.findAll());
    }

}
