package site.gaeddocoding.cyworldmini.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/photobook")
    public String photobook() {
        return "/post/photobook";
    }

    @GetMapping("/diary")
    public String diary() {
        return "/post/diary";
    }

    @GetMapping("/guestbook")
    public String guestbook() {
        return "/post/guestbook";
    }
}
