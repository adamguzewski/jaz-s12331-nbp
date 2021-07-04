package adaguz.jazs12331nbp.controller;

import adaguz.jazs12331nbp.model.GoldResponse;
import adaguz.jazs12331nbp.service.GoldService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/gold")
public class GoldController {

    private final GoldService goldService;

    public GoldController(GoldService goldService) {
        this.goldService = goldService;
    }

    @ApiOperation(value = "Get average of Gold Prices.",
            response = GoldResponse.class,
            notes = "This method returns average value of gold rates"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Gold Not Found"),
            @ApiResponse(code = 400, message = "Bad Request, check entered dates")
    })
    @GetMapping(value = "/{startdate}/{enddate}")
    public ResponseEntity<GoldResponse> checkAverageGoldPrices(@PathVariable("startdate") LocalDate st, @PathVariable("enddate") LocalDate en) {
        return ResponseEntity.ok(goldService.checkGold(st, en));
    }


}
