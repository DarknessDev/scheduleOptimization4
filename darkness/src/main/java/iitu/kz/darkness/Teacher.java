package iitu.kz.darkness;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "TEACHER")
public class Teacher implements Serializable{

    private long id;
    
}
