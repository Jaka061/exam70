package kg.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false , unique = true)
    private Long id;
    @Column(name="place_num" , unique = true)
    private Integer placeNum;
    @Column(name= "price")
    private Integer price;
    @Column(name= "isBought")
    private Boolean isBought;
    @ManyToOne
    @Column(name= "film")
    private Film film;

}
