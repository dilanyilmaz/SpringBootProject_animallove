package com.animallove.animallove.repository;

import com.animallove.animallove.entity.Owner;
import com.animallove.animallove.entity.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OwnerRepositoryTest {

    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    public void saveOwner() {
        Pet pet1 = Pet.builder()
                .type("kus")
                .breed("cekoslavak")
                .name("Limon")
                .old("3")
                .explanation("soğuk algınlığı şikayeti")
                .build();
        Pet pet2 = Pet.builder()
                .type("kus")
                .breed("cekoslavak")
                .name("Maviş")
                .old("1")
                .explanation("soğuk algınlığı şikayeti")
                .build();
        Owner owner =
                Owner.builder()
                        .firstName("Zeynep")
                        .lastName("Yılmaz")
                        .connection("istanbul ...")
                        .phoneNumber("05413855749")
                        .eMail("zey@gmail.com")
                        .pets(List.of(pet1,pet2))
                        .build();
        ownerRepository.save(owner);
   }
}