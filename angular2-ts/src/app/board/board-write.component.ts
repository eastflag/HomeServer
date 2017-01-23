import {Component, Input, Output, EventEmitter} from "@angular/core";
import {Board} from "./board";
import {Member} from "./member";
import {BoardService} from "./board.service";

@Component({
    moduleId: module.id,
    selector: 'board-write',
    templateUrl: 'board-write.component.html'
})
export class BoardWriteComponent {
    @Input() level: number;
    @Input() parent_id: number;
    @Output() refresh = new EventEmitter();

    title: string;
    content: string;

    constructor(private boardService: BoardService){}

    addBoard(): void {
        let board = new Board();
        board.title = this.title;
        board.content = this.content;
        board.level = this.level;
        board.parent_id = this.parent_id;
        //board.member.member_id = 1;
        let member = new Member();
        member.member_id = 1;
        board.member = member;
        console.log(board);
        console.log(JSON.stringify(board));

        this.boardService.addBoard(board)
            .then(res => {
                console.log(res);
                //게시판 목록 리프레쉬
                this.refresh.emit();
                //form 초기화
                this.title = null;
                this.content = null;
            })
            .catch();
    }
}
