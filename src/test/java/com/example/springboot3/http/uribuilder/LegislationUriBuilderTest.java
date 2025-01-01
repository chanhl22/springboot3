package com.example.springboot3.http.uribuilder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LegislationUriBuilderTest {

    @Autowired
    private LegislationUriBuilder legislationUriBuilder;

    @DisplayName("toUriString() 은 인코딩된다.")
    @Test
    void toUriString() {
        //given

        //when
        String uri = legislationUriBuilder.toUriString();

        //then
        assertThat(uri).isEqualTo("https://api.sample.kr/api/v1?serviceKey=ui6ck%252B%252Bvo0k0DmG5doChkQncqlKMa%252Bgoj5GjcU%252B5NOH1Dixxh043ztpOlVRQ%253D%253D");
    }

    @DisplayName("build(true).toUri() 은 인코딩되지 않는다.")
    @Test
    void buildTrueToUri() {
        //given

        //when
        URI uri = legislationUriBuilder.buildTrueToUri();

        //then
        assertThat(uri.toString()).isEqualTo("https://api.sample.kr/api/v1?serviceKey=ui6ck%2B%2Bvo0k0DmG5doChkQncqlKMa%2Bgoj5GjcU%2B5NOH1Dixxh043ztpOlVRQ%3D%3D");
    }

    @DisplayName("build(false).toUri() 은 인코딩된다.")
    @Test
    void buildFalseToUri() {
        //given

        //when
        URI uri = legislationUriBuilder.buildFalseToUri();

        //then
        assertThat(uri.toString()).isEqualTo("https://api.sample.kr/api/v1?serviceKey=ui6ck%252B%252Bvo0k0DmG5doChkQncqlKMa%252Bgoj5GjcU%252B5NOH1Dixxh043ztpOlVRQ%253D%253D");
    }


    @DisplayName("build(false).toUriString() 은 인코딩되지 않는다.")
    @Test
    void buildFalseToUriString() {
        //given

        //when
        String uri = legislationUriBuilder.buildFalseToUriString();

        //then
        assertThat(uri).isEqualTo("https://api.sample.kr/api/v1?serviceKey=ui6ck%2B%2Bvo0k0DmG5doChkQncqlKMa%2Bgoj5GjcU%2B5NOH1Dixxh043ztpOlVRQ%3D%3D");
    }

    @DisplayName("build(true).toUriString() 은 인코딩되지 않는다.")
    @Test
    void buildTrueToUriString() {
        //given

        //when
        String uri = legislationUriBuilder.buildTrueToUriString();

        //then
        assertThat(uri).isEqualTo("https://api.sample.kr/api/v1?serviceKey=ui6ck%2B%2Bvo0k0DmG5doChkQncqlKMa%2Bgoj5GjcU%2B5NOH1Dixxh043ztpOlVRQ%3D%3D");
    }

    @DisplayName("build(false).encode().toUriString() 은 인코딩된다.")
    @Test
    void buildFalseEncodeToUriString() {
        //given

        //when
        String uri = legislationUriBuilder.buildFalseEncodeToUriString();

        //then
        assertThat(uri).isEqualTo("https://api.sample.kr/api/v1?serviceKey=ui6ck%252B%252Bvo0k0DmG5doChkQncqlKMa%252Bgoj5GjcU%252B5NOH1Dixxh043ztpOlVRQ%253D%253D");
    }

    @DisplayName("build(true).encode().toUriString() 은 인코딩되지 않는다.")
    @Test
    void buildTrueEncodeToUriString() {
        //given

        //when
        String uri = legislationUriBuilder.buildTrueEncodeToUriString();

        //then
        assertThat(uri).isEqualTo("https://api.sample.kr/api/v1?serviceKey=ui6ck%2B%2Bvo0k0DmG5doChkQncqlKMa%2Bgoj5GjcU%2B5NOH1Dixxh043ztpOlVRQ%3D%3D");
    }

}