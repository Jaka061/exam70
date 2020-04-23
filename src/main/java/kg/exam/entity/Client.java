package kg.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false , unique = true)
    private Long id;
    @Column(name= "name")
    private String name;
    @Column(name= "age" , nullable = false)
    private Integer age;
    @OneToOne
    @Column(name= "ticket_id" ,unique = true)
    private Ticket ticket;
}
