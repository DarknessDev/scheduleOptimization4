package iitu.kz.darkness.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class TeacherPlanId implements Serializable{
    
    @Column(name = "TEACHER_ID")
    private long teacher_id;

    @Column(name = "COURSE_ID")
    private long course_id;
}
