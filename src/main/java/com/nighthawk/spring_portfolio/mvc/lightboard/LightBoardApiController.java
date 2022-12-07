package com.nighthawk.spring_portfolio.mvc.lightboard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/api/lightboard")
public class LightBoardApiController {


    @GetMapping("/dimensions/{bRows}/{bCols}")
    public ResponseEntity<String> calculate(@PathVariable String expression) {
    
      LightBoard finalsolve = new LightBoard();

        
      String json = finalsolve.toString();


      return ResponseEntity.ok(json);  
    }

}

