package ua.edu.apps.lab71.AppUser;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @Entity
public class AppUser {
    @Id
    private int id;
    private int age = 20;
    private LocalDate dob;
    private String email = "";
}
