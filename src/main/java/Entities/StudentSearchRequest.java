package Entities;

public class StudentSearchRequest {
    public boolean isBlockchainExpert;
    public boolean isExellent;

    public StudentSearchRequest(boolean isBlockchainExpert, boolean isExellent){
        this.isBlockchainExpert = isBlockchainExpert;
        this.isExellent = isExellent;
    }
}
