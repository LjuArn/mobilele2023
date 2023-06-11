package com.example.mobilele2023.init;


import com.example.mobilele2023.service.BrandService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDB implements CommandLineRunner {

    private final BrandService brandService;

    public InitDB(BrandService brandService) {
        this.brandService = brandService;
    }

    @Override
    public void run(String... args) throws Exception {

        brandService.initBrands();
    }
}
