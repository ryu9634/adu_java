public class Product {
    private String pname;
    private int price;
    private String company;

    public Product(String pname, int price, String company) {
        this.pname = pname;
        this.price = price;
        this.company = company;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pname).append(", ").append(price).append(", ").append(company);
        // 노트20, 1200000, 삼성
        return sb.toString();
    }
}
