package tn.esprit.aysserdhifallah4emiot3.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "vehicules")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipement;
    String libelle;

    @ManyToMany(mappedBy = "equipements")
    List<Vehicule> vehicules = new ArrayList<>();
}
