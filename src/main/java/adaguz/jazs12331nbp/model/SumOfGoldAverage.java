package adaguz.jazs12331nbp.model;

import java.util.List;

public class SumOfGoldAverage {
    private List<AverageCourses> averageCoursesList;

    public SumOfGoldAverage(List<AverageCourses> averageCoursesList) {
        this.averageCoursesList = averageCoursesList;
    }

    public SumOfGoldAverage() {
    }

    public List<AverageCourses> getAverageCoursesList() {
        return averageCoursesList;
    }

    public void setAverageCoursesList(List<AverageCourses> averageCoursesList) {
        this.averageCoursesList = averageCoursesList;
    }
}
