<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/aheader.jsp"%>

<!-- 개인정보수정 페이지 -->
<div class="col-md-9">
	<h1>회원정보 수정</h1>
	<form action="">
		<table class="table table-bordered">
			<tr>
				<th>ID</th>
				<td><input class="form-control" type="text" value="aaaaaa"
					readonly></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input class="form-control" type="text"
					placeholder="변경할 비밀번호를 입력하세요."></td>
			</tr>
			<tr>
				<th>비밀번호확인</th>
				<td><input class="form-control" type="text"
					placeholder="비밀번호를 다시 입력하세요."></td>
			</tr>
			<tr>
				<th>E-mail</th>
				<td><input class="form-control" type="text"
					value="aaaaa@aaaa.com" readonly></td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td><input class="form-control" type="text" value="12240204"
					readonly></td>
			</tr>
		</table>
		<input type="submit" value="수정">
	</form>
	<h1>이력서 수정</h1>
	<table class="table table-bordered">
		<tr>
			<th>번호</th>
			<th>이력서 제목</th>
			<th>수정</th>
		</tr>
		<tr>
			<td>3</td>
			<td>신입사원 땡땡땡입니다.</td>
			<td><input type="button" value="수정"></td>
		</tr>
		<tr>
			<td>2</td>
			<td>신입사원 땡땡땡입니다.</td>
			<td><input type="button" value="수정"></td>
		</tr>
		<tr>
			<td>1</td>
			<td>신입사원 땡땡땡입니다.</td>
			<td><input type="button" value="수정"></td>
		</tr>
	</table>
</div>
<!-- //개인정보수정 페이지 -->

<%@include file="../include/cfooter.jsp"%>