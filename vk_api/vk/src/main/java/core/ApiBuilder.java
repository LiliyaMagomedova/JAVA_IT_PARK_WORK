package core;


import org.springframework.web.client.RestTemplate;

public class ApiBuilder {
    public static VkApi buildRestTemplateApi() {
        return new VkApiRestTemplateImpl();
    }
}
