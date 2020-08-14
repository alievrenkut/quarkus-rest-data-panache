package tr.com.t2.map.sample;

import tr.com.t2.map.sample.util.TimedPanacheEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class SampleEntity extends TimedPanacheEntity {

    @NotNull
    public String name;
    @NotNull
    public double lon;
    @NotNull
    public double lat;
}
