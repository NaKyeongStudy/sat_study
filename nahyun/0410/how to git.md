<h1>0410 study</h1>
------
<h2>Git 작업의 흐름</h2>
1. Github에 저장소 작성 - git init 
  or 복제 - git clone
  2. 파일의 작성, 편집
  3. 파일의 생성, 변경, 삭제를 git 인덱스에 추가 - git add
  4. 변경 결과를 로컬 저장소에 커밋 - git commit
  5. 로컬 저장소를 푸쉬해 뭔격 저장소에 반영 -git push


  <h2>details</h2>

  1. mkdir 
        - 새로운 디렉토리(폴더)를 만드는 명령
  2. cd 
        - 디렉토리를 이동하는 명령
  3. git branch 
        - 현재 브랜치 목록을 살펴보는 명령 - 현재 브랜치에는 *가 붙는다.
  4. git branch (생성할 브랜치 이름) 
        - 브랜치 만드는 명령
  5. git checkout (이동할 브랜치) 
        - 지점의 이동 
        - 이후 git branch를 하면 *가 이동한 브랜치 앞에 붙는다.
  6. vi 
        - branch안에 파일 만들기
  7. git add 
        - vi로 만든 파일을 인덱스에 추가 
        - 인덱스는 저장소에 커밋 할 준비를 하기 위해 변경 내용을 임시로 저장할 위치
  8. git commit -m "코멘트 내용"
        - 인덱스에 추가 된 파일을 커밋
        - 커밋은 파일이나 디렉토리의 추가 또는 변경을 저장소에 기록하는 작업
  9. git status 
        - 저장소에 파일이 추가, 삭제되었는지 확인
        - 파일 상태 확인
  10. ls 
        - 로컬 파일 목록 보기
        - ```
            $ ls
            README.md  hi.txt
  10. git push origin (branch name) 
        - 로컬 저장소의 변경사항을 GitHub에 있는 원격 저장소에 반영하기 위해 실행하는 명령
  11. git merge 
        - 두 개의 브랜치를 합치는 명령
        - git checkout master 후 git merge nahyun을 하면 master에 nahyun의 파일이 저장된다.
  13. git push 
        - 원격 저장소에 로컬 저장소의 변경사항이 반영된다.
  14. git pull
        - 다른 개발자가 공동 개발을 하기 위해 원격 브랜치의 코드를 가져오는 명령
  15. git branch -d (branch name) 
        - 사용하지 않는 브랜치 제거
  16. git grep "검색 단어"
        - 저장소의 파일 내용에서 검색하고자 할 때 사용하는 명령어