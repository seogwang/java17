package sec5;
//2023.07.25(화) 3교시
//##얖은 복제, 깊은 복제
// 어느 한 곳의 데이터를 바꾸면 같이 바뀐다.
// 메모리는 절약할 수 있다.

// 깊은 복제 : Arrays.copyOf(arr1, arr1.length);
// 배열 비교 : Arrays.equals(비교대상1, 비교대상2);
// 배열 정렬 : Arrays.sort(배열명);
// 배열 내부 요소 검색 : Arrays.binarySearch(배열명, 값);
// 주소값 가져올 때 : arr1.hashCode()

// 배열비교는 = 로 비교하면 안된다. equals 메서드를 써야 한다.

import java.util.Arrays;

public class ArrausEx1 {
    public static void main(String[] args) {
        char[] arr1 = {'k','i','m','j','a','v','a'};
        System.out.println(arr1);
        char[] arr2 = arr1;     // 얕은 복제
        //얖은 복제 : 다른 곳(기억장소)에 같은 데이터를 복제하는 것이 아니라,
        //이미 저장되어 있는 데이터의 주소만을 다른 변수에 저장. (포인터랑 비슷한가?)
        //그러므로 실제 기억된 데이터는 1개만 존재한다.
        System.out.println(arr2);
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(arr1==arr2);

        // 깊은 복제
        System.out.println("\n깊은 복제");
        char[] arr3 = Arrays.copyOf(arr1, arr1.length); // 모든 요소 복제
        System.out.println(arr3);
        System.out.println(arr1.hashCode());
        System.out.println(arr3.hashCode());
        System.out.println(arr1==arr3);     // 배열은 주소가 같은지 비교하는 것이다. primitive 타입이 아니기 때문에.
        System.out.println(Arrays.equals(arr1, arr3)); // 그래서 배열의 값을 비교하려면 Arrays.equals을 써라.
        // 예전에는 반복 실행문을 써서 비교했다. 그래서 나온 것이 Arrays.equals 이다.

        int[] points = {90, 100, 80, 70, 95, 85, 75};
        for(int p:points){
            System.out.println(p);
        }
        System.out.println();
        Arrays.sort(points); // 배열 정렬
        for(int p:points){
            System.out.println(p);
        }
        
        //80가 몇 번째 있는지 알고 싶을 때 : binarySearch.
        System.out.println("80은 어디에? "+Arrays.binarySearch(points, 80));  // 이진 검색
        // 배열은 indexOf를 쓸 수가 없다. String에서만 쓸 수 있다.
        
    }
}
