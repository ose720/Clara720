package com.example.initproject.controller;

//외장 라이브러리 호출(import), gradle로 설치한 라이브러리
import com.example.initproject.domain.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//내장 라이브러리 호출 (import)
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class BoardController {

    static ArrayList<Board> board_array = new ArrayList<Board>();
    static int count = 0;

    //@GetMapping 또는 @PostMapping은 @RequestMapping의 자식 클래이다
    //@RequestMapping의 기능을 모두 쓸 수 있다
    //자식클래스 어노테이션이 아닌 부모클래스 어노테이션을 쓰는 이유는 기능의 한정을 통해서
    //서버의 리소스 감소 및 보안을 위해서 이다
    @GetMapping("insertBoard")
    public String insertBoard() {
        return "insertBoard";
    }

    //[클라이언트]html form태그의 method속성의 값인 post를 인식하여 아래의
    //@PostMapping에 연결
    @PostMapping("insertBoard")
    public String insertBoard(
            @RequestParam("title") String title,
            @RequestParam("writer") String writer,
            @RequestParam("content") String content,
            Model model) {
        Board board = new Board();

        board.setSeq((long) ++count);
        board.setTitle(title);
        board.setWriter(writer);
        board.setContent(content);
        board.setCreateDate(new Date());
        board.setCnt(0L);
        board_array.add(board);

        //redirect : 페이지 전환 이동
        //redirect:getBoardList : getBoardList 페이지로 이동
        return "redirect:getBoardList";
    }


    //@어노테이션은 메서드 혹은 클래스에 속성, 정의를 해서 스프링이나 자바에서 찾기 쉽도록 해주는 선언부
    //예) @Override 은 부모 메서드를 재정의하여 사용한다고 자바나 스프링에게 속성 명시
    //@RequestParam : [클라이언트]에서 string문자열을 [서버]에 전달하는 매개변수 선언
    //@RequestParam("title")String title에서 ("title")은 [클라이언트]의 name이라는 속성로써
    //key값을 매개변수를 전달
    @RequestMapping("getBoard")
    public String getBoard(
            @RequestParam("seq") long seq,
            Model model) {
        for(Board board : board_array) {
            if(board.getSeq() == seq) {
                model.addAttribute("board", board);
            }
        }
        return "getBoard";
    }


    //@RequestMapping은 [서버]에서 디스페처서블릿을 통해 [클라이언트]html의 action태그의 주소와 동일한
    //문자열을 찾는 매핑기능(연결)이 실행되고 하단에 메서드가 실행
    //return String인 이유는 뷰리졸버가 html파일을 찾기 위한 문자열을 리턴
    @RequestMapping("/getBoardList")
    public String getBoardList(Model model) {
        //List 타입으로 Board객체를 넣는 boardList변수명 선언
        // = (대입연산자) heap메모리에 Arraylist타입으로 할당
        //List는 ArrayList의 부모클래스
        List<Board> boardList = new ArrayList<Board>();

        //title_array.size()로 게시판 글이 1개이상일 경우에만 model에 데이터 입력하여
        //[클라이언트]에 전달

        model.addAttribute("boardList", board_array);
        //디서패처서블릿이 뷰 리졸버를 찾아서 연결해 줍니다
        //viewResolver
        //retrun getBoardList라는 문자열로 templates에 있는 같은 이름에 html파일을 찾는다
        return "getBoardList";
    }
//
//
    @GetMapping("/deleteBoard")
    public String deleteBoard(@RequestParam("seq") String seq) {
        System.out.println(seq);
        for (int i = 0; i < board_array.size(); i++) {
            if (Long.toString(board_array.get(i).getSeq()).equals(seq)) {
                board_array.remove(i);
            }
        }
        return "redirect:getBoardList";
    }
}
//
//}
