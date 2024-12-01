package static2;

import static static2.DecoData.staticCall;
//import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("2. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);

        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); // 마지 인스턴스에 있는 메서드를 호출하는 방식 같은 사용X

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
