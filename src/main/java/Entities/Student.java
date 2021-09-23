package Entities;

public class Student {
    private String _name;
    private double _average;
    private boolean _isKnownBlockchain;

    public Student(){ }

    public Student(String name, double average, boolean isKnownBlockchain){
        _name = name;
        _average = average;
        _isKnownBlockchain = isKnownBlockchain;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setAverage(double average) {
        _average = average;
    }

    public void setIsKnownBlockchain(boolean isKnownBlockchain) {
        _isKnownBlockchain = isKnownBlockchain;
    }

    public String getName() {
        return _name;
    }

    public double getAverage() {
        return _average;
    }

    public boolean getIsKnownBlockchain() {
        return _isKnownBlockchain;
    }

    public boolean isExellent() { return _average >= 4; }
}
