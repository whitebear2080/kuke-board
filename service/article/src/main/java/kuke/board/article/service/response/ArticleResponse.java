package kuke.board.article.service.response;

import kuke.board.article.entity.Article;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class ArticleResponse {
    private Long articleId;
    private String title;
    private String content;
    private Long boardId;
    private Long writerId;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public static ArticleResponse from (Article artice) {
        ArticleResponse response = new ArticleResponse();
        response.articleId = artice.getArticleId();
        response.title = artice.getTitle();
        response.content = artice.getContent();
        response.boardId = artice.getBoardId();
        response.writerId = artice.getWriterId();
        response.createdAt = artice.getCreatedAt();
        response.modifiedAt = artice.getModifiedAt();
        return response;
    }
}
