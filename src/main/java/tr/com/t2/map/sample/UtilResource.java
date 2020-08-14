package tr.com.t2.map.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.t2.map.sample.util.Util;

import javax.transaction.Transactional;


@RestController
@RequestMapping("/util")
public class UtilResource {

    @Transactional
    @GetMapping
    @RequestMapping("/generator")
    public void generate(@RequestParam("count") int count) {
        for (int i = 0; i < count; i++) {
            String name = Util.generateName();
            SampleEntity sampleEntity = new SampleEntity();
            sampleEntity.name = name;
            sampleEntity.lon = Util.randomValue(26.5, 45.0);
            sampleEntity.lat = Util.randomValue(36.5, 42.0);
            sampleEntity.persist();
        }
    }

}
