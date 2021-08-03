import java.util.Objects;

public class DataList {

    private String isbn;

    private int orderNumber;

    private String name;

    public DataList() {
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataList dataList = (DataList) o;
        return orderNumber == dataList.orderNumber;
    }

    @Override
    public String toString() {
        return "DataList{" +
                "isbn='" + isbn + '\'' +
                ", orderNumber=" + orderNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }
}
