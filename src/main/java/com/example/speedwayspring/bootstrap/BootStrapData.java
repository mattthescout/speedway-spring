package com.example.speedwayspring.bootstrap;

import com.example.speedwayspring.domain.InventoryTag;
import com.example.speedwayspring.repository.TagRepo;
import com.impinj.octane.Settings;
import com.impinj.octane.Tag;
import org.springframework.boot.CommandLineRunner;

import com.impinj.octane.ImpinjReader;
import com.impinj.octane.OctaneSdkException;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final TagRepo TagRepo;

    public BootStrapData(com.example.speedwayspring.repository.TagRepo tagRepo) {
        this.TagRepo = tagRepo;
    }


    @Override
    public void run(String... args) throws Exception {

        InventoryTag tag1 = new InventoryTag();
        tag1.setEPC("EPC 111000");
        tag1.setAntNum((short) 1);
        tag1.setChnNum((short) 1);
        TagRepo.save(tag1);

//        try {
//
//            System.out.println(TagRepo.count());
//
//            String hostname = "10.0.0.117";
//
//            ImpinjReader reader = new ImpinjReader();
//
//            System.out.println("Connecting to " + hostname);
//            reader.connect(hostname);
//
//            Settings settings = reader.queryDefaultSettings();
//
//            System.out.println("Stopping " + hostname);
//            reader.stop();
//
//            System.out.println("Disconnecting from " + hostname);
//            reader.disconnect();
//
//            System.out.println("Done");
//
//        } catch (OctaneSdkException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace(System.out);
//        }
    }
}
