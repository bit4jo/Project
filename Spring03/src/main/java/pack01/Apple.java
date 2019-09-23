package pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//방법 1
//@RestController
//public class Apple {
//  @RequestMapping("/")
//  public String root() {
//    System.out.println("방법1 Apple Call");
//    return "Apple Call";
//  }
//}

//방법 2
//@Controller
//public class Apple {
//  @ResponseBody
//  @RequestMapping("/")
//  public String root() {
//    System.out.println("방법2 Apple Call");
//    return "Apple Call";
//  }
//}

@Controller
public class Apple {
  @RequestMapping("/")
  public String f1() { // 함수 이름을 확 바꾸었다.
    System.out.println("곧 index.jsp 실행");
    return "index";
  }
  
  @RequestMapping("/t2")
  public String f2() { // 함수 이름을 확 바꾸었다.
    System.out.println("나는 t2");
    return "t2";
  }
}


