package kg.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cinema")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false , unique = true)
    private Long id;
    @Column(name= "name")
    private String name;
    @Column(name= "password" ,unique = true, nullable = false)
    private Integer password;

}
