import {Component, Input} from "@angular/core";
import {Board} from "./board";
/**
 * Created by eastflag on 2017-01-12.
 */

@Component({
    selector: 'board-detail',
    templateUrl: './app/board/board-detail.component.html'
})
export class BoardDetailComponent {
    @Input()
    board: Board;
}
