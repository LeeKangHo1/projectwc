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
### 1. 프로젝트 설계([이동](#1-프로젝트-설계))
- 사이트맵
- ERD
- 초기 업무 분배
- 팀 노션 관리
### 2. 주요 기능([이동](#2-주요-기능))
- 월드컵 목록(메인 화면)
- 월드컵 만들기
- 월드컵 게임 플레이
- 월드컵 랭킹
### 3. 담당 업무([이동](#3-담당-업무))
- 월드컵 목록(메인 화면), 내가 만든 월드컵 화면
- 로그인 여부에 따라 상단 navigation bar 메뉴 동적 변화
- 월드컵 랭킹에서 댓글 기능
- 회원 정보 수정 화면
---
## 1. 프로젝트 설계
- ### 사이트맵
![project wc sitemap](https://github.com/user-attachments/assets/93af0014-58a7-41a7-ad10-0bde83dbc40a)

- ### ERD
![ERD 최종](https://github.com/user-attachments/assets/4d2e82e9-ba59-4949-902e-a9d1f3b038b4)

- ### 초기 업무 분배
![최초 업무 분배](https://github.com/user-attachments/assets/4bf1e7fc-6d6a-44f7-93ea-7e6ecbb8334a)

- ### 팀 노션 관리
![팀 노션 문서 관리](https://github.com/user-attachments/assets/806f2e39-e107-4d31-a123-ff465c173ddf)

## 2. 주요 기능
### 월드컵 목록 
- 정렬 : 인기순, 최신순 
- 월드컵 제목으로 검색
![메인화면](https://github.com/user-attachments/assets/545aa253-e130-475d-9323-6297b974b4f4)

### 월드컵 만들기
- DropZone 이미지 업로드 : 드래그 앤 드롭으로 이미지 추가/변경
- 비동기 통신 : 월드컵 정보 및 이미지 수정
![월드컵 만들기](https://github.com/user-attachments/assets/2123b601-09e7-45b5-b517-fdb8fd0a8800)

### 월드컵 게임 플레이
- 두 이미지 중 선택된 이미지만 승리
- 클릭 시 승자와 패자 데이터를 숨겨진 폼에 설정
- 데이터를 서버에 제출하여 다음 라운드 진행
![월드컵 플레이](https://github.com/user-attachments/assets/c4a02b85-79dc-4948-a8b5-87b89e4d2d3a)

### 월드컵 랭킹
- 서버에서 이미지 목록 동적 로딩
- 정렬 : 이름, 우승비율, 승률
- 이미지 이름으로 검색
- 댓글 기능
![랭킹 화면](https://github.com/user-attachments/assets/ec218b12-5c88-4ca5-8467-a38e116f710a)

## 3. 담당 업무
### 월드컵 목록(메인 화면), 내가 만든 월드컵 화면
- 인기순, 최신순 정렬
- 월드컵 제목으로 검색
- 1페이지에 월드컵 10개 표시하는 pagination
![내가 만든 월드컵 화면](https://github.com/user-attachments/assets/d63a1b09-cc5d-40ae-b619-2e5649fa4705)

### 로그인 여부에 따라 상단 navigation bar 메뉴 동적 변화
![로그인 전 네브바](https://github.com/user-attachments/assets/f7e350c6-3b8d-4002-9cca-9f3bd9cd1d73)
![로그인 후 네브바](https://github.com/user-attachments/assets/942351b9-6e6c-43c3-be2b-6d357c621b23)

### 월드컵 랭킹에서 댓글 기능
- 자신이 작성한 댓글만 삭제 버튼 노출
- 1page에 댓글 20개

![댓글 2](https://github.com/user-attachments/assets/cc1ab7f9-f715-4e7d-839f-7ea1c946d83b)

### 회원 정보 수정 화면
![화원 정보 수정2](https://github.com/user-attachments/assets/7db83503-5c10-460e-bc28-12dae1cfff96)

