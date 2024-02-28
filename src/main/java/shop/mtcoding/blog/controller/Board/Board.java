package shop.mtcoding.blog.controller.Board;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="board_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Board {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;
    private String fileName;
}
