package sec3;
// 2023.07.25(화) 1교시

//##성능 측정 방법 중 반환 시간 생성 로직

// 시스템에 시간을 측정하는 콜렉션이 있다.
// 걸린 시간을 측정하여 성능 측정하는 것.
// 성능 평가 기준 (이게 좋아야 시스템, 프로그램이 좋은 프로그램인 것이다.)
// 성능 측정 척도 : 처리능력(Throughput, 한 번에 얼만큼의 양을 처리하는가?),
// 반환시간(Turn Around Time, 클라이언트가 요청하고 응답받는 때까지 걸린 시간),
// 사용 가능도(Availability 10시간 쓰는데, 1시간 고장나 있었다면 실제 9시간.),
// 신뢰도(Reliability)
// 처리 능력은 높이고, 반환 시간(응답시간)은 단축시키고, 사용가능도의 %는 높아야 한다. 신뢰도(정확도)도 높아야 한다.


public class SystemEx3 {
    public static void main(String[] args) {
        //성능 측정
        long tot = 0;   // long타입 변수 지정. nano second 단위 계산 하기 위해서
        long start = System.currentTimeMillis(); // 시작시간을 system에서 millisecond 단위로 받아와서 저장.
        // nano = 1/1000000000 , 시작할 때 시간을 nano단위로?? milli 단위로 가져온 것 같은데...?
        for(int i=0; i<100000;i++){     // for문을 이용해서 100000까지 반복함
            System.out.println(i);      // i를 출력
            tot+=i;                     // long 타입 tot 변수에 i를 계속 더함.
        }
        long end = System.nanoTime();   // 끝났을 때 시간을 nano 단위로
        System.out.println("누적 결과 : "+tot);     // 누적 합계 결과
        System.out.println("걸린 시간 : "+(end - start)+"ns");
    }
}
