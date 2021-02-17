package com.preisler.eksamen;


import com.preisler.eksamen.model.Intern;
import com.preisler.eksamen.service.CompanyService;
import com.preisler.eksamen.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InternController {


    @Autowired
    private InternService internService;

    @GetMapping("/interns")
    public List<Intern> getAllInterns(){
        return internService.findAll();

    }

}
