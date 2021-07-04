package adaguz.jazs12331nbp.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "goldresponse")
public class GoldResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Gold gold;
    @Column(name = "startdate")
    private Date startDate;
    @Column(name = "enddate")
    private Date endDate;
    private double exchange;
    @Column(name = "creationdate")
    private LocalDateTime creationDate;

    public GoldResponse(Long id, Gold gold, Date startDate, Date endDate, double exchange, LocalDateTime creationDate) {
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

    public Date getStart_date() {
        return startDate;
    }

    public void setStart_date(Date start_date) {
        this.startDate = start_date;
    }

    public Date getEnd_date() {
        return endDate;
    }

    public void setEnd_date(Date end_date) {
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
