package dev.luanfernandes.access.service;

import dev.luanfernandes.access.model.Workday;
import dev.luanfernandes.access.repository.WorkdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkdayService {


    WorkdayRepository workdayRepository;

    @Autowired
    public WorkdayService(WorkdayRepository workdayRepository) {
        this.workdayRepository = workdayRepository;
    }

    public Workday saveWorkday(Workday workday){
       return workdayRepository.save(workday);

    }

    public List<Workday> findAll() {
       return   workdayRepository.findAll();
    }

    public Optional<Workday> getById(Long idWorkday) {
        return workdayRepository.findById(idWorkday);
    }

    public Workday updateWorkday(Workday workday){
        return workdayRepository.save(workday);

    }

    public void deleteWorkday(Long idWorkday) {
        workdayRepository.deleteById(idWorkday);
    }
}
