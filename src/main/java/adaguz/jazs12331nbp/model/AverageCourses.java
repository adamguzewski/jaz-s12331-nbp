package adaguz.jazs12331nbp.model;

import java.util.Date;

public class AverageCourses {
    private Date data;
    private double cena;

    public AverageCourses(Date data, double cena) {
        this.data = data;
        this.cena = cena;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
