package iitu.kz.darkness.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class SpecialityId implements Serializable {

    @Column(name = "SPECIALITY_ID")
    private long spec_id;

    @Column(name = "COURSE_ID")
    private long course_id;
}
