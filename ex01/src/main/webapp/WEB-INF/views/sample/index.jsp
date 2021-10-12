<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/sample/header.jsp"/>

        <div id="container">
            <h2>관리자 정보</h2>
            <from action="" name="" method="">
                <table  id="detail" border="1">
                    <tr>
                        <td>아이디</td>
                        <td>아이디 받아오기</td>
                    </tr>
                    <tr>
                        <td>비밀번호</td>
                        <td>비밀번호 받아오기</td>
                    </tr>
                    <tr>
                        <td>이름</td>
                        <td>이름 받아오기</td>
                    </tr>
                    <tr>
                        <td>생년월일</td>
                        <td>생년월일 받아오기</td>
                    </tr>
                    <tr>
                        <td>성별</td>
                        <td>성별 받아오기</td>
                    </tr>
                    <tr>
                        <td>이메일</td>
                        <td>이메일 받아오기</td>
                    </tr>
                </table>
                <div class="btns">
                    <button type="button"><a href="#">회원정보 수정</a></button>
                    <button type="button" class="withdrawal">회원탈퇴</button>
                </div>
            </from>
        </div><!--#container-->
</body>
</html>