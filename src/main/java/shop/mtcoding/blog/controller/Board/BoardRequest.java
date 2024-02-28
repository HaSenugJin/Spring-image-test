package shop.mtcoding.blog.controller.Board;

import lombok.Data;

public class BoardRequest {

    @Data
    public static class SaveDTO {
        private String fileName;
    }
}
