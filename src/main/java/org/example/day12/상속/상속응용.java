package org.example.day12.상속;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class 상속응용 {
    public static void main(String[] args) {
        // 고정, 같은 타입, 많은 양 --> 배열
        // 가변, 같은(다른) 타입, 많은 수 --> ArrayList

        ArrayList list = new ArrayList();
        list.add(10000);
        list.add("볼펜");
        list.add(new Date());
        list.add(25.5);

        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println("-----------------------------------");

        Object[] list2 = new Object[2]; // 서로 다른 타입을 넣을 수 있음
        list2[0] = 100;
        list2[1] = "감사합니다.";
        System.out.println(Arrays.toString(list2));
    }
}

/*
메시지에 나타난 Note: ... uses unchecked or unsafe operations는 자바에서 제네릭(Generic) 타입을 사용할 때 발생할 수 있는 경고입니다. 이를 해결하려면 타입을 명확하게 지정해 주어야 합니다.

지금 코드에서 ArrayList를 사용할 때 제네릭 타입을 명시하지 않았습니다. 자바 5부터 도입된 제네릭스를 사용하면, 리스트에 어떤 타입의 데이터를 저장할 것인지 명확하게 지정할 수 있습니다. 제네릭스를 사용하지 않으면 자바 컴파일러는 타입 안정성을 보장할 수 없기 때문에 경고 메시지를 출력합니다.

예를 들어, ArrayList<Object>로 제네릭 타입을 명시적으로 선언하면 이 경고를 없앨 수 있습니다:

package org.example.day12.상속;

import java.util.ArrayList;
import java.util.Date;

public class 상속응용 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(10000);
        list.add("볼펜");
        list.add(new Date());
        list.add(25.5);

        System.out.println(list);
    }
}

이렇게 하면 -Xlint:unchecked 경고 없이 컴파일됩니다. ArrayList<Object>를 사용하면 리스트에 어떤 타입의 객체든 넣을 수 있습니다.

만약 리스트가 특정 타입의 객체만 받도록 하려면 제네릭 타입을 더 구체적으로 설정할 수 있습니다.
 */
