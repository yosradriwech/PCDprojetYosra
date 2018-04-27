package com.PCDproject.PCDproject.CONTROLLER;

import com.PCDproject.PCDproject.MODEL.incident;
import com.PCDproject.PCDproject.MODEL.user;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/incident/{userId}")
public class IncidentRESTController {

    @PostMapping("{pseudo}")
        public ResponseEntity<incident> CreatIncident (@PathVariable String pseudo,@RequestBody incident incident){
        incident in = new incident();
        in.setType(incident.getType());
        in.setDateI(incident.getDateI());
        in.setLatitude(incident.getLatitude());
        in.setLongitude(incident.getLongitude());
        user user = new user();
        user.userRepository.findOne(pseudo);
        if (user.getRinking()>= 10 ) return new ResponseEntity<>(in,HttpStatus.ACCEPTED);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping
    public ResponseEntity<incident> updateIncidentConfig (@RequestBody incident incident){
        incident inc = new incident()
        inc.incidentRepository.findOne(incident.getId());
        inc.setConfirmation(incident.getConfirmation());
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
