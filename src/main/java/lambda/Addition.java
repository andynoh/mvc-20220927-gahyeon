package lambda;

@FunctionalInterface //메소드 하나만 정의하도록 함 //람다 인터페이스 만들시 필수
public interface Addition {
    public int add(int[] numbers);

}
