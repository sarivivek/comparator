import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class mainClass {


    public static <Datalist> void main(String[] args) {
mainClass obj = new mainClass();
List<DataList> list = new ArrayList<DataList>();
        DataList a1 = new DataList();
        a1.setIsbn("ybc12");
        a1.setName("test1");
        a1.setOrderNumber(1);
        list.add(a1);

        DataList a2 = new DataList();
        a2.setIsbn("xbc12");
        a2.setName("test2");
        a2.setOrderNumber(2);
        list.add(a2);

        DataList a3 = new DataList();
        a3.setIsbn("a3c12");
        a3.setName("test3");
        a3.setOrderNumber(3);
        list.add(a3);

        DataList a4 = new DataList();
        a4.setIsbn("a2c12");
        a4.setName("test4");
        a4.setOrderNumber(3);
        list.add(a4);

        DataList a5 = new DataList();
        a5.setIsbn("abc12");
        a5.setName("test4");
        a5.setOrderNumber(3);
        list.add(a5);

        System.out.println("Starting with sorting");
        obj.sortIsbn(list);

    }

    private void sortIsbn(List<DataList> list) {
        list.sort(new Comparator<DataList>() {
            @Override
            public int compare(DataList o1, DataList o2) {
                return o1.getIsbn().compareTo(o2.getIsbn());
            }
        });

        for(DataList data :list) {
            System.out.println(data);
        }
    }


}
