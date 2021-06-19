# 2021.05.22

1. 계획
    - 웹 개발
        - back
            - 어떤 model을 사용할지 구조 만들기
        - front
            - UI 멘탈잡고 좀 만들어 보기

2. 공부 내용
    - django 오늘 한거 정리
        - ```django-admin startproject {projectname}```
            - project 생성
        - ```python3 manage.py runserver```
            - server 서버 시작
        - ```python3 manage.py startapp {appname}```
            - app 생성
            - app 생성 했으면 settings.py 가서 INSTALLED_APPS에 추가해줘야함
        - migrate
            - 적용되지 않은 migration을 적용
        - makemigrations
            - migration만듦
        - model 만들때 models.DateTimeField와 ```from django.utils import timezone```
        이용하여 시간 저장 가능 캘린더 만들때 잘 쓸것으로 보인다.
        - ```__str__(self):```
            - 테스트 할때 편할거 같당
        