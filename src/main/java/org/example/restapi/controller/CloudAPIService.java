package org.example.restapi.controller;

import org.example.restapi.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorID}")
    public CloudVendor getVendorDetails( String vendorID){
        return cloudVendor;
//                new CloudVendor("C1","Vendor 1",
//                "Address 1", "XXXX2032");
    }
    @PostMapping("/create")
    public String createVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor created";
    }


    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor updated";
    }
    @DeleteMapping("{vendorID}")
    public String deleteVendorDetails(String vendorID){
        this.cloudVendor=null;
        return "Cloud Vendor Deleted";
    }
}
