see `https://github.com/eugenp/tutorials/tree/master/spring-5-security-oauth`



<차주 스터디 계획>
- 2/17 (일) 욜로스터디 10:00
- <요구사항> 진행 결과 및 경험 공유.

<요구사항>
1. 기본 로그인 페이지 사용
2. 페이스북, 네이버로 로그인하기 추가
3. 로그인 성공 시 메인페이지(/)로 이동
4. 웹 페이지 구현 (thymeleaf 사용 권장)
   / -> 메인페이지 (단순 환영 메시지)
   /notice -> 공지사항페이지 (단순 공지 메시지)
   /mypage -> 마이페이지 (로그인한 사용자의 username, access_token 정보 표시)
5. 웹 페이지 접근 권한 설정
   / -> 모든 사용자
   /notice -> 모든 사용자
   /mypage -> 로그인 된 사용자

(옵션) 1. 로그인 시 사용자 정보 저장하기
(옵션) 2. 구글, 깃헙, OKTA 등으로 로그인하기 추가


<차주 추가 학습 내용>
- JWT (https://blog.outsider.ne.kr/1160)
  * 한번 읽어만 보시면 됩니다.
- 대칭키&공개키 (https://opentutorials.org/course/228/4894)
  * 대칭키, 공개키 부분만 한번 들어 보시면 되고 나머지 내용은 들어보시면 보안에 대한 새로운 눈이 떠질 겁니다. 아마.
- OPEN ID CONNECTOR (https://openid.net/connect/)
  * OPEN ID CONNECTOR 는 제가 한번 파악해보고 공유 하겠습니다.