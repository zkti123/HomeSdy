package com.green.javaHome.sty.study_one.annotation;

public class Annotation {
    public static void main(String[] args) {
        /*
        애너테이션
        -주석 처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공.

        @Override
        -오버라이딩 을 올바르게 했는지 컴파일러가 체크하게 한다.
        -오버라이딩할 때 메서드이름을 잘못적는 실수를 하는 경우가 많다.
        -오버라이딩 할 때는 메서드 선언부 앞에 @Override를 붙이자.

        @Deprecated
        -앞으로 사용하지 않을것을 권장하는 필드나 메서드에 붙인다.
        -@Deprecated의 사용예, date 클래스의 getDate()
        -@Deprecated가 붙은 대상이 사용된 코드를 컴파일하면 나타나는 메시지가 있다.

        @Functionalinterface
        - 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
        -함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음.
        굳이 적을 필요가 없음.

        @SuppressWarnings
        - 컴파일러의 경고 메세지가 나타나지 않게 엊ㄱ제한다.
        - 괄호()안에 억제하고자하는 경고의 종류를 문자열로 지정.
        - 둘 이상의 경고를 동시에 억제하려면 다음과 같이 한다 .
        EX))) @SuppressWarnings({"","",""})
        - Xlint 옵션으로 컴파일 하면 ,경고메시지를 확인할 수 있다.
        괄호[]안이 경고의 종류


         */
        /*
        메타 애너테이션
        - 메타 애너테이션은 '애너테션을 위한 애너테이션'

        @Target
        -애너테이션을 정의 할 떄, ,적용대상 지정에 사용.

        @Retention
        - 애너테이션이 유지 되는 기간을 지정하는데 사용
        -SOURCE => 소스 파일에만 존재. 클래스 파일에는 존재하지 않음.
        -CLASS => 클래스 파일에 존재. 실행시에 사용불가 . 기본값  <== 잘안쓴다
        -RUTIME => 클래스 파일에 존재. 실행시에 사용가능.

        @DOcumented, @inherited <== 잘 안쓴다
        -javadoc으로 작성한 문서에 포함시키려면 @DOcumented 를 붙인다.
        -애너테이션을 자손 클래스에 상속하고자 할 때 , @inherited를 붙인다.

        @Repeatable
        -반복해서 붙일 수 있는 애너테이션을 정의할 떄 사용
        -@Repeatable이 붙은 애너테이션은 반복해서 붙일 수있다.
        -@Repeatable인 @toDo를 하나로 묶을 컨데이너 애너테이션도 정의 해야함

         */


        /*/
            애너테이션 타입 정의 하기
            -애너테이션을 직접 만들어 쓸 수 있다.
            @interface 애너테이션이름{
                타입 요소이름(); // 애너테이션의 요소를 선언한다.
                }


             -애너테이션의 메서드는 추상메서드이며, 애너테이션을 적용할 때 지정(순서X)

             @interface TestInfo{
                int count();
                String testedBy();
                String[] testTools();
                TestType testType(); // enum TestType {FIRST,FINAL}
                Date Time testDate(); //자신이 아닌 다른 애너테션(@DateTime)을 포함할 수 있다.
                }

                ====> @TestInfo(
                count = 3, testedBy="kim",
                testTools={"JUnit","AutoTester"},
                testType = TestType.FIRST,
                testDate = @DateTime(yymmdd="160101",hhmmss="235959")
                )
                public class NweClass{...}
         */
        /*
        애너테이션의 요소
        -적용시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정 가능(null)제외
            @interface TestInfo{
                int count() default 1;   기본값을 1로 지정
                }

            @TestInfo // <=== @TestInfo(count=1)과 동일
            public class NewClass{...}

       - 요소가 하나이고 이름이 value일 때는 요소의 이름 생략가능
             @interface TestInfo{
                String value();
                }
             @TestInfo ("passed")
            class NewClass{...}
       -요소 타입이 배열인 경우, 괄호{}를 사용해야 한다.
        @interface TestInfo{
            String[] TestTools();
            }

            @Test(testTools = {"JUnit","AutoTester"})
            @Test(testTools = "JUnit")ㅁ
            @Test(testTools = {})     <=== 값이 없을 때는 괄호{}가 반드시 필요

           Annotation은 모든 애너테이션의 조상이지만 상속을 불가!!

           -사실 Annotation은 인터페이스이다.
         */
    }
}
