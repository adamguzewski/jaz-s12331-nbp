package adaguz.jazs12331nbp.service;

import adaguz.jazs12331nbp.model.AverageCourses;
import adaguz.jazs12331nbp.model.Gold;
import adaguz.jazs12331nbp.model.GoldResponse;
import adaguz.jazs12331nbp.model.SumOfGoldAverage;
import adaguz.jazs12331nbp.repository.GoldRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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

    public GoldResponse checkGold(LocalDate startDate, LocalDate endDate) {
        String url = "http://api.nbp.pl/api/cenyzlota/" + startDate + "/" + endDate;
        SumOfGoldAverage sumOfGoldAverage = restTemplate.getForObject(url, SumOfGoldAverage.class);
        double average = calculate(sumOfGoldAverage.getAverageCoursesList());
        GoldResponse goldResponse = getResponse(startDate, endDate, average);
        return goldRepository.save(goldResponse);
    }

    private GoldResponse getResponse(LocalDate startDate, LocalDate endDate, double calculate) {
        GoldResponse goldResponse = new GoldResponse();
        goldResponse.setGold(Gold.GOLD);
        goldResponse.setStart_date(startDate);
        goldResponse.setEnd_date(endDate);
        goldResponse.setExchange(calculate);
        goldResponse.setCreationDate(LocalDateTime.now());
        return goldResponse;
    }

    // Autor: Arkadiusz Stankiewicz
    private double calculate(List<AverageCourses> averageCoursesList){
        return averageCoursesList.stream()
                .mapToDouble(AverageCourses::getCena)
                .average()
                .orElse(0.0d);
    }


}
