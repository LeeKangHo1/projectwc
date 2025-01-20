<p align="center">
  <img src="https://github.com/user-attachments/assets/042778ff-b7ff-48e0-9442-fdee3f957e68">
</p>
<h1 align="center">
  이상형 월드컵 프로젝트
</h1>

## 이상형 월드컵이란?
- 월드컵과 같이 토너먼트 방식으로 자신이 선호하는 것을 선택하여 최종적으로 이상형을 찾는 게임
## 시연 영상
https://github.com/user-attachments/assets/bf41954b-0794-49dc-a8c0-cf4de64ad952
## 팀원 소개
- 이학석(팀장) [<img src="https://img.shields.io/badge/Git-이학석-red?logo=GITHUb">](https://github.com/HSLee1013)
- 이강호 [<img src="https://img.shields.io/badge/Git-이강호-green?logo=GITHUb">](https://github.com/LeeKangHo1) 
- 임영록 [<img src="https://img.shields.io/badge/Git-임영록-blue?logo=GITHUb">](https://github.com/Young14482) 
- 구예은 [<img src="https://img.shields.io/badge/Git-구예은-orange?logo=GITHUb">](https://github.com/goho11)
## 기술 스택
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white"><img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"><img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"><img src="https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML" /><img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css&logoColor=white"><img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white">
### 협업도구
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"><img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white"><img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">
### 데이터베이스
<img src="https://img.shields.io/badge/H2-FF4000?style=for-the-badge&logo=H2&logoColor=white"><img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL"/>
### 프로젝트 기간
- 2024년 12월 2일 ~ 2024년 12월 18일
## 목차
### 1. 담당 업무 및 문제 해결
- 월드컵 목록(메인 화면), 내가 만든 월드컵 화면
- DB 설계
- 댓글 기능
- 회원 관련 기능
### 2. 팀 공동 작업 (프로젝트 설계)
- 사이트맵
- 초기 업무 분배
- 팀 노션 관리
### 3. 프로그램 기능
- 월드컵 만들기
- 월드컵 게임 플레이
- 월드컵 랭킹
---
## 1. 담당 업무 및 문제 해결
- ### 1) 월드컵 목록(메인 화면), 내가 만든 월드컵 화면
	![메인화면](https://github.com/user-attachments/assets/545aa253-e130-475d-9323-6297b974b4f4)
	- Bootstrap 라이브러리를 활용
		- 목적: 사용자에게 익숙한 구성 요소 포함, 사용 용이성, 반응형 디자인 적용( [사용한 코드 링크](https://inblog.ai/devleekangho/36904))
	- 월드컵 제목으로 검색
		- 검색어 입력 후 키보드의 Enter 버튼을 눌러도 검색 가능 ([사용한 코드 링크](https://inblog.ai/devleekangho/%EC%9D%B4%EC%83%81%ED%98%95-%EC%9B%94%EB%93%9C%EC%BB%B5-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%82%AC%EC%9A%A9-%EA%B8%B0%EC%88%A0-%EA%B2%80%EC%83%89%EC%96%B4-%EC%9E%85%EB%A0%A5-%ED%9B%84-%EC%97%94%ED%84%B0%ED%82%A4%EB%A1%9C-%EA%B2%80%EC%83%89-39377))
		- 인기순, 최신순 버튼으로 정렬 가능
	- 1페이지에 월드컵 10개 표시하는 pagination 적용 ([사용한 코드 링크](https://inblog.ai/devleekangho/%EC%9D%B4%EC%83%81%ED%98%95-%EC%9B%94%EB%93%9C%EC%BB%B5-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%82%AC%EC%9A%A9-%EA%B8%B0%EC%88%A0-pagination-39376))
	![로그인 전 네브바](https://github.com/user-attachments/assets/f7e350c6-3b8d-4002-9cca-9f3bd9cd1d73)
	![로그인 후 네브바](https://github.com/user-attachments/assets/942351b9-6e6c-43c3-be2b-6d357c621b23)
	- 로그인 여부에 따라 상단 navigation bar 메뉴 동적 변화
		- 회원 정보를 자바 스크립트를 통해 비동기 통신
		- 간단한 코드임에도 문제 발생
		- `conssole.log` 를 코드 사이에 배치 후 확인
		- 회원 데이터는 `response.body`에 있었는데 `response`에서 가져오는 바람에 발생한 문제
		- [자세한 이야기 링크](https://inblog.ai/devleekangho/%EC%9D%B4%EC%83%81%ED%98%95-%EC%9B%94%EB%93%9C%EC%BB%B5-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%AC%B8%EC%A0%9C-%ED%95%B4%EA%B2%B0-%EB%B9%84%EB%8F%99%EA%B8%B0%EB%A1%9C-%EC%9C%A0%EC%A0%80-%EC%A0%95%EB%B3%B4-%EB%B0%9B%EB%8B%A4%EA%B0%80-%EB%B0%9C%EC%83%9D%ED%95%9C-%EB%AC%B8%EC%A0%9C-39382)

	![내가 만든 월드컵 화면](https://github.com/user-attachments/assets/d63a1b09-cc5d-40ae-b619-2e5649fa4705)
	- 메인 화면을 재사용하여 내가 만든 월드컵 화면도 작업

- ### 2) DB 설계
	![ERD 최종](https://github.com/user-attachments/assets/4d2e82e9-ba59-4949-902e-a9d1f3b038b4)
	- 회원과 관련된 테이블, 월드컵과 관련된 테이블, 댓글 테이블까지 총 7개의 테이블을 사용
- #### DB 설계 중 겪은 어려움
	- 초기 DB 설계 과정에서 월드컵 경기 정보 엔티티와 월드컵 플레이 정보를 저장하는 엔티티 간의 상호 의존 관계가 발생
	- 복잡해진 DB 관계 정리를 위해 처음부터 재설계
	- 사용자가 홈페이지를 이용하는 시나리오를 진행하면서 명사(유저, 월드컵)와 관련된 테이블을 먼저 생성하고 동사(월드컵 플레이)를 외래키로 연결된 중간테이블로 생성
	- ###### 결과: 깔끔하게 1 : N 으로 연결된 DB 완성
	- [자세한 이야기 링크](https://inblog.ai/devleekangho/%EC%9D%B4%EC%83%81%ED%98%95-%EC%9B%94%EB%93%9C%EC%BB%B5-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%AC%B8%EC%A0%9C-%ED%95%B4%EA%B2%B0-db-%EC%84%A4%EA%B3%84-%ED%94%84%EB%A1%A0%ED%8A%B8%EC%97%90%EC%84%9C-%EC%98%A4%EB%8A%94-%EC%A0%95%EB%B3%B4%EB%A5%BC-%EA%B2%80%EC%A6%9D%ED%95%B4%EC%84%9C-%EB%B0%B1%EC%84%9C%EB%B2%84%EC%97%90-%EB%B0%98%EC%98%81-39380)

- ### 3) 댓글 기능
	![댓글 2](https://github.com/user-attachments/assets/cc1ab7f9-f715-4e7d-839f-7ea1c946d83b)
	- 댓글 작성 가능
	- 자신이 작성한 댓글만 삭제 버튼 노출 ([사용한 코드 링크](https://inblog.ai/devleekangho/%EC%9D%B4%EC%83%81%ED%98%95-%EC%9B%94%EB%93%9C%EC%BB%B5-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%82%AC%EC%9A%A9-%EA%B8%B0%EC%88%A0-mustache-%EC%97%90%EC%84%9C-%EC%A1%B0%EA%B1%B4%EB%AC%B8-39378))
	- 1 page에 댓글 20개만 나오도록 설정
- #### 댓글 관련 Repository 메서드 테스트 중 발생한 문제
	- delete 쿼리문을 작성 후 테스트 과정에서 댓글 삭제가 되지 않는 문제 발생
	- JPA 라이브러리와 관련된 영속성 컨텍스트의 캐싱에 대해 머리로는 이해하고 있었으나 실제 코드에 적용하지 못한 상황
	- 하이버네이트의 쿼리문 출력 기능과 `System.out.println` 을 활용 문제 해결
	- [자세한 이야기 링크](https://inblog.ai/devleekangho/%EC%9D%B4%EC%83%81%ED%98%95-%EC%9B%94%EB%93%9C%EC%BB%B5-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%AC%B8%EC%A0%9C-%ED%95%B4%EA%B2%B0-comment-%EC%82%AD%EC%A0%9C-%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%A4%91-%EB%AC%B8%EC%A0%9C-%EC%98%81%EC%86%8D%EC%84%B1-%EC%BB%A8%ED%85%8D%EC%8A%A4%ED%8A%B8-%EA%B4%80%EB%A0%A8-39381)

- ### 4) 회원 관련 CRUD
	- 스프링 시큐리티 라이브러리 활용
		- 목적: 회원 인증 및 권한 부여, 유연성을 통한 커스터마이즈 
		- [사용한 코드 링크](https://inblog.ai/devleekangho/%EC%9D%B4%EC%83%81%ED%98%95-%EC%9B%94%EB%93%9C%EC%BB%B5-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%82%AC%EC%9A%A9-%EA%B8%B0%EC%88%A0-%EC%8B%9C%ED%81%90%EB%A6%AC%ED%8B%B0-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EB%A1%9C%EA%B7%B8%EC%95%84%EC%9B%83-%EC%84%A4%EC%A0%95-39379)
	![화원 정보 수정2](https://github.com/user-attachments/assets/7db83503-5c10-460e-bc28-12dae1cfff96)
	- 비밀번호 변경을 체크하면 변경할 비밀번호 입력 가능
	- 탈퇴하기 버튼 클릭시 다이얼로그로 경고창 활성화

## 2. 팀 공동 작업 (프로젝트 설계)
- ### 사이트맵
	![project wc sitemap](https://github.com/user-attachments/assets/93af0014-58a7-41a7-ad10-0bde83dbc40a)

- ### 초기 업무 분배
	![최초 업무 분배](https://github.com/user-attachments/assets/4bf1e7fc-6d6a-44f7-93ea-7e6ecbb8334a)

- ### 팀 노션 관리
	![팀 노션 문서 관리](https://github.com/user-attachments/assets/806f2e39-e107-4d31-a123-ff465c173ddf)

## 3. 프로그램 기능
- ### 월드컵 만들기
	![월드컵 만들기](https://github.com/user-attachments/assets/2123b601-09e7-45b5-b517-fdb8fd0a8800)
	- DropZone 이미지 업로드 : 드래그 앤 드롭으로 이미지 추가/변경
	- 비동기 통신 : 월드컵 정보 및 이미지 수정

- ### 월드컵 게임 플레이
	![월드컵 플레이](https://github.com/user-attachments/assets/c4a02b85-79dc-4948-a8b5-87b89e4d2d3a)
	- 두 이미지 중 선택된 이미지만 승리
	- 클릭 시 승자와 패자 데이터를 숨겨진 폼에 설정
	- 데이터를 서버에 제출하여 다음 라운드 진행

- ### 월드컵 랭킹
	![랭킹 화면](https://github.com/user-attachments/assets/ec218b12-5c88-4ca5-8467-a38e116f710a)
	- 서버에서 이미지 목록 동적 로딩
	- 정렬 : 이름, 우승비율, 승률
	- 이미지 이름으로 검색
	- 댓글 기능

---
## Authors
- 이강호
- 깃허브 닉네임: LeeKangHo1
- [깃허브 프로필 링크](https://github.com/LeeKangHo1)
