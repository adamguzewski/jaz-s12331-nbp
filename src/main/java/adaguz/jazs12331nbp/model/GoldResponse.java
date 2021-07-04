package adaguz.jazs12331nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "goldresponse")
public class GoldResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Id of the result", required = true, example = "1")
    private Long id;
    @Enumerated(EnumType.STRING)
    @ApiModelProperty(notes = "Name of Gold", required = true, example = "GOLD")
    private Gold gold;
    @Column(name = "startdate")
    @ApiModelProperty(notes = "Start date", required = true, example = "2021-05-20")
    private LocalDate startDate;
    @Column(name = "enddate")
    @ApiModelProperty(notes = "End date", required = true, example = "2021-06-10")
    private LocalDate endDate;
    @ApiModelProperty(notes = "Average of Gold Prices", required = true, example = "202.22")
    private double exchange;
    @Column(name = "creationdate")
    @ApiModelProperty(notes = "Creation Date", required = true, example = "2021-07-04T16:08:32.22")
    private LocalDateTime creationDate;

    public GoldResponse(Long id, Gold gold, LocalDate startDate, LocalDate endDate, double exchange, LocalDateTime creationDate) {
        this.id = id;
        this.gold = gold;
        this.startDate = startDate;
        this.endDate = endDate;
        this.exchange = exchange;
        this.creationDate = creationDate;
    }

    public GoldResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public LocalDate getStart_date() {
        return startDate;
    }

    public void setStart_date(LocalDate start_date) {
        this.startDate = start_date;
    }

    public LocalDate getEnd_date() {
        return endDate;
    }

    public void setEnd_date(LocalDate end_date) {
        this.endDate = end_date;
    }

    public double getExchange() {
        return exchange;
    }

    public void setExchange(double exchange) {
        this.exchange = exchange;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
