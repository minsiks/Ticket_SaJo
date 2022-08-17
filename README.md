# 티켓사조
![바탕화면](https://user-images.githubusercontent.com/103159709/184810334-a816ed71-3eb4-4f15-bc84-ca7898fe1de0.png)

팀명: 티켓 사조  
<img src= https://user-images.githubusercontent.com/103159709/184799023-c1061898-d659-42ed-8f74-a01ffe5fd1b9.png width=350px, height=400px, align='right'>

팀장: 김민식

팀원: 안원영, 장효준, 정세연

## 프로젝트 정보

### 1. 프로젝트 주제
Spring boot를 활용한 클래식 영화관 티켓팅 서비스 및 NCP AI 플랫폼을 활용한 고객편의기능 구현

### 2. 프로젝트 목적

1. 클라우드 환경 사용
2. 자리 예매 기능 구현
3. AI Platform(CLOVA OCR)을 활용한 영수증사지을 이용한 적립금 기능 구현
4. AI Platform(CLOVA CFR)을 활용한 닮은 꼴 배우 찾기 이벤트 페이지 구현
5. 네이버, 구글, 페이스북 등 다양한 로그인 API를 활용한 로그인 기능 구현

### 3. 프로젝트 기능 구현
1. 영화 좌석 선택 및 예약
2. AI를 활용한 영수증 인식 후 포인트 적립, 적립 내역 조회 기능
3. 로그인 API(OAuth) 사용해 로그인 및 회원가입 기능
4. 결제 API 기능 
5. 영화 필터 검색 기능
6. 성별, 나이 정보를 바탕으로 통계표 기능
7. 리뷰, 평점 기능
8. CLOVA Face Recognition(CFR)을 이용한 닮은 꼴 배루 찾지 이벤트 페이지 구현

### 4. 프로젝트 역할 분담 
| 이름 | 역할 |
|------------|-----------|
| 김민식 |영화 상세 페이지(통계차트), 영화리스트 페이지, CHATBOT, Contact Us 페이지(구글맵, 문의사항 메일로 전송), CLOVA Face Recognition (CFR), Admin 페이지 (고객/영화/스케줄/쿠폰/포인트 관리, 예매내역 조회, 로그인, 회원가입) &nbsp; &nbsp;  &nbsp; &nbsp; |
| 안원영 |로그인 API(**OAuth**), NCP AI CLOVA OCR* (쿠폰 or 적립), 리뷰 순위 페이지, 포인트 적립, 메인 페이지(서치 기능), Admin 페이지(메인 페이지에 차트), &nbsp; 쿠폰|
| 장효준 | 예매(좌석선택, 극장선택, 시간선택), 결제 API, Admin 페이지(스케줄 관리)|
| 정세연 |회원가입, 일반 로그인, MyPage(나의 예매내역, 내 포인트 내역 조회, 내 쿠폰 내역 조회, 회원탈퇴, 회원정보변경, 비밀번호 변경)|

### 5. 프로젝트 개발 환경 및 수행 도구
![화면 캡처 2022-08-01 114948](https://user-images.githubusercontent.com/103159709/182062696-fb7c4078-a73f-46af-97bc-cb2e0dcefc03.png)

언어 | 웹 | 개발도구 | DataBase | 협업도구 | FrameWork
---- | ---- | ---- | ---- | ---- | ---- |
JAVA, SQL &nbsp; &nbsp; &nbsp;| HTML5, CSS3, JS, jQuery, Ajax, Bootstrap, Thymeleaf | Eclipse, NCP &nbsp; &nbsp; &nbsp;| Mysql | Zoom, Google Docs, Github, ERD Cloud,Padlet, Notion | Spring Boot, Mybatis |

### 6. 데이터베이스 설계
ERD: [티켓사조](https://www.erdcloud.com/d/Gb6vzq6LdsJjFpduL)

![image](https://user-images.githubusercontent.com/103159709/184797326-65c2fdbf-d780-4300-92f2-82b4862eb04b.png)

### 7. UI 설계
![ui](https://user-images.githubusercontent.com/103159709/184812812-b5a0ff9e-75f3-4f1f-9a9f-d7f16a952bf0.png)

---- 
## 프로젝트 결과 
### 1. 회원가입 화면

* 어느 한 칸이라도 빈칸일 시 '필수황목입니다.' 메세지 띄우기
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184588880-29ea09d4-cfc3-466e-848f-b8bc7b8feef8.png></p>

* Ajax를 이용해 데이터베이스에 동일한 아이디가 존재하는지 비교
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184589002-c80c26bd-6c9c-4dc3-a74f-1ee2141f0560.png></p>

* 비밀번호 조건 미충족 시 '보안에 취약합니다. 5자리 이상이어야 합니다.' 메세지 띄우기
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184589156-f0efc88c-cc86-4211-a7d9-1932b155fffa.png></p>

* 비밀번호 확인: 위 비밀번호와 일치하지 않을 시 '일치하지 않습니다. 비밀번호를 다시 입력해주세요.' 메세지 띄우기
 <p align="center"><img src= https://user-images.githubusercontent.com/103159709/184589362-0eacb31c-ea22-45c7-b38c-cb2f8c03ad15.png></p>

* 어느 한 조건이라도 미충족 시 회원가입 불가
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184760219-bd68774e-0b20-482f-8555-91dcf2e6568c.png></p>
<p align="center><img src= https://user-images.githubusercontent.com/103159709/184760297-f6981d67-44bb-4f9f-88c2-919dcfcd3897.png></p>

### 2. 로그인 화면 

#### 로그인 성공 전 메인 화면
 <p align="center"><img src= https://user-images.githubusercontent.com/103159709/184587001-baaed115-59d8-4e4e-8124-9526465136d4.png></p>

#### 로그인 실패 시 화면 
* 데이터베이스에 저장된 아이디와 비밀번호 값과 일치하면 로그인 성공 후 메인 페이지로 이동 / 일치하지 않을 시 하단에 '아이디 또는 비밀번호를 잘못 입력했습니다. 입력하신 내용을 다시 확인해주세요.' 메세지 띄우기
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184592866-08a3b2cd-30a8-42ad-a89e-fe404d2816f2.png></p>

#### 로그인 성공 시 메인 화면 
 <p align="center"><img src= https://user-images.githubusercontent.com/103159709/184587306-a4b96cc2-fa53-469d-b7b4-a25f4fd4b4df.png></p>

### 3. 마이페이지

* 로그인 성공 시에만 화면에 보여짐
* 로그인한 아이디값에 따른 정보 불러옴(쿠폰내역, 포인트 내역, 예매내역, 회원정보)

<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184587770-8cf97d89-0dd1-4ff6-89f6-ad2fc66b738b.png></p>

#### 포인트 내역
* 사용 가능한 포인트 정보 띄우기
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184595968-e627815a-412c-48db-b3a5-d48bd0528aec.png></p>

#### 쿠폰 내역
* 발급 받은 쿠폰 정보 띄우기(사용한 쿠폰일 경우 사용한 날짜 표시)
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184596083-4617f312-9d24-414b-b6d3-09a962682b7f.png></p>

#### 예매 내역
* 예매 내역에 따른 정보 띄우기
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184596605-065fa7eb-465e-428c-9793-e7f4a037ecd8.png></p>

* 마이페이지에서 예매번호 누르면 예매 정보 화면으로 간편하게 넘어감
<p align="center"><im src= https://user-images.githubusercontent.com/103159709/184600810-59bbd238-0341-4345-bd61-9738070a071b.png></p>

* 마이페이지에서 영화제목(ex싸이코) 누르면 티켓이 나옴
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184601356-d75746c2-6539-4a90-8299-e07aa5c8029c.png></p>

#### 회원수정
* 회원정보 수정(아이디는 readonly로 수정 불가 / 이름만 변경 가능)
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184606779-b6c7dfee-b872-4dab-81f6-64ca158dc24d.png></p>

* 수정 완료 시 확인창 띄우기

<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184603639-24e37648-b21a-49ba-9a12-ee0ee9e75aab.png></p>

#### 비밀번호 변경
* 빈칸이 있을 시 submit불가

<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184757308-9b5dca19-4b83-41d6-b3db-92fe5c322e2b.png></p>

* 현재 사용중인 비밀번호와 같은 비밀번호로 바꿀 시 '사용불가: 비밀번호 재작성이 필요합니다.' 메세지 띄우기
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184757134-746fbf45-6c71-4426-8e20-3d8c70e046ea.png></p>

* 새 비밀번호와 새 비밀번호 확인이 불일치 시 alert창 띄우기

<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184757465-499668ef-deb9-4f82-aa23-6bb433971f93.png></p>

#### 회원탈퇴
* 비밀번호 입력 안하고 탈퇴 버튼 누를 시 '비밀번호를 다시 확인해주세요' 메세지 띄우기
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184588051-364001e8-ad64-4b91-9625-012369aa7c5d.png></p>

* 현재 사용중인 비밀번호와 일치하지 않을 시 회원탈퇴 불가 / 오류 메세지 띄우기
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184606049-c357f2f1-57c4-4ce1-87ec-8242f6640e36.png></p>

* 회원탈퇴 성공 시 'used'필드 값 변경(완전 삭제 ×/ 0: 탈퇴한 계정, 1: 사용 중인 계정) 
<p align="center"><img src= https://user-images.githubusercontent.com/103159709/184588283-c7794aaf-8c7e-4fde-a7ba-b9c5cd2fda95.png></p>







# 안
## 메인 Page

### 상단 슬라이드

- 영화관에서 필요한 규칙이나 현재 상영하고 있는 인기있는 영화들의 포스터와 영상을 이용해 손쉽게 흥미를 가질 수 있도록 구현했습니다. 

  <p align="center"><img src= https://user-images.githubusercontent.com/103159709/185009011-8d5de0a7-22c3-40e8-bfa0-e3b626435146.png></p>

  <p align="center"><img src= https://user-images.githubusercontent.com/103159709/185009103-b6e67171-0fcd-4be8-b4b9-ed19a16fb38d.png></p>

### 평점 높은영화 순 정렬 6개. 

- 평점순으로 영화를 정렬하여 상위 6개의 영화를 추려 보여줍니다. 

  - 평점과 간단한 영화 정보를 볼 수 있으며 해당 포스터를 클릭했을 경우 해당 영화의 상세 페이지로 연결됩니다. 

- 반응형 웹이 적용되어있어 화면의 크기에 따라 보여지는 영화 포스터의 갯수와 형태가 달라집니다. 

- "오늘의 상영작 확인하러가기" 를 누르게되면 포커스가 "오늘 상영 영화"로 이동합니다. 

  <img src= https://user-images.githubusercontent.com/103159709/185009156-c509dd9d-5c01-4e03-8405-db73d7f52f11.png>

  <img src= https://user-images.githubusercontent.com/103159709/185009168-fd3303ea-e791-45e8-a214-ab8d60ca95e8.png>

  <img src= https://user-images.githubusercontent.com/103159709/185009173-30cd1730-0780-4459-a88a-dd09f58e4bb8.png width="400" height="600">

### 영화 검색기능

- 장르, 배우, 감독, 국가 별 검색기능을 제공합니다.

  - 각 검색기능에 따라 이미지, 추천 키워드, 버튼내용을 다르게 적용하였습니다. 
  - 검색을 누르게 되면 동적 SQL 문을 이용하여 선택한 태마에 따른 검색 결과를 보여줍니다. 

- 장르 선택했을 경우 

  <img src= https://user-images.githubusercontent.com/103159709/185009448-55d2d0e7-8952-4d19-8669-f7682d1490b4.png">

  <img src= https://user-images.githubusercontent.com/103159709/185009455-6f9a56ba-07f8-4191-a995-e383dffef0b0.png>

- 나라 선택했을 경우 

  <img src= https://user-images.githubusercontent.com/103159709/185009461-bf0a4a46-0121-40cb-83ff-bc5a7561963f.png>

  <img src= https://user-images.githubusercontent.com/103159709/185009463-7360b3a8-3042-4144-967c-57ccb3220ae9.png>

- 만약 아무런 정보가 없을경우 정보없다고 띄워주는 페이지

  <img src= https://user-images.githubusercontent.com/103159709/185009610-cb92f866-259f-45c1-ac3c-138150d6376e.png>

### 오늘의 상영작

- 해당 요일에 상영되는 영화정보를 가져와 출력

  - 상영 영화가 없으면 없다고 표시.
  - 상영 영화가 있다면  간단한 영화 정보,별점과 포스터를 표시해 직관적으로 볼 수 있도록 함

- 영화 포스터나 제목을 눌렀을 경우 해당 영화의 상세 페이지로 넘어감 

- 반응형 웹을 이용해 포스터를 표시. -> 모바일 말고 화면 줄이는것도 다른화면됨

- 오늘 상영 영화가 없는 경우 

  <img src= https://user-images.githubusercontent.com/103159709/185009651-51d2db94-5a0a-4459-b964-34246d254ed8.png>

- 오늘 상영영화가 있는 경우 

  <img src= https://user-images.githubusercontent.com/103159709/185009655-7132871c-c241-4ea3-8d1e-ab992485c55a.png>

- 영화 상세 페이지 이동

  <img src= https://user-images.githubusercontent.com/103159709/185009656-60469e37-8616-4667-894c-06a9686c562b.png>

- 반응형 웹 적용

  <img src= https://user-images.githubusercontent.com/103159709/185009756-ae330481-17d4-499e-b009-2f1ec6081bbf.png>

  <img src= https://user-images.githubusercontent.com/103159709/185009661-94da6b13-3c1e-4ee1-bd48-1020fe252df5.png>

### 영화에 대해 궁금한 것 검색

- google search를 통해 movie에 대한 정보를 검색합니다.

- 새창을 띄워 검색한 키워드를 google에 서치해줍니다.

  <img src= https://user-images.githubusercontent.com/103159709/185009814-bd79a949-f1e4-48ad-bca9-91387cc0bdc9.png>

  <img src= https://user-images.githubusercontent.com/103159709/185009817-b220e094-0541-48bd-b30b-ec87cbe43f50.png>



## 영화  - 평점 랭킹 Page

### 영화 순위 정렬

- sql 문을 이용해 평점 랭킹 순으로 모든 영화를 정렬하여 정보를 가져옵니다.

- 영화를 클릭하면 해당 영화 detail 페이지로 넘어갈 수 있습니다.

  <img src= https://user-images.githubusercontent.com/103159709/185009891-57a65569-6905-44b8-9c8e-115b2de3f1c0.png>

### 페이징 기법 사용

- sql문의 limit을이용한 paging 기법을 통해 평점순으로 5개씩 나눠서 보여줍니다.

- 첫번째 페이지에서는 "이전" 버튼이 활성화되지 않도록 하였고, 마지막 페이지에서도 "다음" 버튼의 활성화를 막았습니다.

  <img src= https://user-images.githubusercontent.com/103159709/185009892-5273f7f8-d0af-4a79-aaff-2aea81674dcf.png>

  <img src= https://user-images.githubusercontent.com/103159709/185009896-4b489197-1937-430d-abb1-53a6a6c408b6.png>



## 이벤트 - 쿠폰발급 Page

### 로그인 전

- 현재 날짜를 기준으로 진행중인 쿠폰만 볼 수 있도록 만들었다.

  - 쿠폰은 보기 쉽도록 할인 가격이 높은 순으로 정렬했다. 

- 쿠폰 발급을 누르면 모달을 이용해 "발급받겠습니까? " 를 물어보고 발급버튼을 누르면 로그인이 되어있는지 체크한다. 

  - 로그인이 되어있으면 해당 아이디로 쿠폰발급을 진행하고 만약 비로그인이라면 로그인을 할것인지 물어보는 모달창을 띄운다. 
  - 로그인 버튼을 누르면 로그인 페이지로 넘어가게 되고, 이때 **_request.getHeader("Referer")_**  를 이용하여 모든 페이지에서 로그인페이지로 들어갔을 경우 이전 페이지를 기억하여 돌아갈 수 있도록 구현했다. 

  <img src= https://user-images.githubusercontent.com/103159709/185010057-658c5ea0-7a44-42f9-9873-362c98680923.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010062-c9f13cc7-ff07-427c-b531-5fdd1c624daa.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010020-06251a55-afc2-4963-a7e5-e3a3813bbb32.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010025-bbaa007f-0e56-410d-83ea-9d8fd9d4cb62.png>

### 로그인 후 

- 로그인이 완료되면 "보유중 or 발급가능" 문구를 통해 로그인한 아이디에서 발급받을 수 있는 쿠폰을 직관적으로 구분할 수 있도록 제작하였다. 

  - 만약 보유중 쿠폰을 다시 발급받았다면 "발급실패" 모달을 통해 요청을 취소한다. "발급가능" 쿠폰을 클릭했을 경우 정상적으로 발급되고 "close " 버튼을 누르면 페이지를 리로드 시킨다. 

- 반응형 웹으로 제작했다. 

  <img src= https://user-images.githubusercontent.com/103159709/185010026-8f677e88-925a-4620-aef1-ec52c39804a5.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010027-81cfff2f-b954-460e-86fd-e5e47607bcad.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010029-ffa6318c-3ade-4519-af8d-abd529d5f6be.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010032-97ba5ae0-cee3-4354-a6aa-1ad90a15706c.png>

  

## 이벤트 - 포인트 적립 Page

### NCP OCR 

- 표를 현장발권했을 경우 추가적으로 적립할 수 있도록 영수증 적립 이벤트를 구현했다. 

- 해당 페이지에서는 NCP 에서 제공하는 CLOVE OCR 기능을 이용했다. 

  <img src= https://user-images.githubusercontent.com/103159709/185010324-e7c83b51-2eb8-4da2-ac75-8a53ea414066.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010277-243bfb0b-ce99-42ee-b2b1-b0332d3cc0be.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010280-610b5d8e-3de3-4235-b600-4df997289867.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010553-f1bb103c-4d89-44c6-9054-6fc1bd0eb913.png width="200px" hight="500">

### 영수증 검사

- 영수증 검사 버튼을 눌러 OCR 기능을 이용해 업로드된 사진의 영수증 텍스트들을 인식하여 이용할 수 있는 영수증인지 판별한다. 

- 이때 판별이 끝나면 결과를 알려주는 텍스트로 자동 스크롤 되도록 구현하였다. 

- 이용할 수 있는 영수증이라면 적립가능하도록 하였고, 만약 조건에 맞지않는 영수증 ( 영수증 상단 이름, 발급일이 7일이상 지난 날짜) 이라면 적립버튼을 활성화 하지 않는다. 

  <img src= https://user-images.githubusercontent.com/103159709/185010294-f48b9c9b-4597-4db8-b65d-96bba0414c75.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010260-38d5d478-c29f-4eea-874b-6c321f1b8ed8.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010269-c80b142b-8c5a-4f2c-ab45-8e7207bb03c9.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010271-49d4ce0a-ae64-43b2-9d27-bd3bbcbb63cf.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010273-53fa136e-f9e1-4eab-b86f-f29b7da17c6e.png>

  

### 포인트 지급 

- 만약 조건에 만족하는 영수증이라면 영수증 금액의 5% 를 포인트로 지급한다. 

- 또한 같은 영수증을 연속적으로 사용할 수 있는 문제를 방지하여 바코드 번호를 관리하는 테이블을 만들어 중복 적립을 피할 수 있다. 

  <img src= https://user-images.githubusercontent.com/103159709/185010604-631dd809-35f9-4ba2-8ba9-a524a65fa21b.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010609-d2dc491f-5412-48eb-9441-a197c217dd82.png>



## 로그인 - 플랫폼 로그인 Page

> [Spring boot OAuth 2 모든 내용 정리](https://github.com/wonyoung0207/Spring-boot-Security-OAuth-2.0)

### 참고 강의 

1. [Spring boot Security 구현 강의](https://www.inflearn.com/course/스프링부트-시큐리티/dashboard)
   - [깃허브 자료](https://github.com/codingspecialist/-Springboot-Security-OAuth2.0-V3)
2. [유튜브 강의-나도코딩](https://opentutorials.org/course/2473/16571)
3. [생활코딩 OAuth ](https://www.inflearn.com/course/web2-oauth2/unit/36283?tab=curriculum) 
4. [참고 유튜브 강의](https://www.youtube.com/watch?v=9ui2i-SgBpk)
5. [내용 참고 ](https://deeplify.dev/back-end/spring/oauth2-social-login)

- 플랫폼 로그인 구현은 Spring boot 에서 제공하고 있는 OAuth2.0 기능을 이용했다. 
- Spring boot 에서 제공하는 OAuth 를 사용하여 각종 소셜 플랫폼에 등록되어있는 로그인 API 기능들을 이용하여 플랫폼 아이디로 로그인 할 수 있도록 만들었다. 
- OAuth 를 이용하면서 가장 어려움이 컸던것은 보안문제 였다. 보안으로 인해 8번의 과정을 거처 사용자 정보들을 받아올 수 있었다.
- 자세한 내용은 [Spring boot OAuth 2.0 정리](https://github.com/wonyoung0207/Spring-boot-Security-OAuth-2.0) 이곳에서 볼 수 있다. 

### Spring boot Security 구조

<img src= https://user-images.githubusercontent.com/103159709/185010683-078b8b8a-c0f4-4594-9427-b80bb8a0147c.png>

1. **_사용자( Owner )_** 가 client 와 연결된다.
   - client는 내가 개발하는 web, app 이다. 
2. 플랫폼 로그인 진행시 **_Client_** 의 화면에서 사용자에게 Resorce Server 로 요청하기 위한 **계정 동의** 를 구한다. -> 동의 버튼은 **_Resorce Server_** 로 연결되어 있어 바로 3번이 진행된다. 
   - Resorce Server 는 신뢰할 수 있는 기업인 google, naver, Kakao 같은 server 를 뜻한다. 
   - 계정 동의는 해당 플랫폼의 id, password로 로그인하는것을 뜻한다. 
3. 동의를 구하면 Resorce Server 로 계정 인증 내용을 보낸다. 
4. Resorce Server 가 인증요청을 받고 **_Client에서 필요로 하는 정보 ( Scope List )_** 가 무엇인지 사용자에게 보여준다. 사용할 정보 리스트( Scope List ) 를 가지고 Client가 이용할 수 있도록 허락하는지 사용자에게 물어본다. 
   - scope List 의 내용을 사용자가 허락할 것인지 창으로 보여준다. 
5. 이때 동의 버튼을 클릭하면  Resorce Server 가 Client에게 사용자의 정보 ( Scope List ) 를 볼 수 있도록 허락하는  **_비밀번호 ( Code )_** 를 보낸다. 
   - 따라서 Code에는 사용자가 자신의 정보를 볼 수 있도록 Client에게 권한을 줬다는 것을 뜻한다. 
6. Client가 Resorce Server 로부터 받은 Code를 **_Client id, Client secretKey_** 와 함께 묶어 다시 Resorce Server 로 보낸다. 
   - Resorce Server 는 전달받은 3가지의 정보 ( Code와 해당 클라이언트 id. SecretKey) 가 맞는지 판단한다.
7. Resorce Server 가 판단을 통해 Client에게 **_Access Token_** 을 보내준다. 
   - Access Token을 가지고 Client는 해당 사용자가 허락한 범위 내에서 정보를 열람할 수있다. 
8. Client 는 Access Token을 가지고 API를 사용할 수 있다.

### 결과화면 

- 로그인은 **"google 로그인 버튼 클릭 -> 계정 선택 -> 데이터 정보 요구 동의 -> 로그인"**  순서로 진행된다. 

  <img src= https://user-images.githubusercontent.com/103159709/185010724-fe27b407-0b5d-4700-aa55-4b5fee720a69.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010726-9aaa8b2a-3002-4991-93a9-9f415352f6b3.png>

  <img src= https://user-images.githubusercontent.com/103159709/185010730-98bb987b-8483-42a7-bb88-641540594f3f.png>

- 소셜 API 콘솔에 들어가면 만든 TicketSajo 어플리케이션이 존재한다. 

 ![login_social4](https://user-images.githubusercontent.com/103174607/185018052-da7020a8-970b-4181-8f49-6b04d8709e3f.png)

 ![login_social5](https://user-images.githubusercontent.com/103174607/185018091-382410ab-ffba-4de4-8ce6-4e05a08152c0.png)

![login_social6](https://user-images.githubusercontent.com/103174607/185018119-d9d31bec-d062-49e1-9481-98c6bea2e887.png)

- 로그인이 완료되면 다음 데이터를 받아와 세션에 사용자 정보를 저장한다. 

  ```java
  google 로그인 요청
  getAttributes : {sub=xxx, name=안원영, given_name=원영, family_name=안, picture=https://xxx, email=xxx@gmail.com, email_verified=true, locale=ko}
  principalDetails : CustVO(id=xxx@gmail.com, pwd=0000, name=안원영, birth=Wed Feb 07 00:00:00 KST 1996, point=0, sex=men, used=true, usepoint=0)
  ```

# 김민식
 ### 1. 영화 목록 페이지

![mlist](https://user-images.githubusercontent.com/103174607/185018349-a8b287b2-8950-4fe1-84dd-c24b9cd05a91.png)



![mlist2](https://user-images.githubusercontent.com/103174607/185018420-8dafb69d-7fb8-45e9-9901-ed8f99900548.png)

![mlist1](https://user-images.githubusercontent.com/103174607/185018375-c0ea07cb-d555-447b-b304-52f7c8cafdc2.png) ![modaltotal](https://user-images.githubusercontent.com/103174607/185018395-ca0d43aa-6917-4aef-bf53-12d30ae932d7.png)

- 상영 영화 데이터 연동, 화면에 노출
- AJAX로 각 예약 스케쥴 날짜 선택 시 날짜별 표시 (해당 영화의 날짜별 상영관, 스케줄 등 비동기식 정보 가져와서 노출) 
- 각 전체, 개봉일 오래된 순, 별점 순, 리뷰많은 순, 상영중인 영화 기준으로 정렬 기능 구현
- 페이징 기능 구현 (최초의 페이지에선 이전 버튼을 표시하지 않음, 정렬마다도 페이징 가능)

- 리뷰 별점 데이터 연동해서 CSS활용 별점 퍼센트로 채우기 기능 구현
- 각 영화당 리뷰, 동영상, 포스터 이미지 아이콘 클릭시 모달로 정보 표시 기능 구현

### 2. 영화 상세 페이지

#### 2-1 영화 상세 정보 (정보, 차트)

![detail](https://user-images.githubusercontent.com/103174607/185018505-21f513a4-b839-4162-8afe-85e628dc138e.png)

![detail1](https://user-images.githubusercontent.com/103174607/185018530-67ff1ae4-052d-415b-aab5-85d51aae4b13.png)

- 해당 영화에 대한 정보 및 리뷰와 사진 및 동영상 등 상세정보 표시 기능 구현
- 차트 기능 구현 (연령별, 성별별 차트 기능 구현)
- 슬라이드를 이용 영화 포스터를 노출, 드래그시 이동 가능
- 각 슬라이드 마다 클릭시 이벤트 다르게 기능 구현

#### 2-2 첫번째 슬라이드

![slide1](https://user-images.githubusercontent.com/103174607/185018583-7fb6ee2d-50e6-44cc-a4bb-1767971bd3d8.png)

- 첫번째 슬라이드를 클릭할 때 발생하는 이벤트
- 데이터 속 영화 제목과 유튜브를 연동하여 유튜브에서 해당 영화 제목으로 검색 한다.

#### 2-3 두번째 슬라이드

![slide2](https://user-images.githubusercontent.com/103174607/185018595-2b6104ed-9053-4cf2-8fd9-b0677c956c4d.png)

- 각 영화들 마다 티저 영상이나, 예고편을 보여준다.
- 모달이 닫히면 영상도 자동으로 정지된다.

#### 2-4 그외 슬라이드

![slide3](https://user-images.githubusercontent.com/103174607/185018613-520aba9a-c667-47dd-84cb-5feb5203977b.png)

- 포스터 이미지와 그 외의 해당 영화의 관련된 이미지 정보들을 노출
- 슬라이드, carousel 기능으로 화살표 클릭시 돌아가면서 이미지 노출

#### 2-5 리뷰 표시 및 리뷰 남기기 기능 ![detail2](https://user-images.githubusercontent.com/103174607/185018868-42c3faa2-4207-4059-a346-46a726ce5ff1.png)

![detail3](https://user-images.githubusercontent.com/103174607/185018637-84e9c1f2-3860-4588-af82-648432deeda4.png)

- 리뷰 표시 (n일전, 날짜 및 요일, 이름(아이디), 리뷰 내용, 별점 개수)
- 로그인 비활성화시 리뷰 남기기란 표시 X (리뷰 작성 불가)
- 로그인 활성화시 별점 체크 후 리뷰 작성 가능 (남은 글자 수 표시)

#### 2-6 구글맵 연동 및 토글 기능 추가 (영화관 위치 표시)

![detail4](https://user-images.githubusercontent.com/103174607/185018718-2957c959-f836-4c3a-bf5d-4a6e45a4cfaf.png)

- 구글맵 연동 및 영화관 위치 표시
- 영화 상세 페이지 안에서 토글로 구글맵을 열고 닫을 수 있는 기능 구현

### 3. Contact 페이지

#### 3-1 연락처 표시 및 문의사항 접수(폼으로 이메일 전송)

![contact1](https://user-images.githubusercontent.com/103174607/185018745-475fdb46-8e4b-4587-a928-2563a54b5572.png)

![contact2](https://user-images.githubusercontent.com/103174607/185018758-ac9c9bf0-9178-4efc-9969-a59561030f25.png)

![contact3](https://user-images.githubusercontent.com/103174607/185018797-5c8e6e3f-ebea-403b-874c-14575cfac060.png)

- 컨택트 (사용자 문의 및 편의 기능 위주) 페이지 기능 구현
- 정적 HTML form태그에서 메일 보내기 : Google Apps Mail 
- 해당 폼에 문의 내용과 이름, 이메일을 기입하여 전송 버튼을 누를시, 구글 스프레드시트를 통하여 직접적으로 설정된 이메일로 정보들이 전송
- 설정된 이메일에서 전송된 정보 확인 가능
- 성공시 성공메시지 Fade In 표시 기능 구현

#### 3-2 구글맵 연동

![contact4](https://user-images.githubusercontent.com/103174607/185018905-2bb7b3e9-5aff-4209-b0b2-a80819b100d2.png)

![contact5](https://user-images.githubusercontent.com/103174607/185018929-bd24184e-7b35-48e2-a7cc-8faed5292f43.png)

![contact6](https://user-images.githubusercontent.com/103174607/185018954-241ecd78-e243-4748-9c5c-bef2703d4675.png)

- 컨택트 페이지 하단에 구글맵 연동하여 표시
- 해당 영화관위치가 마커 아이콘으로 표시 (BOUNCE 애니메이션 효과 추가)
- 마커 아이콘 클릭시 맵이 축소되며 상세 위치정보 표시 이벤트 추가
- 해당 a태그를 클릭하면 직접적인 구글 맵으로 이동하여 정보 확인 가능

### 4.  닮은꼴 찾기 이벤트 페이지

#### 4-1 유명배우 사진,영상 팝업으로 표시 기능 구현

![cfr](https://user-images.githubusercontent.com/103174607/185018989-c9fce63f-556b-42a9-ac82-0e1620a7e56a.png)

![cfr1](https://user-images.githubusercontent.com/103174607/185019012-79edefb0-4036-4b71-a528-1a003f38e77f.png)

![cfr2](https://user-images.githubusercontent.com/103174607/185019036-e1606e13-7690-4296-abfb-b6e1fd93f7ea.png)

- 페이지가 심심하지 않기위해 유명 배우 사진을 나열
- 해당 이미지를 클릭할시 사진 아이콘은 해당 배우의 사진이, 영상 아이콘은 해당 배우 관련 유튜브 영상을 볼 수 있는 기능 구현

#### 4-2 Naver AI CLOVA를 활용 얼굴 인식 및 닮은꼴 찾기 기능 구현

![cfr3](https://user-images.githubusercontent.com/103174607/185019059-0fe6e0dc-a33d-43eb-b5a2-ce37dae1b2fa.png)

![cfr4](https://user-images.githubusercontent.com/103174607/185019093-d31f7a84-785d-48c0-a48b-a0993d48b580.png)

![cfr5](https://user-images.githubusercontent.com/103174607/185019111-2babc821-0c82-4b32-abe3-48ec5e468d90.png)

![cfr6](https://user-images.githubusercontent.com/103174607/185019140-95da7759-f4dc-4948-b85b-7a1724097412.png)

- Naver CLOVA Face Recognition API(이하 CFR API) 활용 기능 구현
- 입력한 이미지 데이터의 얼굴 인식 결과를 json 형태로 반환하는 서비스를 제공
- 사진파일 입력과 동시에 화면에 표시
- 반환된 json 형태의 데이터를 정제하여 표시된 이미지 하단에 정보 표시
- a링크 클릭시 해당 관련인물 구글 이미지 검색 페이지로 이동
- 얼굴이 아닌 사진, 너무 많은 얼굴이 많은 사진 등 입력된 사진 데이터가 불안정하다면 '사진을 한번 더 확인해 주세요'라는 문구 'Fade In'으로 노출

### 5. ChatBot

![chatbot](https://user-images.githubusercontent.com/103174607/185019157-8ffbb16c-ead7-4ba9-af79-d7d70b556fcd.png)

![chatbot1](https://user-images.githubusercontent.com/103174607/185019182-57479a37-ba3c-420b-877d-99da39335085.png)

![chatbot2](https://user-images.githubusercontent.com/103174607/185019207-d0215f2c-dbcb-4e4a-bc44-1171dbdd00d4.png)

- Naver CLOVA ChatBot을 활용 고객 편의 기능 구현
- 헤더에 챗봇문의 버튼 추가, 버튼 클릭시 모달로 챗봇 이벤트 발생(클릭시 웹소켓 커넥트)
- 모달 발생시 자동으로 메세지 발생, 질문 유도
- 질문 입력시 챗봇에게 받은 데이터를 화면에서 출력
- 챗봇 대화 빌드 작성 및 공통메시지(실패메시지) 작성
- 모달 닫힐 시 웹소켓 디스커넥트 이벤트 발생

### 6. 사용자 화면 UI 1차 변경 및 정리, 구성

![UI2](https://user-images.githubusercontent.com/103174607/185019262-0f1ebc6d-7c6d-4660-a159-6b5e2b9efdca.png)

![UI3](https://user-images.githubusercontent.com/103174607/185019297-bff50282-367a-41b3-95fc-e1c8c76cdecc.png)

- 기존 프로젝트의 테마 UI
![UI](https://user-images.githubusercontent.com/103174607/185019238-27979e34-7238-4b0c-b592-9c716b5d4cb1.png)

![UI4](https://user-images.githubusercontent.com/103174607/185019321-0efc6cdc-6e9b-44dc-ac28-6dcc7da54616.png)

- 1차적으로 포스터 위치, 크기, 전체 주제에 맞는 컬러 선정, 폰트 선정

- 화면을 효과적으로 구성하기 위해 그라데이션, div 크기 재설정, 이미지 및 영상 추가 등 시도

- 테마의 CSS 변경 (버튼 컬러, 폰트 컬러 및 크기,  백그라운드 이미지 재설정 등)
