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
@Table(name = "TEACHER")
public class Teacher implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "TEACHER_ID")
    private long id;
    
    @Column(name = "TEACHER_NAME", length = 200)
    private String name;
    
}
