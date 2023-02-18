package lk.spring.easyCar.dto;

public class PaymentDTO {
    private int paymentId;
    private int resId;
    private Double amount;
    private int adminId;
    private String advanceStatus;

    public PaymentDTO() {
    }

    public PaymentDTO(int paymentId, int resId, Double amount, int adminId, String advanceStatus) {
        this.paymentId = paymentId;
        this.resId = resId;
        this.amount = amount;
        this.adminId = adminId;
        this.advanceStatus = advanceStatus;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdvanceStatus() {
        return advanceStatus;
    }

    public void setAdvanceStatus(String advanceStatus) {
        this.advanceStatus = advanceStatus;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "paymentId=" + paymentId +
                ", resId=" + resId +
                ", amount=" + amount +
                ", adminId=" + adminId +
                ", advanceStatus='" + advanceStatus + '\'' +
                '}';
    }
}
