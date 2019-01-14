package Modell;

public class ResultForPieChart {
    int healed;
    int partiallyHealed;
    int notHealed;
    int other;

    public ResultForPieChart(int healed, int partiallyHealed, int notHealed, int other){
        this.healed=healed;
        this.partiallyHealed=partiallyHealed;
        this.notHealed=notHealed;
        this.other=other;
    }

    public int getHealed() {
        return healed;
    }

    public int getPartiallyHealed() {
        return partiallyHealed;
    }

    public int getNotHealed() {
        return notHealed;
    }

    public int getOther() {
        return other;
    }
}
