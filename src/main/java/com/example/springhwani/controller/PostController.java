package com.example.springhwani.controller;

import com.example.springhwani.domain.Post;
import com.example.springhwani.domain.PostService;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

// 게시글 컨트롤러 클래스
public class PostController {
    private PostService postService = new PostService();

    // 게시글 작성 요청 처리
    public void createPost(Request request, Response response) {
        // 폼 데이터를 받아와서 Post 객체를 생성
        Post post = new Post();
        post.setTitle(request.getParameter("title"));
        post.setContent(request.getParameter("content"));

        // 게시글 작성 서비스 호출
        postService.createPost(post);

        // 작성 결과 페이지로 이동

    }

    // 게시글 수정 요청 처리
    public void updatePost(Request request, Response response) {
        // 폼 데이터를 받아와서 Post 객체를 생성
        Post post = new Post();
        post.setId(Integer.parseInt(request.getParameter("id")));
        post.setTitle(request.getParameter("title"));
        post.setContent(request.getParameter("content"));

        // 게시글 수정 서비스 호출
        postService.updatePost(post);

        // 수정 결과 페이지로 이동

    }

    // 게시글 삭제 요청 처리
    public void deletePost(Request request, Response response) {
        int postId = Integer.parseInt(request.getParameter("id"));

        // 게시글 삭제 서비스 호출
        postService.deletePost(postId);

        // 삭제 결과 페이지로 이동

    }
}
