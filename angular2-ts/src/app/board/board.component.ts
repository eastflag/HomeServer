import {Component, OnInit} from "@angular/core";
import {BoardService} from "./board.service";
import {Board} from "./Board";

@Component({
    moduleId: module.id,
    selector: 'board',
    templateUrl: 'board.component.html',
    styleUrls: ['board.component.css']
})
export class BoardComponent implements OnInit{

    boards: Board[];
    error: any;
    selectedBoard: Board;

    constructor(private boardService: BoardService) {}

    ngOnInit(): void {
        this.getBoardList();
    }

    getBoardList(): void {
        this.boardService.getBoardList()
            .then(boards => {
                this.boards = boards;
            })
            .catch(error => this.error = error);
    }

    getBoard(board: Board): void {
        this.selectedBoard = board;
        this.boardService.getBoard(board.board_id)
            .then(board => {
                this.selectedBoard = board;
                console.log(board);
            })
            .catch(error => this.error = error);
    }

}
