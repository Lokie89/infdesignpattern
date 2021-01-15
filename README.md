## 인프런 자바 디자인 패턴

#### 1. 스트레티지 패턴 (Strategy Pattern)
- 여러 알고리즘을 하나의 ***추상적인 접근점***을 만들어 접근 점에서 서로 ***교환 가능***하도록 하는 패턴.
    - strategy.weapon 패키지를 보면 무기가 증가해도 게임 캐릭터는 변경되지 않음을 볼 수 있다.
  
#### 2. 어댑터 패턴 (Adapter pattern)
- 요구사항에 맞춰 변경 할 수 있다.
- 한 클래스의 인터페이스를 클라이언트에서 사용하고자하는 다른 인터페이스로 변환한다.

#### 3. 템플릿 메소드 (Template Method)
- 알고리즘의 ***구조를 메소드에 정의***하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 ***재정의*** 하는 패턴

#### 4. 팩토리 메소드 패턴 (Factory Method Pattern)
- 템플릿 메소드 패턴을 이용하여 부모에서는 구조, 자식에서는 ***어떤 객체를 생성할지 결정*** 하는 패턴

#### 5. 싱글톤 패턴 (Singleton Pattern)
- 하나의 인스턴스를 만들기 위한 패턴

#### 6. 프로토 타입 패턴 (Prototype Pattern)
- ***생산 비용이 높은 인스턴스***를 복사를 통해 쉽게 생성할 수 있도록 하는 패턴
- 복사하는 필드의 ***깊은 복사*** 고려

#### 7. 빌더 패턴 (Builder Pattern)
- 복잡한 단계를 거쳐야 생성되는 ***객체의 구현을 서브 클래스***에게 넘겨주는 패턴
- ***많은 인자를 가진 객체***를 다른 객체의 도움으로 생성하는 패턴

#### 8. 추상 팩토리 패턴 (Abstract Factory Pattern)
- ***팩토리를 추상화*** 시켜 그 객체를 통하여 객체를 생성하는 패턴

#### 9. 브릿지 패턴 (Bridge Pattern)
- 기능 부분과 구현 부분을 분리

#### 10. 컴포짓 패턴 (Composite Pattern)
- 클라이언트가 복합 객체나 단일 객체를 동일하게 취급할 수 있도록 하는 패턴
- 예시에선 폴더와 파일로 예를 들었음