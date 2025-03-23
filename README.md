# kuke-board
### MSA 게시판

**대규모 데이터와 트래픽을 지탱할 수 있는 시스템을 고려한다.**

**사용자 로그인, 데이터 유효성 검증, 웹 프론트 화면 개발은 제외**

**대규모 데이터와 트래픽을 다루기 위한 핵심 전략만 다룬다.**

**service : 하위 모듈로 각 마이크로서비스를 가진다.** 
   - article : 게시글 서비스
   - comment : 댓글 서비스
   - like : 좋아요 서비스
   - view : 조회수 서비스
   - hot-article : 인기글 서비스
   - article-read : 게시글 조회 서비스 
   - common : 개발 편의를 위한 공통 코드

**게시글 서비스**
- 조회, 생성, 수정, 삭제, 목록 조회 

**댓글 서비스**
- 조회, 생성, 삭제, 목록 조회
- 계층형
- 최대 2 depth
- 무한 depth

**좋아요 서비스**
- 좋아요 수

**조회수 서비스**
- 사용자 별 10분에 1회 집계

**인기글 서비스**
- 일 단위 상위 10건 인기글 선정
- 매일 오전 1시 업데이트
- 댓글수/좋아요수/조회수 기반 점수
- 최근 N일 인기글 내역 조회

**게시글 조회 서비스** 
- 최적화 전략
- 게시글 단건 조회 최적화 전략
- 게시글 목록 조회 최적화 전략
- 캐시 최적화 전략

**Mysql**
- $ docker pull mysql:8.0.38
- $ docker images
- $ docker run --name kuke-board-mysql -e MYSQL_ROOT_PASSWORD={password} -d -p 3306:3306 mysql:8.0.38
- $ docker ps -a
- $ docker start {CONTAINER ID}
- $ docker exec -it kuke-board-mysql bash
- bash-5.1# mysql -u root -p
- Enter password: {password}
- mysql> show databases;
- mysql> use {database};
- mysql> show tables;

**Redis**
- $ docker run --name kuke-board-redis -d -p 6379:6379 redis:7.4