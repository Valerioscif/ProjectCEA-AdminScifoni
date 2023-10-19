package it.dedagroup.project_cea.repository;

import java.util.List;

import it.dedagroup.project_cea.model.TypeOfIntervention;
import org.springframework.data.jpa.repository.JpaRepository;

import it.dedagroup.project_cea.model.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {
	public List<Intervention> findAllByTechnician_Id(long idTechnician);
	public List<Intervention> findAllByType(TypeOfIntervention type);
}
