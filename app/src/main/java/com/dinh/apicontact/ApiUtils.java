package com.dinh.apicontact;

public class ApiUtils {
    private static String baseURL = "http://192.168.1.3/contact/api/";

    public static ApiService getServer() {
        return ApiClient.getApiClient(baseURL).create(ApiService.class);
    }
}
