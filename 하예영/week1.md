# Welcome Page 만들기

- 스프링부트가 제공하는 Welcome Page 기능

  - static/index.html을 올려두면 Welcome page 기능을 제공한다.

  '''
  <!DOCTYPE html>
  <html>
  <head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
  </head>
  <body>
    Hello
    <a href="/hello">hello</a>
  </body>
  </html>
  '''

* 위의 파일은 그냥 정적 페이지이다. 정적 페이지란 위의 파일을 단지 그대로 웹 서버가 웹 브라우저에게 넘겨주는 것이다.
* 하지만 이제 템플릿 엔진이란 것을 쓰면 위의 페이지를 원하는 대로 루프를 넣거나 해서 모양을 바꿀 수 있다. 우리가 사용할 템플릿 엔진은 thymeleaf이다.
