package br.edu.ifpb.esperanca.pdp.adesp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.esperanca.pdp.adesp.models.ClassSchedule;

public interface ClassScheduleRespository extends JpaRepository<ClassSchedule, Integer> {
}
