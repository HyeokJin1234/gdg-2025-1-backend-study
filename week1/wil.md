회원가입 : POST  /auth/signup

로그인 : POST  /auth/login


전체 할 일 조회 : GET /todo/list

할 일 생성 : POST   /todo

할 일 수정 : PATCH  /todo/{todo_id}

할 일 삭제 : DELETE /todo/{todo_id}

할 일 체크 : POST   /todo/{todo_id}/check

할 일 체크 해제 : POST    /todo/{todo_id}/uncheck


친구 찾기 : GET /users/search?username={query}

팔로우 : POST  /friends/{user_id}/follow

언팔로우 : POST /friends/{user_id}/unfollow

나의 친구 리스트 조회 : GET  /friends

특정 친구의 할 일 조회 : GET /friends/{user_id}/todos
