<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="nav">
	<c:forEach var="${categoryList }" items="${category }">
		<c:if test="${category.size >1 }">
			<li data-model="${category.name }" data-cid="${category.id }"><c:forEach
					var="${category }" items="${cate }">
					<a href="${cate.url }+""+${cate.id}">${category.cateName }
					<i class="iconfont icon-unfold"></i></a>
				</c:forEach></li>
		</c:if>
		<c:if test="${category.size == 1 }">
			<li data-model="${category.name }" data-cid="${category.id }"><a
				href="${category.url }+"/"+${category.id }">${category.cateName }</a></li>
		</c:if>
	</c:forEach>

	<%-- <ul>
    <li data-model="index" data-cid="0"><a href="/">首页</a></li>
    <li data-model="article" data-cid="18"><a href="${pageContext.request.contextPath}/list/news.jsp">新闻</a></li>
    <li data-model="article" data-cid="19">
        <a href="${pageContext.request.contextPath}/list/article.jsp">专栏<i class="iconfont icon-unfold"></i></a>
        <div class="subnav">
        <a href="/list/article/20-1/">洛言洛语</a><a href="${pageContext.request.contextPath}/list/article.jsp">名宿点评</a><a href="/list/article/24-1/">专业球评</a>        </div>
    </li>
    <li data-model="video" data-cid="0">
        <a href="/list/video/0-1/">视频<i class="iconfont icon-unfold"></i></a>
        <div class="subnav">
        <a href="/list/video/26-1/">赛后采访</a><a href="/list/video/28-1/">球队动态</a><a href="/list/video/27-1/">幕后故事</a><a href="/list/video/25-1/">球家大事记</a>        </div>
    </li>
    <li data-model="info" data-cid="23"><a href="/list/info/23-1/">流言</a></li>
    <li data-model="game" data-cid="0"><a href="https://www.maiyapai.com/" target="_blank">比赛</a></li>
    </ul> --%>
</div>