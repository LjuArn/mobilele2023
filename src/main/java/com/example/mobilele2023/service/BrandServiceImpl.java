package com.example.mobilele2023.service;

import com.example.mobilele2023.repository.BrandRepository;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService{

   private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void initBrands() {

        if (brandRepository.count() != 0) {
            return;
        }


    }
}


//  Arrays.stream(PriorityNameEnum.values())
//                .forEach(priorityNameEnum -> {
//                    PriorityEntity priorityEntity = new PriorityEntity();
//                    priorityEntity.setName(priorityNameEnum);
//                    switch (priorityNameEnum) {
//                        case URGENT -> priorityEntity.setDescription("An urgent problem that blocks the system use until the issue is resolved.");
//                        case IMPORTANT -> priorityEntity.setDescription("A core functionality that your product is explicitly supposed to perform is compromised.");
//                        case LOW -> priorityEntity.setDescription("Should be fixed if time permits but can be postponed.");
//                    }
//                    priorityRepository.save(priorityEntity);
//                });