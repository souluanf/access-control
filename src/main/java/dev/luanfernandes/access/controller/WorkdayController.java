package dev.luanfernandes.access.controller;

import dev.luanfernandes.access.model.Workday;
import dev.luanfernandes.access.service.WorkdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workday")
public class WorkdayController {

    WorkdayService workdayService;

    @Autowired
    public void WorkdayService(WorkdayService workdayService) {
        this.workdayService = workdayService;
    }

    @PostMapping
    public Workday createJornada(@RequestBody Workday workday){
        return workdayService.saveWorkday(workday);
    }

    @GetMapping
    public List<Workday> getJornadaList(){
        return workdayService.findAll();

    }

    @GetMapping("/{idWorkday}")
    public ResponseEntity<Workday>  getWorkdayByID(@PathVariable("idWorkday") Long idWorkday) {
        return  ResponseEntity.ok(workdayService.getById(idWorkday).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Workday updateWorkday(@RequestBody Workday workday){
        return workdayService.updateWorkday(workday);
    }

    @DeleteMapping("/{idWorkday}")
    public ResponseEntity deleteByID(@PathVariable("idWorkday") Long idWorkday) throws Exception {
       try {
           workdayService.deleteWorkday(idWorkday);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return (ResponseEntity<Workday>) ResponseEntity.ok();

    }



}
