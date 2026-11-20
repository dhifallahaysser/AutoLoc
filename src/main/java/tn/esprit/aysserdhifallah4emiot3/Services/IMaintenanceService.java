package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance createMaintenance(Maintenance maintenance);
    Maintenance getMaintenanceById(Long id);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenanceById(Long id);
    List<Maintenance> getAllMaintenances();
}
