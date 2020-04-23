package kg.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "session")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false , unique = true)
    private Long id;
    @Column(name="is3D")
    private Boolean is3D;
    @Column(name="time")
    private LocalDateTime time;
    @ManyToOne
    @Column(name="cinema_id")
    private Cinema cinema;
    @ManyToOne
    @Column(name="film_id")
    private Film film;

}
