package adaguz.jazs12331nbp.service;

import adaguz.jazs12331nbp.repository.GoldRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoldService {
    private final String nbpGoldAddress;
    private final RestTemplate restTemplate;
    private final GoldRepository goldRepository;

    public GoldService(@Value("${nbp.gold.address}") String nbpGoldAddress, RestTemplate restTemplate, GoldRepository goldRepository) {
        this.nbpGoldAddress = nbpGoldAddress;
        this.restTemplate = restTemplate;
        this.goldRepository = goldRepository;
    }




}
