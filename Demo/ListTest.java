package Demo;
import java.util.ArrayList;
import java.util.List;
public class ListTest {
    public static void main(String[] args) {
//       List<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("刘诗诗");
        list.add("阿普顿");
        list.add("泰勒斯威夫特");
        list.add("关晓彤");
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println("*************");
        list.set(3,"杨幂");
        System.out.println(list);
        list.add(4,"老师");
        System.out.println(list.get(4));
        for(String s : list){
            System.out.println(s);
        }
        System.out.println(list.subList(1,4));
        System.out.println(list.contains("泰勒斯威夫特"));
        System.out.println(list.contains("唐嫣"));
        List<String> list1 = new ArrayList <>(list);  //复制
        System.out.println("复制了一份List1:");
        System.out.println(list1);
        list.set(3,"赵奕欢");
        System.out.println(list1);  //这里的String类型不可变，应该换成其他的

    }
}
