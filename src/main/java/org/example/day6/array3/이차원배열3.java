package org.example.day6.array3;

import javax.swing.*;

public class 이차원배열3 {
    public static void main(String[] args) {
        //전체 프레임이 필요
        //new를 이용해서 부품을 만들어 램에 넣어둠.
        JFrame f = new JFrame();
        //1. new JFrame(): JFrame을 램에 넣어둔다.
        //2. f = new JFrame(): 램에 넣어둔 주소를 변수에 저장
        //3. JFrame f: f라는 변수에는 JFrame이 들어있는 주소를 넣어두었다를 표시
        //   --> 이렇게 쓰면 f에는 JFrame이 저장된 위치만 넣을 수 있고,
        //       다른 부품의 위치는 넣을 수 없음.
        System.out.println(f);
        f.setSize(300, 300);
        String title[] = {"장소", "누구와", "언제"};
        String contents[][] = {
                {"부산", "동생", "오전 출발"},
                {"대구", "친구", "오후 출발"},
                {"광주", "동료", "저녁 출발"}
        };
        //JTable table = new JTable(2차원 배열 데이터, 1차원의 항목명)
        JTable table = new JTable(contents, title);
        //f.add(table);
        JScrollPane scroll = new JScrollPane(table);
        f.add(scroll);
        f.setVisible(true); //맨 끝에!!
    }
}//comit

 /*
f.add(table);가 없어도 되는 이유는, JTable을 직접 추가하는 대신 JScrollPane에 JTable을 넣고,
그 JScrollPane을 JFrame에 추가했기 때문입니다.
JTable은 스크롤 기능이 기본적으로 없어서 데이터를 모두 보여주지 못할 수 있습니다.
그래서 JScrollPane을 사용하여 JTable을 감싸면, 스크롤을 통해 데이터를 볼 수 있는 기능이 추가됩니다.
f.add(scroll);로 JScrollPane을 JFrame에 추가하면서, 그 안에 있는 JTable도 함께 추가된 것이므로, f.add(table);는 필요하지 않습니다.
결론적으로, JTable을 JScrollPane에 감싸서 추가하는 방식이 더 적절하며, 그로 인해 f.add(table);는 불필요해진 것입니다.
 */


/*

package org.example.day6.array3;

import javax.swing.*;

public class 이차원배열3 {
    public static void main(String[] args) {
        //전체 프레임이 필요
        //new를 이용해서 부품을 만들어 램에 넣어둠.
        JFrame f = new JFrame();
        //1. new JFrame(): JFrame을 램에 넣어둔다.
        //2. f = new JFrame(): 램에 넣어둔 주소를 변수에 저장
        //3. JFrame f: f라는 변수에는 JFrame이 들어있는 주소를 넣어두었다를 표시
        //   --> 이렇게 쓰면 f에는 JFrame이 저장된 위치만 넣을 수 있고,
        //       다른 부품의 위치는 넣을 수 없음.
        System.out.println(f);
        f.setSize(300, 300);
        String[] title = {"장소", "누구와", "언제"};
        String[][] contents = {
                {"부산", "동생", "오전출발"},
                {"대구", "친구", "오후출발"},
                {"광주", "동료", "저녁출발"}
        };

        //JTable table = new JTable(2차원 배열 데이터 , 1차원의 항목명);
        JTable table = new JTable(contents, title);
        JScrollPane pane = new JScrollPane(table);
        f.add(pane);

        //맨 끝에!!
        f.setVisible(true); //보이는 것 설정

    }
}
 */