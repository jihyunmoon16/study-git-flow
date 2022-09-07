# study-git-flow
깃 플로우 연습


## Git-flow에는 5가지 종류의 브랜치가 존재
- 항상 유지되는 메인 브랜치(master, develop)
- 머지 후 삭제하는 보조 브랜치(feature, release, hotfix)
1. master
2. develop
3. feature
4. release
5. hotfix


### 정해야 할 것
- [ ] 브랜치 이름을 이름으로 할 건지 기능별로 할 건지
-> initial commit 하자마자 dev 만들고 사람별로 브랜치 만들기 또는 기능별로

- [ ] 커밋 메시지 규칙 정해야 함
- GUI는 소스트리 사용
- github flow 사용 예정
- public으로 레포 생성




### git 명령어
```
git init => git 디렉토리 시작
git add *
git commit
git push

git checkout => 브랜치의 상태로 디렉토리를 변경함
git branch {name} => 새로운 브랜치 만듬
git reset --hard HEAD => 마지막 커밋으로 모든 것을 되돌림
git merge {branch-name} => 현재 체크아웃된 브랜치를 기준으로 name을 머지함.

git branch {name} => name branch 생성
git checkout -b {name} => name branch 생성하고, 이곳으로 checkout
git branch -d {name} => name branch 삭제
git branch -a => remote, local branch 모두 보기
git push --delete {remote name} {branch} => remote에서 branch 삭제
git branch --contains {SHA} => 이 커밋이 포함된 branch 찾기
```



**깃 공부 사이트**
- https://learngitbranching.js.org/?locale=ko
- https://backlog.com/git-tutorial/kr/
- https://opentutorials.org/course/2708



**참고자료**

- 우아한Tech:
  - https://www.youtube.com/watch?v=wtsr5keXUyE
  - https://www.youtube.com/watch?v=jeaf8OXYO1g

- 우아한테코톡 무중단배포
  - https://www.youtube.com/watch?v=sIPU_VkrguI&ab_channel=%EC%9A%B0%EC%95%84%ED%95%9CTech

- 깃 커밋메시지 규칙
 - https://creampuffy.tistory.com/129
 



**비고**

나중에 파일 깃헙에 업로드 할때 
gitignore.io 사용 
이때, java, eclipse, 인텔리제이, mavan 을 작성해준다. 

-> 무중단 배포 git actions 사용
-> github protect 기능 설정 (develop하고 master) ??
