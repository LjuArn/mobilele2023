package com.example.mobilele2023.service;

import com.example.mobilele2023.domain.entity.BrandEntity;
import com.example.mobilele2023.domain.entity.Enums.CategoryEnum;
import com.example.mobilele2023.domain.entity.ModelEntity;
import com.example.mobilele2023.repository.BrandRepository;
import com.example.mobilele2023.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;

    public BrandServiceImpl(BrandRepository brandRepository, ModelRepository modelRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
    }

    @Override
    public void initBrands() {

        if (brandRepository.count() != 0) {
            return;
        }
        BrandEntity ford = new BrandEntity().setName("ford");


        ModelEntity fiesta = new ModelEntity();
        fiesta.setName("Fiesta")
                .setImageUrl("https://bg.wikipedia.org/wiki/%D0%A4%D0%B0%D0%B9%D0%BB:2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg")
                .setStartYear(1976)
                .setCategory(CategoryEnum.CAR);

        ModelEntity escord = new ModelEntity();
        escord.setName("Escord")
                .setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/1995_Ford_Escort_1.6_Sapphire_%2819773828282%29.jpg/1280px-1995_Ford_Escort_1.6_Sapphire_%2819773828282%29.jpg")
                .setStartYear(1968)
                .setEndYear(2002)
                .setCategory(CategoryEnum.CAR);

        ford.setModels(Set.of(fiesta, escord));
        fiesta.setBrand(ford);
        escord.setBrand(ford);

        brandRepository.save(ford);
        modelRepository.save(fiesta);
        modelRepository.save(escord);
    }
}


//  ModelEntity escord = new ModelEntity();
//        escord.setName("Escord")
//                .setImageUrl("https://bg.wikipedia.org/wiki/%D0%A4%D0%B0%D0%B9%D0%BB:1995_Ford_Escort_1.6_Sapphire_(19773828282).jpg")
//                .setStartYear(1968)
//                .setEndYear(2000)
//                .setCategory(CategoryEnum.CAR);



//        ford.setModels(Set.of(fiesta, escord));
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