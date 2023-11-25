#코멘토_직무부트캠프_IT 대기업 현업 개발자와 함께 하는 백엔드 개발 실무

## 주간보고내용 (주말안에 데이터 조회까지 완료하겠습니다. 늦어서 죄송합니다)

1. 개발환경 셋팅
    - JDK 1.8 설치 및 환경변수 설정
    - Eclipse, Spring 다운로드 및 설치 (이클립스 기반으로 된 STS를 Spring 프레임 워크 사이트에서 설치)
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

