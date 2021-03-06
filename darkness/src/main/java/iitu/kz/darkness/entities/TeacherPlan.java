package iitu.kz.darkness.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "TEACHER_PLAN")
public class TeacherPlan implements Serializable {

    @EmbeddedId
    private TeacherPlanId id;

    @Column(name = "HOURS_PER_WEEK")
    private long hoursPerWeek;
}
