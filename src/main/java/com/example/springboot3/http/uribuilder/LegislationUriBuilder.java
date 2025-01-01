package com.example.springboot3.http.uribuilder;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@SuppressWarnings("FieldCanBeLocal")
@Component
public class LegislationUriBuilder {

    private final String urlBase = "https://api.sample.kr/api";

    private final String urlInformationOnLivingLaws = "/v1";

    private final String serviceKey = "ui6ck%2B%2Bvo0k0DmG5doChkQncqlKMa%2Bgoj5GjcU%2B5NOH1Dixxh043ztpOlVRQ%3D%3D";

    public String toUriString() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("serviceKey", serviceKey)
                .toUriString();
    }

    public URI buildTrueToUri() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("serviceKey", serviceKey)
                .build(true)
                .toUri();
    }

    public URI buildFalseToUri() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("serviceKey", serviceKey)
                .build()
                .toUri();
    }

    public String buildFalseToUriString() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("serviceKey", serviceKey)
                .build()
                .toUriString();
    }

    public String buildTrueToUriString() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("serviceKey", serviceKey)
                .build(true)
                .toUriString();
    }

    public String buildFalseEncodeToUriString() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("serviceKey", serviceKey)
                .build()
                .encode()
                .toUriString();
    }

    public String buildTrueEncodeToUriString() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("serviceKey", serviceKey)
                .build(true)
                .encode()
                .toUriString();
    }

}
