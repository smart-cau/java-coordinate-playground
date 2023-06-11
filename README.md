# 좌표 계산기
## 선 길이
### 기능 요구사항
---
* 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
* 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
* X, Y좌표 모두 최대 24까지만 입력할 수 있다.
* 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
* 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
* 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 * '-' 문자로 구분한다.
* 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.

### 내 코드와 다른 점
    * 모든 정적인 값은 static constant로 관리. 에러 메세지까지!
    * 입력과 객체의 생성에 대한 자세한 validation 진행
    * try - catch와 error resilience 있는 구현
    * 코드를 여러 method로 작고 명확하게 쪼갬
    * model 객체들을 각각의 개념에 부합하게 equals() method를 재정의 함
    * interface로 다형성 확보와 abstract class로 중복을 제거함
    * domain을 확실히 분리
        * 내 코드 = 사용자 입력과 points 생성은 서로 도메인이 다름에도 Points에서 한번에 진행
        * 여기 코드 = 사용자 입력에 대한 검증과 points 생성을 위한 과정을 InputView에서 진행
    * `Function interface`를 활용해 메서드 또는 생성자를 일급 객체로 활용해 유연한 코드 작성

### todo
---
* model
    * Figure(interface)
    * AbstractFigure implements Figure
    * Point
    * Points
    * Line extends AbstractFigure
    * Rectangle extends AbstractFigure
    * Triangle extends AbstractFigure
* view
    * InputView
    * OutputView
* controller
    * CoordinateCalculatorController

### 기능 요구사항
---
우리 회사는 렌터카를 운영하고 있다. 현재 보유하고 있는 차량은 Sonata 2대, Avante 1대, K5 2대로 총 5대의 차량을 보유하고 있다.
우리 회사는 고객이 인터넷으로부터 예약할 때 여행할 목적지의 대략적인 이동거리를 입력 받는다. 이 이동거리를 활용해 차량 별로 필요한 연료를 주입한다.

차량 별로 주입해야 할 연료량을 확인할 수 있는 보고서를 생성해야 한다.

각 차량별 연비는 다음과 같다.
* Sonata : 10km/리터
* Avante : 15km/리터
* K5 : 13km/리터

## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
