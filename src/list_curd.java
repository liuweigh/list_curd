import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuwei
 * @Date: 2019/10/25 0025 8:20
 */
public class list_curd {
    //创建list 集合
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //增加
        list.add("图图");
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);

        //往指定位置上添加
        list.add(1,"没头脑");

        System.out.println(list);

        //删除索引位置2上的元素
        list.remove(2);
        System.out.println(list);

        //修改指定位置上的元素
        list.set(0,"三毛");
        System.out.println(list);


        //查询
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
