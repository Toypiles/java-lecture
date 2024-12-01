package extend1.access.child;
import extend1.access.parent.Parent;

public class Child extends Parent{
    
    public void call(){
        publicValue=1;
        protectedValue=1; // 상속관계 or 같은 패키지
        //defaulValue=1; //다른 패키지 접근 불가, 컴파일 오류
        //privateValue =1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();

        printParent();
    }

}
