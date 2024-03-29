###

<div align="center">
<img align="center" src="https://user-images.githubusercontent.com/26956570/194744631-f38e6131-0969-48db-b447-b5bc7381fd4b.png" width="400" />  
</div>
<br />
<div align="left">
    <h1 align="left">
      <font align="left" size="6" color="#ffffff"> 👛장보장</font>
    </h1>
  </div>

### 목차

1. [**웹 서비스 소개**](#1)    
2. [**기술 스택**](#2)     
3. [**주요 기능**](#3)      
4. [**프로젝트 구성도**](#4)     
5. [**개발 팀 소개**](#5)       
6. [**개발 기간**](#6)
7. [**Git convention**](#7)
8. [**실행 방법**](#8)
<hr />


<br />
<div id="1"></div>

## ✨ 웹 서비스 소개

### **웹RTC를 이용한 전통시장 라이브 상점**    

> 집에서도 편하게 **온라인으로** 물건을 **직접 골라** 살 수 있어요.    

<br />

<div id="2"></div>

## 🛠 기술 스택


<table align="center">
  <tr>
    <td align="center"><strong>Front-end 기술 스택</strong></td>
    <td>
      <div>
        <img src="https://img.shields.io/badge/Vue.js-3178C6?&logo=vue.js&logoColor=white"/>
        <img src="https://img.shields.io/badge/Axios-5A29E4?style=&logo=Axios&logoColor=white"/>
        <img src="https://img.shields.io/badge/WebRTC-5A29E4?style=&logo=WebRTC&logoColor=white"/>
      </div>
    </td>
  </tr>
  <tr>
    <td align="center"><strong>Back-end 기술 스택</strong></td>
    <td>
        <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=  &logo=springboot&logoColor=white"/>
        <img src="https://img.shields.io/badge/MySQL-4479A1?style=  &logo=mysql&logoColor=white"/>
        <img src="https://img.shields.io/badge/JPA-212121?style=  &logo=jpa&logoColor=white"/>
        <img src="https://img.shields.io/badge/JWT-000000?style=  &logo=JSONWebTokens&logoColor=white"/>
    </td>
  </tr>
  <tr>
    <td align="center"><strong>Server 기술 스택</strong></td>
    <td>
        <img src="https://img.shields.io/badge/NGINX-009639?style=  &logo=nginx&logoColor=white"/>
        <img src="https://img.shields.io/badge/Docker-2496ED?style=  &logo=docker&logoColor=white"/>
        <img src="https://img.shields.io/badge/Jenkins-D24939?style=  &logo=jenkins&logoColor=white"/>
        <img src="https://img.shields.io/badge/AmazonAWS-232F3E?style=  &logo=amazonaws&logoColor=white"/>
        <img src="https://img.shields.io/badge/AmazonS3-569A31?style=  &logo=amazons3&logoColor=white"/>
    </div>
  </tr>
  <tr>
    <td align="center"><strong>배포</strong></td>
    <td>현재는 중단
  </tr>
  <tr>
    <td align="center"><strong>노션</strong></td>
    <td>
      <a href="https://sly-hexagon-e43.notion.site/74c6b74788fc45a9bb116f95732ec3b4">
        👉 노션 바로가기
      </a>
    </td>
  </tr>
</table>

<br />
  
<div id="3"></div>

## 💡 주요 기능

<table align="center">
<thead>
  <tr>
    <td align="center"><strong>화면</strong></th>
    <td align="center"><strong>기능</strong></th>
  </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <img src="" width=250/>
      </td>
      <td>
        <b>시장 검색</b>
        <div>지역, 이름으로 전국에 있는 전통시장 검색을 할 수 있습니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="" width=250/>
      </td>
      <td>
        <b>주문하기</b>
        <div>webRTC 방에 들어가 상점의 아이템을 주문합니다. </div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="" width=250/>
      </td>
      <td>
        <b>호출하기</b>
        <div>문의사항이 있을때 상인을 호출할 수 있습니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="" width=250/>
      </td>
      <td>
        <b>방만들기</b>
        <div>판매자는 방을 만들어 장사를 시작할 수 있습니다. </div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="" width=250/>
      </td>
      <td>
        <b>상점관리</b>
        <div>상점의 정보, 판매할 상품을 입력합니다.</div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="" width=250/>
      </td>
      <td>
        <b>주문서 조회</b>
        <div>WebRtc 라이브 방에서 구매자들이 주문한 내역을 실시간으로 확인 가능합니다. </div>
      </td>
    </tr>
    <tr>
      <td>
        <img src="" width=250/>
      </td>
      <td>
        <b>덤 주기</b>
        <div>판매자는 구매자에게 주문서를 확인하고 덤추가를 할 수 있다.</div>
      </td>
    </tr>
  </tbody>
</table>

<br />
<div id="4"></div>
    
## 📂 프로젝트 구성도

|                                               <div align="center">아키텍쳐(Archtecture)</div>                                                |
| :------------------------------------------------------------------------------------------------------------------------------------------: |
|        <img src="https://user-images.githubusercontent.com/99111030/204457563-cbff0786-43ed-4b59-b84e-184e7a26f523.jpg" width="700"/>        |
|                                                           **개체-관계 모델 (ERD)**                                                           |
| <img src="https://user-images.githubusercontent.com/26956570/203716058-c080d692-1141-499e-8955-03a4826a5fe0.png" height="500" /> |


<br />
<div id="5"></div>


<br />
<div id="5"></div>

## 👨‍👩‍👧‍👦 개발 팀 소개

<table align="center">
  <tr>
    <td align="center" width="150px">
      <a href="https://github.com/PJSliable" target="_blank">
        <img src="https://github.com/PJSliable.png" alt="박종선 프로필" />
      </a>
    </td>
    <td align="center" width="150px">
      <a href="https://github.com/yyhjin" target="_blank">
        <img src="https://github.com/yyhjin.png" alt="윤혜진 프로필" />
      </a>
    </td>
        <td align="center" width="150px">
      <a href="https://github.com/hseol" target="_blank">
        <img src="https://github.com/hseol.png" alt="허설 프로필" />
      </a>
    </td>
    <td align="center" width="150px">
      <a href="https://github.com/KMLEEhub" target="_blank">
        <img src="https://github.com/KMLEEhub.png" alt="이경무 프로필" />
      </a>
    </td>
    <td align="center" width="150px">
      <a href="https://github.com/hh2728" target="_blank">
        <img src="https://github.com/hh2728.png" alt="한재승 프로필" />
      </a>
    </td>
  </tr>
  <tr>
    <td align="center">
      <a href="https://github.com/PJSliable" target="_blank">
        박종선<br />(Back-end &<br /> 팀장)
      </a>
    </td>
        <td align="center">
      <a href="https://github.com/yyhjin">
        윤혜진<br />(Back-end)
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/hseol">
        허설<br />(Back-end)
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/KMLEEhub" target="_blank">
        이경무<br />(Front-end)
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/hh2728" target="_blank">
        한재승<br />(Front-end)
      </a>
    </td>



  </tr>
</table>

<br />
    
<table align="center">
<thead>
  <tr>
    <td align="center"><strong>이름</strong></th>
    <td align="center"><strong>역할</strong></th>
    <td align="center"><strong>개발 내용</strong></th>
  </tr>
</thead>
  <tbody>
    <tr>
      <td>
        박종선
      </td>
      <td>
        Back-end<br />팀장
      </td>
      <td>
          <strong>Back-end</strong><br />- DB 설계<br /> - 회원 (판매자/구매자) 관련 API 작성<br /> - JWT 로그인 구현<br/>
      </td>
    </tr>
    <tr>
      <td>
        윤혜진
      </td>
      <td>
        Back-end
      </td>
      <td>
          <strong>Back-end</strong><br />
          - DB 설계<br /> 
          - 공공API를 활용한 전통시장, 지역 데이터 처리<br /> 
          - Market 관련 API 작성<br/> 
          - Order 관련 API 작성<br/> 
          <strong>Front-end</strong><br />
          - Openvidu 채팅 기능<br/> 
          - 전체적인 디자인 담당
      </td>
    </tr>
    <tr>
      <td>
        허설
      </td>
      <td>
        Back-end
      </td>
      <td>
          <strong>Back-end</strong><br />
          - DB 설계<br /> 
          - Store 관련 API 작성<br /> 
          - Item 관련 API 작성<br/> 
          <strong>CI/CD</strong><br /> 
          - AWS 배포 환경 구축
      </td>
    </tr>
    <tr>
      <td>
        이경무
      </td>
      <td>
        Front-end
      </td>
      <td>
          <strong>Front-end</strong><br />
          - 판매자 회원 관련 기능 구현<br />
          &nbsp;&nbsp;&nbsp;&nbsp;- 메뉴 등록, 가게 등록/오픈, 거래내역<br /> 
          - Openvidu 활용 실시간 화상스토어 구현(판매자)<br />
          &nbsp;&nbsp;&nbsp;&nbsp;- 호출 연결, 덤 증정, 주문 확인
      </td>
    </tr>
    <tr>
      <td>
        한재승
      </td>
      <td>
        Front-end
      </td>
      <td>
          <strong>Front-end</strong><br />
          - 구매자 회원 관련 기능 구현<br />
          &nbsp;&nbsp;&nbsp;&nbsp;- 회원가입, 회원정보 수정, 로그인<br />
          &nbsp;&nbsp;&nbsp;&nbsp;- 시장 검색, 가게 찜 등록<br /> 
          - 판매자 회원 관련 기능 구현<br />
          &nbsp;&nbsp;&nbsp;&nbsp;- 회원가입, 로그인<br /> 
          - Openvidu 활용 실시간 구매 구현(구매자)<br />
          &nbsp;&nbsp;&nbsp;&nbsp;- 메뉴 확인, 주문서 작성 및 신청
      </td>
    </tr>
  </tbody>
</table>

    
<br />
<div id="6"></div>

## 📅 개발 기간

22.07.05. ~ 22.08.19

<br />

<div id="7"></div>
    
## 🦊 git convention

| Emoji | Code                          | 기능     | Description              |
| ----- | ----------------------------- | -------- | ------------------------ |
| ✨    | `:sparkles:`                  | Feat     | 새 기능                  |
| ♻️    | `:recycle:`                   | Refactor | 코드 리팩토링            |
| 🔧    | `:wrench:`                    | Chore    | 리소스 수정/삭제         |
| 🐛    | `:bug:`                       | Fix      | 버그 수정                |
| 📝    | `:memo:`                      | Docs     | 문서 추가/수정           |
| 💄    | `:lipstick:`                  | Style    | UI/스타일 파일 추가/수정 |
| 🎉    | `:tada:`                      | Init     | 프로젝트 시작 / Init     |
| 🔀    | `:twisted_rightwards_arrows:` | Merge    | 브랜치 합병              |
| 👷    | `:construction_worker: `      |          | CI 빌드 시스템 추가/수정 |
| 🚀    | `:rocket:`                    | Deploy   | 배포                     |   
    


<br />
<div id="8"></div>
    
## 💻 실행 방법

### Client 실행

1. **원격 저장소 복제**

```bash
$ git clone https://lab.ssafy.com/s07-webmobile1-sub2/S07P12A602
```

2. **프로젝트 폴더로 이동**

```bash
$ cd frontend
```

3. **필요한 node_modules 설치**

```bash
$ npm install
```

4. **개발 서버 실행**

```bash
$ npm run serve
```

### Server 실행



