package shop.mtcoding.blog.controller.Board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class BoardController {

    private final BoardRepository boardRepository;

    @PostMapping("/upload")
    public String upload(@RequestParam("imageFile")MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();

        //이미지 경로
        String uploadDir  = "D:\\workspace\\spring_lec\\image-upload-lec\\src\\main\\resources\\images\\image";

        // 이미지 경로와 이미지 원본 파일 이름을 합쳐줌
        String filePath = uploadDir + fileName;


        File dest = new File(filePath);

        file.transferTo(dest);

        //Files.copy(file.getInputStream(), Paths.get(uploadDir).resolve(fileName), StandardCopyOption.REPLACE_EXISTING);


        boardRepository.save(filePath);


        return "redirect:/";
    }
}
