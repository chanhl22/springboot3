package com.example.springboot3.http.uribuilder;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@SuppressWarnings("FieldCanBeLocal")
@Component
public class LegislationUriBuilder {

    private final String urlBase = "https://api.odcloud.kr/api";

    private final String urlInformationOnLivingLaws = "/15137685/v1/uddi:e2db0c00-7b36-494d-9e3b-f8dc6cee4328";

    private final String serviceKey = "ui6ck%2B%2Bvo0k0DmG5doChkQncqlKMa%2Bgoj5GjcU%2B5NOH1Di6GCPV7VKTlQbsTyrAnRoWWW1nbIxh043ztpOlVRQ%3D%3D";

    public URI buildInformationOnLivingLawsUri_v1() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("page", 1)
                .queryParam("perPage", 1000000)
                .queryParam("returnType", "JSON")
                .queryParam("serviceKey", serviceKey)
                .build(true)
                .toUri();
    }

    public URI buildInformationOnLivingLawsUri_v1_1() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("page", 1)
                .queryParam("perPage", 1000000)
                .queryParam("returnType", "JSON")
                .queryParam("serviceKey", serviceKey)
                .build()
                .toUri();
    }

    public String buildInformationOnLivingLawsUri_v2() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("page", 1)
                .queryParam("perPage", 1000000)
                .queryParam("returnType", "JSON")
                .queryParam("serviceKey", serviceKey)
                .toUriString();
    }

    public String buildInformationOnLivingLawsUri_v3() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("page", 1)
                .queryParam("perPage", 1000000)
                .queryParam("returnType", "JSON")
                .queryParam("serviceKey", serviceKey)
                .build()
                .toUriString();
    }

    public String buildInformationOnLivingLawsUri_v3_1() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("page", 1)
                .queryParam("perPage", 1000000)
                .queryParam("returnType", "JSON")
                .queryParam("serviceKey", serviceKey)
                .build(true)
                .toUriString();
    }


    public String buildInformationOnLivingLawsUri_v4() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("page", 1)
                .queryParam("perPage", 1000000)
                .queryParam("returnType", "JSON")
                .queryParam("serviceKey", serviceKey)
                .build()
                .encode()
                .toUriString();
    }

    public String buildInformationOnLivingLawsUri_v5() {
        return UriComponentsBuilder.fromHttpUrl(urlBase)
                .path(urlInformationOnLivingLaws)
                .queryParam("page", 1)
                .queryParam("perPage", 1000000)
                .queryParam("returnType", "JSON")
                .queryParam("serviceKey", serviceKey)
                .build(true)
                .toUriString();
    }

}
