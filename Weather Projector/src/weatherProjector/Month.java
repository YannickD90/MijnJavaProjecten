package weatherProjector;

public enum Month {
    JANUARY(3.3),
    FEBRUARY(3.7),
    MARCH(6.8),
    APRIL(9.8),
    MAY(13.6),
    JUNE(16.2),
    JULY(18.4),
    AUGUST(18.0),
    SEPTEMBER(14.9),
    OKTOBER(11.1),
    NOVEMBER(6.8),
    DECEMBER(3.9);

    public double getAverageTemp() {
        return averageTemp;
    }

    private double averageTemp;

    private Month(double averageTemp){
        this.averageTemp = averageTemp;
    }


}
