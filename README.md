#코멘토_직무부트캠프_IT 대기업 현업 개발자와 함께 하는 백엔드 개발 실무

## 주간보고내용 - 1주차

1. 개발환경 셋팅
    - JDK 1.8 설치 및 환경변수 설정
    - Eclipse, Spring 다운로드 및 설치 (이클립스 기반으로 된 STS를 Spring 프레임워크를 공식 사이트에서 설치)
    - 톰캣 설정
      
2. 1주차 활동 내용
    - Hello World 출력 (Spring Lagacy Project 생성 -> pom.xml에서 스프링 버전/JDK버전을 수정 -> 서버 세팅 후 출력)
    - mariaDB, mySql WorkBench 설치 및 샘플 DB 구축
      
              insert into movie(movie_id, movie_name, director, types)
                values(1,'아이언맨','감독1','SF'),
                (2, '스파이더맨','감독2','SF'),
                (3, '라이온킹','감독3','다큐멘터리');
      ![table](https://github.com/lesh0331/comento_leesunghyeon/assets/69080831/c2d303e9-6999-4e19-8c38-d3fbceda1eb2)

      
    - 스프링, Mariadb, MyBatis 연동, 데이터 조회    
  
## 주간보고내용 - 2주차(API 가이드 문서 작성)

1. 요청사항
   - (1) 인터페이스 가이드 문서 작성

   - (2) SW활용률(접속자 수, 부서별 접속자 수, 로그인 요청 수, 게시 글 작성 수)  
         에 필요한 데이터를 해당 내용에 맞게 문서를 작성  
         (요청 파라미터 생각, 응답 데이터 포맷 고려)

2. 2주차 활동 내용
   - (1) 접속자 수에 필요한 데이터 (요청 파라미터, 응답 데이터 포맷) 고려하기
   - 
     (2) 요청 파라미터 :
       
         ㄱ. 접속자 수 조회 : total_user(총 조회된 접속자 수), user_id(ID의 유저 접속현황 조회), period(조회 기간)   
         ㄴ. 부서 별 접속자 수 조회 : department_id(조회된 부서의 ID), department_name(조회된 부서의 이름), total_user(총 조회된 접속자 수), period(조회 기간)   
         ㄷ. 로그인 요청 수 조회 : login_request(총 로그인 요청 수), user_id(ID의 유저 로그인 요청 수 조회), period(조회 기간)   
         ㄹ. 게시글 작성 수 조회 : total_post(총 작성된 게시글 수), user_id(ID의 유저 게시글 작성 수 조회), period(조회 기간)  

   - (3) 응답 데이터 포맷 : JSON



