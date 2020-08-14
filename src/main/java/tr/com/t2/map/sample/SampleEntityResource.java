package tr.com.t2.map.sample;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface SampleEntityResource extends PanacheEntityResource<SampleEntity, Long> {
}
