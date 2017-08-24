<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/mytag.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/jqPaginator.js"></script>
<script>
	$(document).ready(function(){
		$('#lb').jqPaginator({
		    totalPages: 100,
		    visiblePages: 10,
		    currentPage: 1,
		    onPageChange: function (num, type) {
		        $('#text').html('当前第' + num + '页');
		    }
		});
	});
</script>


</head>

<body>
	<h1>这是个分页测试页面</h1>
	<div >
	<p id="text"></p>
	<ul id="lb" class="pagination"></ul>
	</div>
</body>
</html>