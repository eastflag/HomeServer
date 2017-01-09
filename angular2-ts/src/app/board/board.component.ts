import {Component, OnInit} from "@angular/core";
import {BoardService} from "./board.service";
import {Board} from "./Board";

@Component({
    selector: 'board',
    templateUrl: './app/board/board.component.html'
})
export class BoardComponent implements OnInit{

    boards: Board[];
    error: any;

    constructor(private boardService: BoardService) {}

    ngOnInit(): void {
        this.boardService.getBoardList()
            .then(boards => {
                this.boards = boards;
                console.log(boards);
            })
            .catch(error => this.error = error);
    }

}
