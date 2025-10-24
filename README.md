# java-racingcar-precourse
## 주요 기능
### 1. 자동차 이름, 시도 횟수 입력 안내문 출력 및 사용자 입력
- main 함수에서 실행
- 자동차 이름을 입력하면 carNames 함수 호출
- 시도 횟수를 입력하면 attemptsNum 함수 호출
- initPositions, startRace, findWinners, printWinners 함수를 순차적으로 호출

### 2. 잘못된 자동차 이름 입력에 대한 예외 처리
- carNames 함수에서 실행
- 입력값 carInput가 null, isEmpty, length > 5일 경우 예외 처리
- 잘못된 경우가 아니라면 names 반환

### 3. 잘못된 시도 횟수 입력에 대한 예외 처리
- attemptsNum 함수에서 실행
- 입력값 attemptsInput가 null, isEmpty, < 1일 경우 예외 처리
- 잘못된 경우가 아니라면 attempts 반환

### 4. 자동차 위치 초기화
- initPositions 함수에서 실행
- 입력값 num만큼 반복하며 각 자동차의 positions 리스트에 0을 삽입 후 반환

### 5. 랜덤 이동
- startRace 함수에서 실행
- 입력값 attempts만큼 반복하며 정수 random의 값을 랜덤하게 저장
- move 함수를 호출하고 그 값이 4보다 크거나 같을 때 carPositions의 값을 1 추가하고 저장
- printRoundResult 함수를 호출

### 6. 각 라운드별 결과 출력
- printRoundResult 함수에서 실행
- 입력값 names의 크기만큼 반복하며 carPositions의 수만큼 자동차의 위치를 출력

### 7. 최종 우승자 판별 및 결과 출력
- findWinners 함수에서 실행
- 정수 maxPosition의 값이 carPositions의 값과 같을 경우 우승자로 저장하고 반환

### 8. 결과 출력
- printWinners 함수에서 실행
- 문자열 winner에 winners를 저장한 뒤 이를 출력