package iitu.kz.darkness.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "GROUPS")
public class Groups implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GROUPS_ID")
    private long id;

    @Column(name = "SPEC_ID")
    private long spec_id;

    @Column(name = "GROUPS_NAME", length = 200)
    private String name;
 
//    @ManyToOne
//    @JoinColumn(name = "SPEC_ID", nullable = false,
//            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_GROUPS_TO_SPECIALITY"))
//    private Speciality specialityGroup;
}
