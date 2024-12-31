package com.example.springboot3.http.uribuilder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LegislationUriBuilderTest {

    @Autowired
    private LegislationUriBuilder legislationUriBuilder;

    @DisplayName("URI 인코딩 확인하기")
    @Test
    void buildInformationOnLivingLawsUri() {
        //given

        //when
        // build(true) 라서 다시 인코딩이 안됨
//        URI uri1 = legislationUriBuilder.buildInformationOnLivingLawsUri_v1();
//        // build() 라서 인코딩이 됨
//        URI uri1_1 = legislationUriBuilder.buildInformationOnLivingLawsUri_v1_1();
//
//        String uri2 = legislationUriBuilder.buildInformationOnLivingLawsUri_v2();

        // encode()이 없으니까 인코딩 안되는게 맞음
        String uri3 = legislationUriBuilder.buildInformationOnLivingLawsUri_v3();


//        String uri3_1 = legislationUriBuilder.buildInformationOnLivingLawsUri_v3_1();
//
//        // encode()이 있으니까 인코딩 되는게 맞음
//        String uri4 = legislationUriBuilder.buildInformationOnLivingLawsUri_v4();
//
//        // build(true) 는 인코딩이 퇬는지 안됐는지 알려주는 것이 맞나??
//        String uri5 = legislationUriBuilder.buildInformationOnLivingLawsUri_v5();

        //then

    }

}